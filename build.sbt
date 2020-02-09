name := "RaginsSpark"

version := "1.0"

// scalaVersion := "2.12.10"
scalaVersion := "2.11.12"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.4.3" % "provided"
libraryDependencies += "org.apache.kafka" %% "kafka" % "2.1.0"

// groupId = org.apache.spark
// artifactId = spark-streaming-kafka-0-10_2.12
// version = 2.4.3

// libraryDependencies ++= Seq(
//   "org.apache.spark" %% "spark-core" % "2.3.2",
//   "org.apache.spark" %% "spark-sql" % "2.3.2"
// )