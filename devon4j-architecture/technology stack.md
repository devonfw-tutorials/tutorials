### Technology Stack

The technology stack of the devonfw is illustrated by the following table.

Technology Stack of devonfw

|*Topic*|*Detail*|*Standard*|*Suggested implementation*|
| ----------- | ----------- |----------- | ----------- |
|runtime|language & VM|Java|Oracle JDK|
|runtime|servlet-container|JEE|[tomcat](http://tomcat.apache.org/)|
|[component management](https://github.com/devonfw/devon4j/blob/master/documentation/guide-dependency-injection.asciidoc)|dependency injection|[JSR330](https://jcp.org/en/jsr/detail?id=330) & [JSR250](https://jcp.org/en/jsr/detail?id=250)|[spring](http://spring.io/)|
|[configuration](https://github.com/devonfw/devon4j/blob/master/documentation/guide-configuration.asciidoc)|framework|-|[spring-boot](http://projects.spring.io/spring-boot/)|
|[persistence](https://github.com/devonfw/devon4j/blob/master/documentation/guide-dataaccess-layer.asciidoc)|OR-mapper|[JPA](http://www.oracle.com/technetwork/java/javaee/tech/persistence-jsp-140049.html) | [hibernate](http://hibernate.org/orm/)|
|[batch](https://github.com/devonfw/devon4j/blob/master/documentation/guide-batch-layer.asciidoc)|framework|[JSR352](https://jcp.org/en/jsr/detail?id=352)|[spring-batch](http://projects.spring.io/spring-batch/)|
|[service](https://github.com/devonfw/devon4j/blob/master/documentation/guide-service-layer.asciidoc)|[SOAP services](https://github.com/devonfw/devon4j/blob/master/documentation/guide-service-layer.asciidoc#soap)|[JAX-WS](https://jcp.org/en/jsr/detail?id=224)|[CXF](http://cxf.apache.org/)|
|[service](https://github.com/devonfw/devon4j/blob/master/documentation/guide-service-layer.asciidoc)|[REST services](https://github.com/devonfw/devon4j/blob/master/documentation/guide-service-layer.asciidoc#rest)|[JAX-RS](https://jax-rs-spec.java.net/)| [CXF](http://cxf.apache.org/)|
|[logging](https://github.com/devonfw/devon4j/blob/master/documentation/guide-logging.asciidoc)|framework|[slf4j](http://www.slf4j.org/)|[logback](http://logback.qos.ch/)|
|[validation](https://github.com/devonfw/devon4j/blob/master/documentation/guide-validation.asciidoc)|framework|[beanvalidation/JSR303](http://beanvalidation.org/)|[hibernate-validator](http://hibernate.org/validator/)|
|[security](https://github.com/devonfw/devon4j/blob/master/documentation/guide-security.asciidoc)|Authentication & Authorization|[JAAS](http://www.oracle.com/technetwork/java/javase/jaas/index.html)|[spring-security](http://projects.spring.io/spring-security/)|
|[monitoring](https://github.com/devonfw/devon4j/blob/master/documentation/guide-monitoring.asciidoc)|framework|[JMX](http://www.oracle.com/technetwork/java/javase/tech/javamanagement-140525.html)|[spring](http://spring.io/)|
|[monitoring](https://github.com/devonfw/devon4j/blob/master/documentation/guide-monitoring.asciidoc)|HTTP Bridge|HTTP & JSON|[jolokia](http://www.jolokia.org)|
|[AOP](https://github.com/devonfw/devon4j/blob/master/documentation/guide-aop.asciidoc)|framework|[dynamic proxies](http://docs.oracle.com/javase/7/docs/api/java/lang/reflect/Proxy.html)|[spring AOP](http://docs.spring.io/autorepo/docs/spring/3.0.6.RELEASE/spring-framework-reference/html/aop.html)|