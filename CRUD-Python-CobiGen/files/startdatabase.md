

Let's initialize the database now by running:

`flask db init`

This should create the `migrations` folder and the respective `__pycache__` folders in your directory. 

In order to upload the table declared in our "Model.py" we need a migration script. This command requires an attached message whenever it runs, for instance:

`flask db migrate -m 'first migration'`

In this case, the terminal should print in return `Detected added table user`, among others.

We can now upload the migration script by running:

`flask db upgrade`

This way our database is all set up. 