CobiGen CLI is installed inside your devonfw distribution. In order to execute it follow the next steps:

1. Run console.bat, this will open a console.

2. Execute cobigen or cg and the man page should be printed.

3. Use a valid CobiGen input file and run cobigen generate <pathToInputFile>. Note: On the first execution of the CLI, CobiGen will download all the needed dependencies, please be patient.

A list of increments will be printed so that you can start the generation.

# Examples:
A selection of commands that you can use with the CLI:

1. cobigen generate foo\bar\EmployeeEntity.java: As no output path has been defined, CobiGen will try to find the pom.xml of the current project in order to set the generation root path.

2. cobigen generate foo\bar\*.java --out other\project: Will retrieve all the Java files on that input folder and generate the code on the path specified by --out.

3. cg g foo\bar\webServices.yml --increment TO: Performs a string search using TO and will print the closest increments

4. cg g foo\bar\webServices.yml -i 1,4,6: Directly generates increments with IDs 1, 4 and 6. CobiGen will not request you any other input.

5. cg a: Downloads the latest CobiGen_Templates and unpacks them next to the CLI. CobiGen will from now on use these unpacked Templates for generation.

6. cg a -cl C:\my\custom\location: Downloads the latest CobiGen_Templates and unpacks them in C:\my\custom\location. CobiGen will from now on use these unpacked Templates for generation.

# CLI update command
command is "cobigen update". In which you can select the plugins whichever you want to update.