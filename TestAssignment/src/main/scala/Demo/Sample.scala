package Demo

class Sample {
  def printHello() ={
    println("Hello All..")
  }

}

object SampleObject {

  def main(args: Array[String]): Unit ={
    val objectSample = new Sample()
    objectSample.printHello()
  }

}
