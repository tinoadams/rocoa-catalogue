Shop Catalogue Service
===========================

XXXXXXXXXXXXXXXXXXXX

Pre-requisite is that SBT (http://www.scala-sbt.org/release/tutorial/Setup.html) must be installed on your computer.

## Build & Run ##

```sh
$ sbt run
```

## Package & Run ##

```sh
$ sbt assembly
$ java -jar target/scala-2.11/ProductCatalogue-assembly-0.1.0-SNAPSHOT.jar
```

## Swagger API docs ##

Open your browser to http://petstore.swagger.wordnik.com/, and you'll see the default Swagger demo application - a Pet Store - and you'll be able to browse its documentation. 

Paste http://localhost:8080/api-docs/resources.json - into the URL field, no api_key required, then press the "Explore" button. You'll see a Swaggerized view of the API documentation for this service.
