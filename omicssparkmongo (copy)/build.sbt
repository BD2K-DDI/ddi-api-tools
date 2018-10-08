name := "omicssparkmongo"

version := "0.1"

scalaVersion := "2.11.9"

val sparkVersion = "2.3.0"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.mongodb.spark" %% "mongo-spark-connector" % sparkVersion,
  "com.databricks" %% "spark-csv" % "1.5.0",
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.4.2",
  "org.mongodb" %% "casbah" % "3.1.1",
  "com.typesafe" % "config" % "1.3.3"
  //"com.stratio.datasource" %% "spark-mongodb_2.11" % sparkVersion
)