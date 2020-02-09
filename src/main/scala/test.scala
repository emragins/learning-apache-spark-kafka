import System.out;

/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession;
import org.apache.kafka;

import java.util.Properties;

object SimpleApp {
  def main(args: Array[String]) {
    System.out.println("hello");
    helloSpark();
    writeToKafka("quick-start")
  }

  def writeToKafka(topic: String): Unit = {
    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9094")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    // val producer = new KafkaProducer[String, String](props)
    // val record = new ProducerRecord[String, String](topic, "key", "value")
    // producer.send(record)
    // producer.close()
  }

  def helloSpark(){
    val logFile = "/spark/README.md" // Should be some file on your system
    val spark = SparkSession.builder
      .appName("Simple Application")
      //.config(")
      //.master("spark://localhost:7077")
      .getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }
}
