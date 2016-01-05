package Cone

import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.util.control.Breaks._

/**
  * Created by ame on 1/5/2016.
  */
object ScalaTask extends App {
  var input = getInput
  visualiseSimple(input)
  //var inputInts = input.map(_.toInt)
  f(new ArrayBuffer[Int]())


  def visualiseSimple(in: Array[Array[Int]]): Unit = {
    println(input.mkString("\n"))
  }

  def getInput = {
    val source = Source.fromFile("C:\\Users\\ame\\Documents\\asd.txt")
    source.getLines.toArray
  }

  def f(in: ArrayBuffer[Int]): Unit = {
    for (i <- 0 until 12) {
      if (in.contains(i)) {
        if (in.length == 12) {
          val ints = Array.ofDim[Int](12,4)
          for (j <- 0 until 12) {
            ints(j) = inputInts(in(j))
            visualiseSimple(ints)
            println("========")
            break
          }
        }
      }
      else {

      }
    }
  }
}