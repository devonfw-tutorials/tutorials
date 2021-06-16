const core = require("@actions/core");
const { Octokit } = require("@octokit/core");
const octokit = new Octokit({ auth: process.env.GITHUB_TOKEN });

async function getHeadRef() {
    let pr = process.env.PR_NUMBER;
    let ref ="";
    try {
        let get = await octokit.request('GET /repos/{owner}/{repo}/pulls/{pull_number}', {
            owner: 'devonfw-tutorials',
            repo: 'tutorials',
            pull_number: pr
        });
        ref = get.data.head.ref;
    } catch(e) {
        throw e;
    }
    core.info(`Head Ref: ${ref}`);
    core.setOutput('head_ref', ref);
}

getHeadRef().catch(err => {
    console.log(err);
    process.exit(1); 
});

