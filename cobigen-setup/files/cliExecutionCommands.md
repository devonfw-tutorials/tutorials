CobiGen CLI is installed inside your devonfw distribution. In order to execute it follow the next steps:

1. Now, we have to go into the devonfw installation directory to execute the commands.

`cd devonfw`{{execute T1}}

2. To make the command available to terminal we first need to execute the below command to refresh bashrc file. So that terminal can recognize the command.

`. ~/.bashrc`{{execute T1}}

3.Execute cobigen or cg and the man page should be printed. Main entry point of the CLI. If no arguments are passed, man page will be printed.

`cobigen`{{execute T1}}

4. Use a valid CobiGen input file and run cobigen generate <pathToInputFile>. Note: On the first execution of the CLI, CobiGen will download all the needed dependencies, please be patient.

A list of increments will be printed so that you can start the generation.

# CLI update command
command is "cobigen update". In which you can select the plugins whichever you want to update.

`cobigen update`{{execute T1}}