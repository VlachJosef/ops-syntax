lazy val root = project
  .in(file("."))
  .enablePlugins(JmhPlugin)
  .settings(
    name := "ops-syntax",
    scalaVersion := "2.13.5",
    scalafmtOnCompile := true
  )
