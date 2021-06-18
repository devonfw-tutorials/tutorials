const core = require("@actions/core");
const { Octokit } = require("@octokit/core");
const octokit = new Octokit({ auth: process.env.GITHUB_TOKEN });

async function getPlaybookCheckout() {
    let pr = process.env.PR_NUMBER;
    let ref ="";
    try {
        let get = await octokit.request('GET /repos/{owner}/{repo}/pulls/{pull_number}', {
            owner: 'devonfw-tutorials',
            repo: 'tutorials',
            pull_number: pr
        });
        head = get.data.head;
    } catch(e) {
        throw e;
    }
    core.info(`ref: ${head.ref}`);
    core.setOutput('ref', head.ref);
    core.info(`name : ${head.user.login}`);
    core.setOutput('name', head.user.login);
}

getPlaybookCheckout().catch(err => {
    console.log(err);
    process.exit(1); 
});

