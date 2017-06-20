# backbaseTest

This is a simple secured API which returns a filtered list of ING ATMs. The filter is applied by City.

API: {server:port}/atms/{city}

The REST Endpoint is secured by Spring Security and so you would require a username/password to access the endpoint.
username is "admin"
password is "secret"
These are defined in the application.properties file and are used by Spring Security to verfiy the call.

The solution was pretty straight forward. I used Spring Initiliazr to create the basic project structure which
had dependencies of Web and Security. Thus I started making a Spring Boot application. I defined the Model classes, Controllers,
Service and DAOs. For external API call I used OkHttp3 and to parse JSON I user GSON.

Tools used:
Eclipse
Maven
SpringBoot
SpringSecurity
SpringWeb
GSON
OkHttp3

