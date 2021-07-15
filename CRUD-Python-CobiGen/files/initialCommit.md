In order to upload the table declared in our "Model.py" we need a migration script. This command requires an attached message whenever it runs, for instance:

`flask db migrate -m` "`first migration`"

In this case, the terminal should print in return `Detected added table user`, among others. We can now upload the migration script.