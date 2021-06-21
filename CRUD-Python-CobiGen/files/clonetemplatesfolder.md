### CobiGen_Templates

The templates folder is typically found at:

`C:\Users\[yourName]\.cobigen\templates\CobiGen_Templates\src\main\templates`

Open the command line in this location and clone the `CRUD-openapi-python` project using:

`git clone https://github.com/devonfw-forge/cobigen-python-templates.git`

You should now find the `CRUD-openapi-python` folder in your templates directory. Let&#39;s briefly explore its contents:

* `templates.xml`: a file for code generation purposes detailing the increments that will be available for selection from the CobiGen CLI.
* templates: the folder containing the basic application structure including all the files that will be generated.
   * `requirements.txt`: a list of all packages required to run the application and the database. Encoded in UTF-8.
   * `config.py`: declares the `Config` class which represents the Flask-SQLAlchemy database configuration.
   * app:
      * `__init__.py.ftl`: FreeMarker template declaring the application and the database.
      * `${variables.entityName#cap_first}Model.py.ftl`: FreeMarker template declarating the table with the entity's attributes as columns
      * `${variables.entityName#cap_first}Routes.py.ftl`: FreeMarker template declaring the service returning JSON objects for the GET, POST, PUT and DELETE methods.
