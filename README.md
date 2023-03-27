# restful

## Le Web service Rest
https://github.com/charroux/restful/blob/main/src/main/java/com/example/restful/RestWebService.java

## Compilation

Sous Linux :
```
./gradlew build
```

## Lancement

Sous Linux :
```
java -jar build/libs/restful-0.0.1-SNAPSHOT.jar 
```

## Vérification du fonctionnement

Dans un navigateur: http://localhost:8080/cars

Via une commande :
```
curl --header "Content-Type: application/json" --request POST --data '{"plateNumber":"AA11BB"}' http://localhost:8080/cars
```# restful
