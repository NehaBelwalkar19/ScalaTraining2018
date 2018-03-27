package Scala99Assignments
// Find the kth element of list
object Assignment3 extends App {

  val result = kthElement(3, List(1, 1, 2, 3, 5, 8))

  println(result)

  def kthElement[A](n: Int, ls: List[A]): Any =
    if(n > ls.length)
      "Index is greater than number of elements present in list"

    else if (n >= 0) ls(n)

    else "Index is less than 0"

}
