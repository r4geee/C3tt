package Cone

import scala.io.Source

/**
  * Created by ame on 1/5/2016.
  */
object Task extends App {
  var input = getInput()
  visualiseSimple(input)
  var inputInts = input.map(_.toInt)


  def visualiseSimple(in: Array[String]): Unit = {
    println(input.mkString("\n"))
  }

  def getInput() = {
    val source = Source.fromFile("C:\\Users\\ame\\Documents\\asd.txt")
    source.getLines.toArray
  }

  def f(in: Array[Int]): Unit = {
    for (i <- 0 until 12) {
      if (in.contains(i)) {
        if (in.length == 12) {

        }
      }
    }
  }
}