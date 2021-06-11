const core = require("@actions/core");
const { Octokit } = require("@octokit/core");
const octokit = new Octokit({ auth: process.env.GITHUB_TOKEN });

async function selectChangedFiles() {
    let pr = process.env.PR_NUMBER;
    let arr = [];
    try {
        let get = await octokit.request('GET /repos/{owner}/{repo}/pulls/{pull_number}/files', {
            //owner: 'devonfw-tutorials',
            owner: 'MarcelDiessner',
            repo: 'tutorials',
            pull_number: 41
        });
        let files = get.data;
        files.forEach(file => {
            arr.push(file.filename)
        });
        console.log(arr);
    } catch(e) {
        throw e;
    }
    let output = arr.join(' ');
    console.log(output);
    core.info(`Changed Files: ${output}`);
    core.setOutput('changedFiles', output);
}

selectChangedFiles().catch(err => {
    console.log(err);
    process.exit(1); 
});

