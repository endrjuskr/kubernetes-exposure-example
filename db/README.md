## Usage

* Building image

```
    docker build -t endrjuskr/fancy-db:latest .
```

* Run image in background

```
    docker run -d --rm --name fancy-db endrjuskr/fancy-db:latest
```

* Run image in background with exposing port

```
    docker run -d --rm --name fancy-db -p 5432:5432 endrjuskr/fancy-db:latest
```

* Push image

```
    docker push endrjuskr/fancy-db:latest
```