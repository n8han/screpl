import sbt._

class MyProject(info: ProjectInfo) 
    extends DefaultProject(info)
    with conscript.Harness {
  val launchInterface = 
    "org.scala-tools.sbt" % "launcher-interface" % "0.7.4" % "provided"
}
