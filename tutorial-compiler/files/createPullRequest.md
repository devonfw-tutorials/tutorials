Before starting write content into the tutorial, you have to create a pull request from your newly created branch into the main repository.
This has the advantage that your tutorial will automatically be build and pushed to https://katacoda.com/devonfw-dev. So you can directly check it out.

For this step you need to open you local terminal at your forked and cloned 'tutorials' folder and run the following commands:
1. 'git add .' 
2. 'git commit -m "initial commit for tutorial myTutorial"'
3. 'git push'

This will save all the changes and push them into your tutorials GitHub repository. 

Switch to your browser and open:
https://github.com/devonfw-tutorials/tutorials

Click on 'Pull requests' > 'New pull request'.

![pull_request.jpg](./assets/pull_request.jpg)

You might have to click on 'compare across forks'.

![compare.jpg](./assets/compare.jpg)

Select

    * base repository: devonfw-tutorials
    * base: main
    * head repository: [your username]/tutorials
    * compare: '[your branch name]'

and finally create the pull request by clicking on 'Create pull request'.

Write 'WIP:' in front of the pull request title to show that you are still working on this pull request. 'WIP' stands for 'Work In Progress'.

A workflow in the tutorials repository will build the tutorial. Currently the pipeline will fails because a tutorial must contain at least a title, a description and one step.

Let's fix that and fill the tutorial.