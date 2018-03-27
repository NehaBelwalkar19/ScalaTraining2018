package Assignments
import scala.io.StdIn.{readLine,readInt}

object Calculator1 {
  def main(args: Array[String]): Unit ={
    println("Hello World")


    val add: (Int, Int) => Int = sum
    val prod: (Int, Int) => Int = product
    val sub: (Int, Int) => Int = subtract
    val div: (Int, Int) => Int = division

    var d = "y"

    do {
      println("Please Enter 1st no for calculation:")
      val a = readInt()
      println("Please Enter 2nd no for calculation:")
      val b = readInt()

      println("Please choose Operation: \n 1. Add\n 2.Production \n 3.Substraction\n 4. Division")
      val c = readInt()


      c match {
        case 1 => calculate(add, a, b)
        case 2 => calculate(prod, a, b)
        case 3 => calculate(sub, a, b)
        case 4 => calculate(div, a, b)
        case _ => println("Invalid choice")

      }
      println("Do you want to continue(y/n):")
      d = readLine()
    }while( d == "y")
  }


  def sum(a: Int, b: Int): Int = a + b
  def product(a: Int, b: Int): Int = a * b
  def subtract(a: Int, b: Int): Int = a - b
  def division(a: Int, b: Int): Int = a / b

  def calculate(action:(Int, Int) => Int ,a: Int ,b: Int): Unit={
    println(action(a,b))

  }

}
