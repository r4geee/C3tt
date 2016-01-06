import scala.collection.mutable.ArrayBuffer

var b = ArrayBuffer[Int]()

b += 1
b += 3

def add(arg: ArrayBuffer[Int]) = arg += 2
def drop(arg: ArrayBuffer[Int]) = arg.takeRight(1)

add(b)
b
b = drop(b)
b