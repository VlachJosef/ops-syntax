lazy val root = project
  .in(file("."))
  .settings(
    name := "ops-syntax",
    scalaVersion := "2.13.5",
    scalafmtOnCompile := true
  )
