#sbt compile 

# re-build docker with latest *.jar file
#docker build -t emragins/spark-submit:latest -f .\submit.Dockerfile .

### Run submit docker container
##docker run --rm -it -v ${PWD}:/usr/src/project --network docker_spark-network emragins/spark-submit:latest /bin/sh
docker run --rm -v ${PWD}:/usr/src/project --network docker_spark-network emragins/spark-submit:latest

#docker exec emragins/spark-submit:latest /usr/src/project/start-app.sh

