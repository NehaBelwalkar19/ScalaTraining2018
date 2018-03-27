package Scala99Assignments
//Find Last Elements in the List

object Assignment1 {

  def main(args: Array[String]): Unit = {

    val list = List(3, 5, 2, 7, 1, 8)
    //println(last(list))
    println(lastRecursive(list))
  }


  //Limitation of this method this operate only integer datatype
  def last(list: List[Int]) = {
    if (list != Nil) {
      val len = list.length
      list(len - 1)
    }
    else
      None
  }

  //works for all data type
  def lastBuiltin[A](ls: List[A]): A = ls.last

  //recursive function
  def lastRecursive[A](ls: List[A]): A = ls match {
    case Nil => throw new Exception
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

}
