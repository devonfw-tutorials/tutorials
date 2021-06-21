
Now open the folder containing the .yml input on Visual Studio, for instance. Observe that Cobigen has generated and named the five files mentioned above. We are now set to run the application.

The safest way to install the required packages is to do so locally, by setting up a virtual environment. 
Open the integrated terminal. You might need to install the "virtualenv" package if you haven't already:

`python -m pip install virtualenv`

Create your virtual environment. Name it "venv", for instance:
python -m virtualenv venv`

You should now see a new "venv" folder in your package explorer. On Windows, activate the virtual environment by running:

`.\venv\Scripts\activate`

To check whether the virtual environment activated properly make sure the terminal is printing "(venv)", followed by your directory.

We can now install the required packages safely. Run:

`pip install -r requirements.txt`

If any packages failed to install automatically, try to do so manually. 