name := """wiki-search-rest-api"""
organization := "com.company"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.company.controllers._"

libraryDependencies += "io.circe" %% "circe-parser" % "0.12.3"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.company.binders._"
