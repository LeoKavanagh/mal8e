scalaVersion := "2.13.1"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// enablePlugins(ScalaNativePlugin)
enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
    "com.lihaoyi" %% "cask" % "0.5.2"
)
