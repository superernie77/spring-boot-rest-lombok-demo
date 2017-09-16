# spring-boot-rest-lombok-demo
Minimal demo application build with spring-boot-data-rest and Lombok

Exposes a single resource under:
```
http://localhost:8080/messages
```


# Deployment to PCF

To deploy the app to Pivotal Cloud Foundry, you need to have Maven and the PCF CLI installed on your machine.

Check out the app and run the following maven command in your command line:
```
mvn install
```
After the build is finished run the following PCF command
```
cf push
```
