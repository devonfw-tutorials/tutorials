You can switch to the IDE tab to checkout the files of the application you just cloned.

* In the `CoreModule`, you can see services like `TranslocoRootModule` (translation service), `HttpRequestInterceptorService` (HTTP interceptor sesrvice) and Angular Material related modules being part of this core module. This core module is then imported into every other module as the services are used throughout the application.

* In the file `LayoutModule`, you can see components like `NavBar` and `Header` being part of this module. This module is comparable to a **shared** module which holds common components used throughout the application. The shared module is imported into other (feature) modules where the common components will be used.

You can study in more detail about Angular architecture by following [this document](https://devonfw.com/website/pages/docs/master-devon4ng.asciidoc_architecture.html#meta-architecture.asciidoc_devonfw-reference-client-architecture).
