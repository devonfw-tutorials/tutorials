Finally, test the REST service.

Open a new terminal and type in the following command to make a POST request and create a new pet:

curl -X POST -H "Content-Type: application/json" -d '{"name": "Alex", "tag": "Dog"}' http://localhost:8080/pets

After executing the command, there should be a pet stored in the list.
Let's check this by getting the entire list using the `listPets` method of the REST service.

Open https://[[HOST_SUBDOMAIN]]-8080-[[KATACODA_HOST]].environments.katacoda.com/pets in the browser and see if the pet has been saved.
