### Application Architecture

For the architecture of an application we distinguish the following views:

* The [Business Architecture](https://github.com/devonfw/devon4j/blob/master/documentation/architecture.asciidoc#business-architecture) describes an application from the business perspective. It divides the application into business components and with full abstraction of technical aspects.
* The [Technical Architecture](https://github.com/devonfw/devon4j/blob/master/documentation/architecture.asciidoc#technical-architecture) describes an application from the technical implementation perspective. It divides the application into technical layers and defines which technical products and frameworks are used to support these layers.
* The Infrastructure Architecture describes an application from the operational infrastructure perspective. It defines the nodes used to run the application including clustering, load-balancing and networking. This view is not explored further in this guide.

### Business Architecture
The _business architecture_ divides the application into _business components_. A business component has a well-defined responsibility that it encapsulates. All aspects related to that responsibility have to be implemented within that business component. Further, the business architecture defines the dependencies between the business components. These dependencies need to be free of cycles. A business component exports its functionality via well-defined interfaces as a self-contained API. A business component may use another business component via its API and compliant with the dependencies defined by the business architecture.

As the business domain and logic of an application can be totally different, the devonfw can not define a standardized business architecture. Depending on the business domain it has to be defined from scratch or from a domain reference architecture template. For very small systems it may be suitable to define just a single business component containing all the code.

### Technical Architecture
The _technical architecture_ divides the application into technical _layers_ based on the [multilayered architecture](http://en.wikipedia.org/wiki/Multilayered_architecture). A layer is a unit of code with the same category such as a service or presentation logic. So, a layer is often supported by a technical framework. Each business component can therefore be split into _component parts_ for each layer. However, a business component may not have component parts for every layer (e.g. only a presentation part that utilized logic from other components).

An overview of the technical reference architecture of the devonfw is given by figure ["Technical Reference Architecture"](https://github.com/devonfw/devon4j/blob/master/documentation/architecture.asciidoc#img-t-architecture).
It defines the following layers visualized as horizontal boxes:

* [client layer](https://github.com/devonfw/devon4j/blob/master/documentation/guide-client-layer.asciidoc) for the front-end (GUI).
* [service layer](https://github.com/devonfw/devon4j/blob/master/documentation/guide-service-layer.asciidoc) for the services used to expose functionality of the
back-end to the client or other consumers.
* [batch layer](https://github.com/devonfw/devon4j/blob/master/documentation/guide-batch-layer.asciidoc) for exposing functionality in batch-processes (e.g. mass imports).
* [logic layer](https://github.com/devonfw/devon4j/blob/master/documentation/guide-logic-layer.asciidoc) for the business logic.
* [data-access layer](https://github.com/devonfw/devon4j/blob/master/documentation/guide-dataaccess-layer.asciidoc) for the data access (esp. persistence).

Also, you can see the (business) components as vertical boxes (e.g. _A_ and _X_) and how they are composed out of component parts each one assigned to one of the technical layers.

Further, there are technical components for cross-cutting aspects grouped by the gray box on the left. Here is a complete list:

* [Security](https://github.com/devonfw/devon4j/blob/master/documentation/guide-security.asciidoc)
* [Logging](https://github.com/devonfw/devon4j/blob/master/documentation/guide-logging.asciidoc)
* [Monitoring](https://github.com/devonfw/devon4j/blob/master/documentation/guide-monitoring.asciidoc)
* [Transaction-Handling](https://github.com/devonfw/devon4j/blob/master/documentation/guide-transactions.asciidoc)
* [Exception-Handling](https://github.com/devonfw/devon4j/blob/master/documentation/guide-exceptions.asciidoc)
* [Internationalization](https://github.com/devonfw/devon4j/blob/master/documentation/guide-i18n.asciidoc)
* [Dependency-Injection](https://github.com/devonfw/devon4j/blob/master/documentation/guide-dependency-injection.asciidoc)