# spring-boot-rest-lombok-demo
Minimal demo application build with spring-boot-data-rest and Lombok


Exposes a single resource under:
```
http://localhost:8080/messages
```
# Heroku Link

https://spring-boot-rest-lombok-demo.herokuapp.com/

# Deployment to PCF

To deploy the app to Pivotal Cloud Foundry, you need to have Maven and the PCF CLI installed on your machine.

Check out the app and run the following maven command in your command line from the root folder:
```
mvn package cf:login cf:push
```
You will need to put your PCF login credentials under ~/.m2/settings.xml.

The application is available under:
```
http://spring-rest-lombok.cfapps.io/messages
```
