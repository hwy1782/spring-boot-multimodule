Spring Boot demo for multimodule maven projects.
=====

child projects contains the following modules (from the bottom of the dependency chain up):

 1. domain (persistent domain objects -- JPA etc)
 2. service (service layer)
 3. web (web & rest layer)


##how to run:##

 1. execute: 'mvn install' in command line at parent module
 2. execute: 'mvn spring-boot:run' in muti-module-web module
 3. check by accss url 'http://localhost:8080/city/get?name='