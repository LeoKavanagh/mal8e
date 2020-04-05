scalaVersion := "2.13.1"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// enablePlugins(ScalaNativePlugin)
enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "1.0.0"
)

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

