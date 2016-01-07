import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._

var b = ArrayBuffer[Int]()

b += 2
b += 1
b += 3

def add(arg: ArrayBuffer[Int]) = arg += 2
def drop(arg: ArrayBuffer[Int]) = arg -= arg(arg.length-1)

add(b)
b
drop(b)
b

for (i <- 0 to 5) {
  if (i == 3) break
  println(i)
}