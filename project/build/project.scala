import sbt._

class MyProject(info: ProjectInfo) 
    extends DefaultProject(info)
    with conscript.Harness {
}
