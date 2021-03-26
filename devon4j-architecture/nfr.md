
![Technical Reference Architecture](https://devonfw.com/website/pages/docs/images/T-Architecture.svg)

We reflect this architecture in our code as described in our [coding conventions](https://github.com/devonfw/devon4j/blob/master/documentation/coding-conventions.asciidoc#packages) allowing a traceability of business components, use-cases, layers, etc. into the code and giving
developers a sound orientation within the project.

Further, the architecture diagram shows the allowed dependencies illustrated by the dark green connectors.
Within a business component a component part can call the next component part on the layer directly below via a dependency on its API (vertical connectors).
While this is natural and obvious, it is generally forbidden to have dependencies upwards the layers
or to skip a layer by a direct dependency on a component part two or more layers below.
The general dependencies allowed between business components are defined by the [business architecture](https://github.com/devonfw/devon4j/blob/master/documentation/architecture.asciidoc#business-architecture).
In our reference architecture diagram we assume that the business component `A1` is allowed to depend
on component `A2`. Therefore, a use-case within the logic component part of `A1` is allowed to call a
use-case from `A2` via a dependency on the component API. The same applies for dialogs on the client layer.
This is illustrated by the horizontal connectors. Please note that [persistence entities](https://github.com/devonfw/devon4j/blob/master/documentation/guide-jpa.asciidoc#entity) are part of the API of the data-access component part so only the logic component part of the same
business component may depend on them.

The technical architecture has to address non-functional requirements:

* *scalability* 
is established by keeping state in the client and making the server state-less (except for login session). Via load-balancers new server nodes can be added to improve performance (horizontal scaling).
* *availability* and *reliability* 
are addressed by clustering with redundant nodes avoiding any single-point-of failure. If one node fails the system is still available. Further, the software has to be robust so there are no dead-locks or other bad effects that can make the system unavailable or not reliable.
* *security* 
is archived in the devonfw by the right templates and best-practices that avoid vulnerabilities. See [security guidelines](https://github.com/devonfw/devon4j/blob/master/documentation/guide-security.asciidoc) for further details.
* *performance* 
is obtained by choosing the right products and proper configurations. While the actual implementation of the application matters for performance a proper design is important as it is the key to allow performance-optimizations (see e.g. [caching](https://github.com/devonfw/devon4j/blob/master/documentation/guide-caching.asciidoc)).