We shall now return to:

`C:\Users\[yourName]\.cobigen\templates\CobiGen_Templates\src\main\templates`

Inspect the `context.xml` file. For code generation purposes, this lists a trigger for each template folder available to CobiGen. 

We need to edit this file by adding another trigger referring to our new `CRUD-openapi-python` folder. On Visual Studio, for instance, paste at the top of the list:

```
<trigger id="crud_openapi_python" type="openapi" templateFolder="crud_openapi_python">
    <containerMatcher type="element" value="openAPIFile"/>
    <matcher type="element" value="EntityDef">
      <variableAssignment type="extension" key="rootPackage" value="x-rootpackage"/>
      <variableAssignment type="property" key="component" value="componentName"/>
      <variableAssignment type="property" key="entityName" value="name"/>
    </matcher>
</trigger>
```
