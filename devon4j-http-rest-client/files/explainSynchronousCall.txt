* As you can see synchronous invocation of a service is very simple and type-safe. The actual call of showResponse will technically call the remote service(i.e. VisitormanagementRestService) over the wire ( via HTTP) including marshaling the arguments (converting String to JSON) and un-marshalling the result (e.g. converting the received JSON to String).
* Here in Devon4jRestClientImpl, there is a method "callSynchronous" which will call the VisitormanagementRestService and return the object of VisitormanagementRestService to visitormanagementRestService.

* With visitormanagementRestService, it is calling the method "returnResponseToClient(String)" of server.

* The response from server will be stored in "resultFromAPICall" as the return type of result is String.
