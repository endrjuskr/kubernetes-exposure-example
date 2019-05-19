# Kubernetes Exposure Example

Please go to (blog post)[https://engineerable.dev/kubernetes-avoid-load-balancer] to get more context.

Projects contains following parts:
* `api` - code for building API
* `db` - code for building database
* `kubernetes` - code related to kubernetes deployment

To run locally

``` bash
> cd kubernetes-exposure-example
> docker-compose up -d
> curl http://localhost:8080/check
Everything is all right
```