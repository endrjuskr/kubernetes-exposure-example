## Usage

* Building image

```
    ./gradlew docker
```

* Run image in background (you need to provide database connection, take a look at `docker-compose.yml` in root folder)

```
    docker run -d --rm --name fancy-api endrjuskr/fancy-api:latest
```

* Run image in background with exposing port (you need to provide database connection, take a look at `docker-compose.yml` in root folder)

```
    docker run -d --rm --name fancy-api -p 8080:8080 endrjuskr/fancy-api:latest
```

* Push image

```
    docker push endrjuskr/fancy-api:latest
```