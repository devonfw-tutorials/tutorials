CobiGen CLI is installed inside your devonfw distribution. In order to execute it follow the next steps:

1. Run console.bat, this will open a console. Here we will go inside the devonfw ide installation to execute the commands.

`cd root/devonfw`{{execute T1}}

2. Execute cobigen or cg and the man page should be printed. Main entry point of the CLI. If no arguments are passed, man page will be printed.

`cobigen`{{execute T1}}

3. Use a valid CobiGen input file and run cobigen generate <pathToInputFile>. Note: On the first execution of the CLI, CobiGen will download all the needed dependencies, please be patient.

A list of increments will be printed so that you can start the generation.

# CLI update command
command is "cobigen update". In which you can select the plugins whichever you want to update.

`cobigen update`{{execute T1}}