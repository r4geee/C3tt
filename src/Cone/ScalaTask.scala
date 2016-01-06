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
  println("Results")
  f(new ArrayBuffer[Int]())


  def visualiseSimple(ints: ArrayBuffer[Array[Int]]): Unit = {
    for (inta <- ints) println(inta.mkString(" "))
  }

  def getInput: ArrayBuffer[Array[Int]] = {
    val source = Source.fromFile("C:\\Users\\ame\\myTests\\ConeTestTask\\src\\Cone\\input.txt")
    val lines = source.getLines.toArray
    val ints = ArrayBuffer[Array[Int]]()
    for (line <- lines) {
      val values = line.split(" ").map(_.toInt)
      ints += values
    }
    ints
  }

  def f(stack: ArrayBuffer[Int]): Unit = {
    for (i <- 0 until 12) {
      println("i = " + i + " stack size: " + stack.length)
      if (stack.contains(i)) {
        if (stack.length == 12) {
          println(stack)
          val ints = ArrayBuffer[Array[Int]]()
          for (j <- 0 until 12) {
            ints(j) = input(stack(j))
          }
          visualiseSimple(ints)
          println("========")
          break
        }
      }
      else {
        breakable {
          if (stack.length == 1) {
            if (input(stack(stack.length - 1))(1) + input(i)(0) > 10 || input(stack(stack.length - 1))(3) + input(i)(2) > 10)
              break
          }
          if (stack.length == 2) {
            if (input(stack(stack.length - 2))(2) + input(i)(1) > 10)
              break
          }
          if (stack.length == 3) {
            if (input(stack(stack.length - 1))(1) + input(stack(stack.length - 3))(2) + input(i)(0) > 10 || input(stack(stack.length - 3))(3) + input(stack(stack.length - 2))(2) + input(i)(1) > 10)
              break
          }
          if (stack.length == 4) {
            if (input(stack(stack.length - 4))(3) + input(stack(stack.length - 3))(2) + input(stack(stack.length - 1))(1) + input(i)(0) != 10 || input(stack(stack.length - 3))(3) + input(i)(1) > 10)
              break
          }
          if (stack.length == 5) {
            if (input(stack(stack.length - 4))(3) + input(stack(stack.length - 1))(1) + input(i)(0) > 10 || input(stack(stack.length - 1))(3) + input(i)(2) > 10)
              break
          }
          if (stack.length == 6) {
            if (input(stack(stack.length - 4))(2) + input(i)(0) > 10 || input(stack(stack.length - 4))(3) + input(i)(1) > 10)
              break
          }
          if (stack.length == 7) {
            if (input(stack(stack.length - 5))(3) + input(stack(stack.length - 4))(2) + input(stack(stack.length - 1))(1) + input(i)(0) != 10 || input(stack(stack.length - 1))(3) + input(i)(2) > 10 || input(stack(stack.length - 4))(3) + input(stack(stack.length - 3))(2) + input(i)(1) > 10)
              break
          }
          if (stack.length == 8) {
            if (input(stack(stack.length - 5))(3) + input(stack(stack.length - 4))(2) + input(stack(stack.length - 1))(1) + input(i)(0) != 10 || input(stack(stack.length - 1))(3) + input(i)(2) > 10 || input(stack(stack.length - 4))(3) + input(i)(1) > 10)
              break
          }
          if (stack.length == 9) {
            if (input(stack(stack.length - 5))(3) + input(stack(stack.length - 4))(2) + input(stack(stack.length - 1))(1) + input(i)(0) != 10 || input(stack(stack.length - 1))(3) + input(i)(2) > 10 || input(stack(stack.length - 4))(3) + input(i)(1) > 10)
              break
          }
          if (stack.length == 10) {
            if (input(stack(stack.length - 4))(3) + input(stack(stack.length - 3))(2) + input(i)(0) > 10 || input(stack(stack.length - 3))(3) + input(stack(stack.length - 2))(2) + input(i)(1) > 10)
              break
          }
          if (stack.length == 11) {
            if (input(stack(stack.length - 4))(3) + input(stack(stack.length - 3))(2) + input(stack(stack.length - 1))(1) + input(i)(0) != 10 || input(stack(stack.length - 1))(3) + input(i)(2) > 10 || input(stack(stack.length - 3))(3) + input(stack(stack.length - 2))(2) + input(i)(1) > 10)
              break
          }
          stack += i
          f(stack)
          stack.drop(1)
        }
      }
    }
  }
}