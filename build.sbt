ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "rest_request_1"
  )

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "requests" % "0.7.0"
)
