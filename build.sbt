name := """activator-play-tls-example"""

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  ws,
  "net.sourceforge.pro-grade" % "pro-grade" % "1.1.1",
  specs2 % Test
)
