package Scala99Assignments
//Find the number of elements of a list.
object Assignment4 extends App {

  val elementNo = noOfElement(List(2,3,4,5,6,1,2))
  println("No of elements:"+elementNo)

  def noOfElement[A](ls:List[A]): Int={
   ls.length
  }
}
