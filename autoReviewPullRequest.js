const child_process = require("child_process");
const https = require("https");
const path = require("path");
const fs = require("fs");
const pegjs = require("pegjs");
const rimraf = require("rimraf");

const options = {
    port: 443,
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'User-Agent': 'action'
    }
}

const parserDefinition = 
`
start
  = headline
    description
    step+

headline
  = "=" _ string ___
  
description
  = "====" ___
    descriptionlines
  	"====" ___ 

descriptionlines
  = descriptionline+ { return { "descriptionlines": text()}; }
  
descriptionline
  = !"====" string __ 
  
step
  = (
      "====" ___
      stepinner
      steptextafterlines
      "====" __
    )
  / stepinner
  
stepinner
  = steptextlines?
    "[step]" ___
    stepstitle?
    "--" ___
    steplines
    "--" __

stepstitle
  = "==" _ string __

steptextlines
  = steptextline* { return { "steptextlines": text()}; }

steptextline
  = !"[step]" string __
  
steptextafterlines
  = steptextafterline* { return { "steptextafterlines": text()}; }

steptextafterline
  = !"====" string __
 
steplines
  = stepline+ { return { "steplines": text()}; }
  
stepline
  = !"--" string __

string "string"
  = [^\r\n]+ { return text(); }

_ "whitespace"
  = [ \t]*
 
__ "linebreak"
  = [ \t\n\r]*
  
___ "linebreak"
  = [ \t\n\r]+
`

let requestChangeMessage = "";

async function autoReviewPullRequest() {
    let env = process.env;
    let pr = env.PR_NUMBER;

    try {
        let files = JSON.parse(await getJson("https://api.github.com/repos/devonfw-tutorials/tutorials/pulls/" + pr + "/files"));
        console.log(files);
        for(let i = 0; i < files.length; i++) {
            if(path.basename(files[i].filename) == "index.asciidoc") {
                let contents = JSON.parse(await getJson(files[i].contents_url));
                console.log(contents);
                if(contents.download_url) {
                    let playbook = downloadFile(contents.download_url);
                    if(!playbook || playbook == "") {
                        throw new Error("Unable to download file from " + contents.download_url); 
                    }

                    parseFile(playbook);
                    rimraf.sync(playbook);
                }
            }
        }
    } catch(e) {
        console.error(e);
        process.env["REQUEST_CHANGE_MESSAGE"] = requestChangeMessage;
        return -1;
    }

    process.env["REQUEST_CHANGE_MESSAGE"] = requestChangeMessage;
    return 0;
}

async function getJson(url) {
    return new Promise((resolve, reject) => {
        https.get(url, options, function(resp) {
            if(resp.statusCode != 200) {
                console.log(resp);
            }

            let json = "";
            resp.on("data", (data) => {
                json += data;
            });

            resp.on('end', () => {
                resolve(json);
            });
        });
    });
}

function downloadFile(url) {
    let cp = child_process.spawnSync(`curl -o index.asciidoc ${url}`, { shell: true, encoding: 'utf-8' });
    if(!fs.existsSync(path.join(__dirname, "index.asciidoc"))) {
        console.log(cp);
        return "";
    }
    return path.join(__dirname, "index.asciidoc");
}

function parseFile(file) {
    let def = fs.readFileSync(path.join(__dirname,"parser.def"), 'utf8');
    let parser = pegjs.generate(def);
    let input = fs.readFileSync(file, 'utf8');
    let parseResult = parser.parse(input);

    let description = parseResult[1][2].descriptionlines;
    console.log(description);
    
    requestChangeMessage = (requestChangeMessage == "")
        ? "The tutorial description in file " + file + " does not meet the desired requirements."
        : requestChangeMessage += "\n"
}

autoReviewPullRequest();