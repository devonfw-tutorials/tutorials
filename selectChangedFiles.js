const path = require("path");
const { Octokit } = require("@octokit/core");
const octokit = new Octokit({ auth: process.env.GITHUB_TOKEN });

async function selectChangedFiles() {
    let pr = process.env.PR_NUMBER;
    let arr = [];
    try {
        let get = await octokit.request('GET /repos/{owner}/{repo}/pulls/{pull_number}/files', {
            owner: 'devonfw-tutorials',
            repo: 'tutorials',
            pull_number: pr
        });
        let files = get.data;
        for(let i = 0; i < files.length; i++) {
            let changedTutorial = files[i].filename.substring(0, files[i].filename.indexOf("/"));
            if(!arr.includes(changedTutorial)) {
                arr.push(changedTutorial);
            }
            
        }
    } catch(e) {
        console.error(e);
    }
    return arr;
}

selectChangedFiles();

