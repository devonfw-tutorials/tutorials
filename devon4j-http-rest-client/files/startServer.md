* Once, application builds successfully. Open new terminal by clicking "+" and wait for it to load.
* Now, Copy and execute below command to navigate into client server.
  `cd devonfw/workspaces/main/httprestclient/server`{{execute T1}}
* Now, Copy and execute below command to start the application.
  `devon mvn spring-boot:run`{{execute T1}}
To test Synchronous method, follow below steps.
* Click on "+" next to terminal tab
* Select "select port to view host"
* Enter the port number "8081" 
* In the url, append "/httprestclient/services/rest/devon4jrestclient/response/"
* Enter username as "admin" and password as "admin"
* You will be able to see response "Welcome to rest api"