Spring Boot demo for multimodule maven projects.
=====

child projects contains the following modules (from the bottom of the dependency chain up):

1. domain (persistent domain objects -- JPA etc)
2. service (service layer)
3. web (web & rest layer)

##system requirement##

1. java 8+
2. maven 3+

##how to run:##

1. execute: `mvn install` in command line at parent module
2. execute: `mvn spring-boot:run` in muti-module-web module
3. check by accss url `http://localhost:8080/city/get?name=`
4. run junit test with cobertura , execute `cobertruaTest.sh`

## feature ##

1. spring-boot with multiple modules
2. use cobertura in spring-boot