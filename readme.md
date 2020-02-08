

### Build submit
From project root:
```sh
docker build -t emragins/spark-submit:latest -f .\submit.Dockerfile .
```

### Run submit
```sh
docker run --rm -it --network spark_network emragins/spark-submit:latest /bin/sh
```

If spark network started with `docker-compose`, assumes directory name is `apache-spark-learning`:
```sh
docker run --rm -it --network docker_spark-network emragins/spark-submit:latest /bin/sh
```


### From inside
```sh
/spark/bin/spark-submit --master spark://spark-master:7077 /usr/src/app/raginsspark_2.11-1.0.jar
```

