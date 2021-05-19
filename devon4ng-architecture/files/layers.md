The architecture describes two layers:

* [Components Layer](https://devonfw.com/website/pages/docs/master-devon4ng.asciidoc_layers.html#components-layer.asciidoc) encapsulates components which present the current application state. Components are separated into [Smart and Dumb Components](https://devonfw.com/website/pages/docs/master-devon4ng.asciidoc_layers.html#components-layer.asciidoc_smart-and-dumb-components). The only logic present is view logic inside Smart Components.

* [Services Layer](https://devonfw.com/website/pages/docs/master-devon4ng.asciidoc_layers.html#services-layer.asciidoc) is more or less what we call 'business logic layer' on the server side. The layer defines the applications state, the transitions between state and classic business logic. Stores contain application state over time to which Smart Components subscribe to. Adapters are used to perform XHRs, WebSocket connections, etc. The business model is described inside the module. Use case services perform business logic needed for use cases. A use case services interacts with the store and adapters. Methods of use case services are the API for Smart Components. Those methods are Actions in reactive terminology.