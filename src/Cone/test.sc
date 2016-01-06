import scala.collection.mutable.ArrayBuffer
import scala.io.Source

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

var input = getInput

input(1)
input(1)(2)