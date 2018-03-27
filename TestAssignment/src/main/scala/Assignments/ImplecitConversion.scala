package Assignments

object ImplecitConversion {

  implicit def string2Int(s: String): Int = augmentString(s).toInt

  def f(i: Int) = i

  def main(args: Array[String]) {
    val n: Int = f("666")
    println(n)
  }

}
