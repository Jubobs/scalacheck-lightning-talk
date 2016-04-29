name := "scalacheck-lightning-talk"

organization := "com.newsweaver"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  val scalaTestVersion = "2.2.6"
  val scalaCheckVersion = "1.12.5"
  val jUnitInterfaceVersion = "0.11"
  Seq(
    "com.novocode" % "junit-interface" % jUnitInterfaceVersion % "test",
    "org.scalacheck" %% "scalacheck" % scalaCheckVersion % "test",
    "org.scalatest" %% "scalatest" % scalaTestVersion % "test")
}

wartremoverErrors in (Compile, compile) ++= Warts.allBut(Wart.Throw)

val scalastyleFailOnError = true
