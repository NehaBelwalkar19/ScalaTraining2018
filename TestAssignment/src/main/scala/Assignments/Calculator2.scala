package Assignments
import scala.io.StdIn.{readLine,readInt}

object Calculator2 {
  def main(args: Array[String]): Unit = {

    var d = "y"

    do {
      println("Please Enter the expression:")
      val a: String= readLine()

      val result = calculate(a)

      println("Result:" + result)

      println("Do you want to continue(y/n):")
      d = readLine()
    }while( d == "y")

  }

  def calculate(expression: String): String={

    val s: Array[String] = expression.split("(?<=[-+*/])|(?=[-+*/])")

    var result = 0
    s{1} match {
      case "+" => result = s{0}.toInt + s{2}.toInt
      case "-" => result = s{0}.toInt - s{2}.toInt
      case "*" => result = s{0}.toInt * s{2}.toInt
      case "/" => result = s{0}.toInt / s{2}.toInt
      case _ => result = -999

    }

    return result.toString


  }

}
//Abstract members assignments