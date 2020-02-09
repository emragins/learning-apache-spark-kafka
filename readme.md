

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

## Find excluded TCP Ports
https://github.com/docker/for-win/issues/3171
```ps
 netsh interface ipv4 show excludedportrange protocol=tcp
```

`netsh int ipv4 set dynamic tcp start=49152 num=1638` can supposedly magically fix the stupid ports.
`reg add HKLM\SYSTEM\CurrentControlSet\Services\hns\State /v EnableExcludedPortRange /d 0 /f` for ood measure.

Requires restart... and somehow excluded ports are sane again.

## Enable running commands against docker in windows linux subsystem (wsl) / bash

(https://forums.docker.com/t/cannot-connect-to-the-docker-daemon-at-unix-var-run-docker-sock-is-the-docker-daemon-running/43371/3)
```sh
#Requires "Expose daemon on tcp://localhost:2375 without TLS" setting enabled in Docker Desktop
echo "export DOCKER_HOST='tcp://0.0.0.0:2375'" >> ~/.bashrc
source ~/.bashrc
```