package Assignments
import scala.annotation.tailrec

object LargestNo {

  def main(args: Array[String]): Unit = {
    val ar = Array(4,2,7,8,1)
    val max = LargestNoInArray(ar)
    println(max)
  }
  //@tailrec

  def LargestNoInArray(a: Array[Int]) : (Int) = {
    if (a.isEmpty) throw new java.lang.UnsupportedOperationException("array is empty")
    a.foldLeft((a(0)))
    { case (( max), e) => ( math.max(max, e))}
  }
}
