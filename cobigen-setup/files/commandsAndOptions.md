* cobigen, cg: Main entry point of the CLI. If no arguments are passed, man page will be printed.

`cd tutorial-compiler`{{execute T1}}


* [generate, g]: Command used for code generation.

`cobigen generate foo\bar\EmployeeEntity.java`{{execute T1}}

{
   what it will do:  As no output path has been defined, CobiGen will try to find the pom.xml of the current project in order to set the generation root path.
}
   - < --increment, -i > : Specifies an increment ID to be generated. You can also search increments by name and CobiGen will output the resultant list. If an exact match found, code generation will happen.

`cg g foo\bar\webServices.yml --increment TO`{{execute T1}}

{
   what it will do: Performs a string search using TO and will print the closest increments
}
   - < --outputRootPath, -out >: The project file path in which you want to generate your code. If no output path is given, CobiGen will use the project of your input file.

`cobigen generate foo\bar\*.java --out other\project`{{execute T1}}

{
   what it will do: Will retrieve all the Java files on that input folder and generate the code on the path specified by --out.
}

* [adapt-templates, a]: Generates a new templates folder next to the cobigen cli and stores its location    inside  a configuration file. After executing this command, the CLI will attempt to use the specified Templates folder.

`cg a`{{execute T1}}

{
   what it will do: Downloads the latest CobiGen_Templates and unpacks them next to the CLI. CobiGen will from now on use these unpacked Templates for generation.
}
    - < --custom-location, -cl > : Allows the user to choose an absolute file path to a custom location where the CobiGen Templates should be stored and read from.

`cg a -cl C:\my\custom\location`{{execute T1}}

{
   what it will do: Downloads the latest CobiGen_Templates and unpacks them in C:\my\custom\location. CobiGen will from now on use these unpacked Templates for generation.
}

To get more information about rest of all the command visit on https://devonfw.com/website/pages/docs/master-cobigen.asciidoc_cobigen-cli.html