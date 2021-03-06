name := "akka-spark-kafka-pipeline"

version := "0.1"

scalaVersion := "2.11.12"

resolvers += "Spark Packages" at "https://dl.bintray.com/spark-packages/maven/"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.0",
  "org.apache.spark" %% "spark-sql" % "2.4.0",
  "org.apache.spark" %% "spark-sql-kafka-0-10" % "2.4.0" % "provided",
  "org.apache.kafka" %% "kafka" % "2.1.0",
  "org.apache.kafka" % "kafka-clients" % "2.1.1",

  "com.typesafe.akka" %% "akka-http" % "10.1.8",
  "com.typesafe.akka" %% "akka-stream" % "2.5.22",
  "io.spray" %% "spray-json" % "1.3.5",

  "com.google.inject" % "guice" % "4.2.2",
  "net.codingwell" %% "scala-guice" % "4.2.3",

  "org.reactivemongo" %% "reactivemongo" % "0.16.4",
  "org.mongodb.spark" %% "mongo-spark-connector" % "2.4.0",
  "org.apache.spark" %% "spark-graphx" % "2.4.0",
  "graphframes" % "graphframes" % "0.7.0-spark2.4-s_2.11",

  "neo4j-contrib" % "neo4j-spark-connector" % "2.1.0-M4",

  "commons-logging" % "commons-logging" % "1.2"

).map(_.exclude("org.slf4j", "*"))

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.7"