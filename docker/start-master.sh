#!/bin/sh

# make sure line endings are saved as LF and not CRLF

/spark/bin/spark-class org.apache.spark.deploy.master.Master \
    --host $SPARK_LOCAL_IP \
    --port $SPARK_MASTER_PORT \
    --webui-port $SPARK_MASTER_WEBUI_PORT