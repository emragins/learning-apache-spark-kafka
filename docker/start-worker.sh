#!/bin/sh
# make sure line endings are saved as LF and not CRLF

/spark/bin/spark-class org.apache.spark.deploy.worker.Worker \
    --webui-port $SPARK_WORKER_WEBUI_PORT \
    $SPARK_MASTER