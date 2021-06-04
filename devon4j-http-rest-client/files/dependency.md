Since in this tutorial you will build client on Synchronous call so, you have to add dependency for synchronous consuming REST services via Apache CXF (Java8+)
<!-- Starter for asynchronous consuming REST services via Jaca HTTP Client (Java11+) -->
<dependency>
  <groupId>com.devonfw.java.starters</groupId>
  <artifactId>devon4j-starter-http-client-rest-async</artifactId>
</dependency>
<!-- Starter for synchronous consuming REST services via Apache CXF (Java8+) -->
<dependency>
  <groupId>com.devonfw.java.starters</groupId>
  <artifactId>devon4j-starter-cxf-client-rest</artifactId>
</dependency>
<!-- Starter for synchronous consuming SOAP services via Apache CXF (Java8+) -->
<dependency>
  <groupId>com.devonfw.java.starters</groupId>
  <artifactId>devon4j-starter-cxf-client-ws</artifactId>
</dependency>
,
Note: With devonfw we have already added the required dependency.