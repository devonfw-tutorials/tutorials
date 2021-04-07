* [generate, g]: Command used for code generation.
To know more about implementation of this command you can follow https://katacoda.com/devonfw/scenarios/cobigen. Here we have shown the implementation "generate" command for further code generation.

* [adapt-templates, a]: Generates a new templates folder next to the cobigen cli and stores its location    inside  a configuration file. After executing this command, the CLI will attempt to use the specified Templates folder.

`cobigen a`{{execute T1}}

{
   what it will do: Downloads the latest CobiGen_Templates and unpacks them next to the CLI. CobiGen will from now on use these unpacked Templates for generation.
}
    - < --custom-location, -cl > : Allows the user to choose an absolute file path to a custom location where the CobiGen Templates should be stored and read from.

`cobigen a -cl C:\my\custom\location`{{execute T1}}

{
   what it will do: Downloads the latest CobiGen_Templates and unpacks them in C:\my\custom\location. CobiGen will from now on use these unpacked Templates for generation.
}

To get more information about rest of all the command visit on https://devonfw.com/website/pages/docs/master-cobigen.asciidoc_cobigen-cli.html