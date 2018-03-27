package Scala99Assignments
//Eliminate consecutive duplicates of list elements.

object Assignment8 extends App {
  val ls = List(1,1,2,3,4,4,5,6,6)

  println(RemoveConsecutiveDuplicate(ls))

  //Standard Recursion
  def RemoveConsecutiveDuplicate[A](ls : List[A]): List[A]= ls match {
    case Nil => Nil
    case h :: tail => h :: RemoveConsecutiveDuplicate(tail.dropWhile(_ == h))
  }

    //tail recursion
  //def RemoveConsecutiveDuplicateTailRecursion[A](ls : List[A], result : List[A]):List[A] = ls match {
  //case h :: tail => h ::
  //}
}
