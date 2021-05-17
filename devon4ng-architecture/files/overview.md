

When using Angular, the web client architecture is driven by the framework in a certain way Google and the Angular community think about web client architecture. Angular gives an opinion on how to look at architecture. It is component based like devon4j but uses different terms which are common language in web application development. The important term is module which is used instead of component. The primary reason is the naming collision with the Web Components standard.
To clarify this:

* A component describes an UI element containing HTML, CSS and JavaScript - structure, design and logic encapsulated inside a reusable container called component.

* A module describes an applications feature area. The application flight-app may have a module called booking.

An application developed using Angular consists of multiple modules. There are feature modules and special modules described by the Angular Styleguide - core and shared. Angular or Angular Styleguide give no guidance on how to structure a module internally. This is where this architecture comes in.
