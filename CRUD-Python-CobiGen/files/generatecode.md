Now open the command line at your project folder. You can check whether the CobiGen CLI is properly set up by running `devon cobigen`.

Let's generate the code now. Type:

`cobigen generate user.yml`


If the command is not working properly you might want to run `cobigen update` or `cobigen adapt-templates` first. 

Otherwise the command line should return a full list of the available increments. 

Assuming that the "context.xml" and "templates.xml" files were properly set up, this should include the "CRUD Python Flask" option. Select this option. The command line should print out "Successful generation" shortly.
