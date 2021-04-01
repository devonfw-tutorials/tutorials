const child_process = require('child_process');

async function autoReviewPullRequest() {
    let cp = child_process.spawnSync("ls -R", { shell: true, encoding: 'utf-8' });
    console.log(cp);

    let cp = child_process.spawnSync("env", { shell: true, encoding: 'utf-8' });
    console.log(cp);
}

autoReviewPullRequest();