FROM emragins/spark:latest

WORKDIR  /usr/src/app

COPY target/scala-2.11/raginsspark_2.11-1.0.jar .