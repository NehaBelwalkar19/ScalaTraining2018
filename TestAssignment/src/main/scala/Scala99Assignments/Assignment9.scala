package Scala99Assignments
// Pack consecutive duplicates of list elements into sub lists.


object Assignment9 extends App {

  val ls = List(1,1,1,3,2,2,5,2)

 println(pack(ls))

  def pack[A](ls: List[A]): List[List[A]]=
  {
    if (ls.isEmpty) List(List())
    else {

      val (packed, next) = ls span {
        _ == ls.head
      }
      if (next == Nil) List(packed)
      else
        packed :: pack(next)
    }

  }

}
