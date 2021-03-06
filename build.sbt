organization := "akka"
name := "akka-minion"

scalaVersion := "2.12.4"
scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-language:_",
  "-encoding", "UTF-8"
)

val AkkaVersion = "2.5.10"
val AkkaHttpVersion = "10.0.11"

libraryDependencies ++= Seq(
  "com.typesafe.akka"  %% "akka-actor"           % AkkaVersion,
  "com.typesafe.akka"  %% "akka-stream"          % AkkaVersion,
  "com.typesafe.akka"  %% "akka-http"            % AkkaHttpVersion,
  "com.typesafe.akka"  %% "akka-http-spray-json" % AkkaHttpVersion,
  "com.lihaoyi"        %% "scalatags"            % "0.6.7",
  "io.spray"           %% "spray-json"           % "1.3.4",
  "com.github.blemale" %% "scaffeine"            % "2.4.0"
)

scalafmtOnCompile in ThisBuild := true

enablePlugins(JavaAppPackaging)
