name := """tagcade_openrtb_auction"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "io.spray" %%  "spray-json" % "1.3.1",
  "net.liftweb" %% "lift-json" % "2.2"
)
