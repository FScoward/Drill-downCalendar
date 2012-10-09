import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "Drill-downCalendar"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "org.specs2" %% "specs2" % "1.10" % "test"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
