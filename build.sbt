organization := "com.shop"

name := "ProductCatalogue"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.1"

lazy val scalatraVersion = "2.3.0"

lazy val jettyVersion = "9.1.5.v20140505"

// for debugging sbt problems
logLevel := Level.Info

libraryDependencies ++= Seq(
    "org.json4s" %% "json4s-jackson" % "3.2.9",
    "org.scalatra" %% "scalatra-swagger"  % scalatraVersion,
    "org.scalatra" %% "scalatra" % scalatraVersion,
	"org.scalatra" %% "scalatra-scalatest" % scalatraVersion % "test",
    "ch.qos.logback" % "logback-classic" % "1.1.2" % "runtime",
	"org.eclipse.jetty" % "jetty-plus" % jettyVersion % "compile;provided",
	"org.eclipse.jetty" % "jetty-webapp" % jettyVersion % "compile",
	"javax.servlet" % "javax.servlet-api" % "3.1.0" % "compile;provided;test",
	"org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

Revolver.settings
