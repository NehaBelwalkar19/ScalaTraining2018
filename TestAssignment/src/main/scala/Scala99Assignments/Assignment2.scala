package Scala99Assignments
//Find the last but one element of a list.
object Assignment2 extends App {

  val element = SecondLastElement(List(1, 1, 2, 3, 5, 8))

  println("2nd Last Element= "+ element)


  def SecondLastElement[A](ls: List[A]): A = ls match {
    case a :: _ :: Nil => a
    case _ :: tail     => SecondLastElement(tail)
    case _             => throw new NoSuchElementException
  }

}
