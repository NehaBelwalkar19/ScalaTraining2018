package Scala99Assignments
//reverse the list
object Assignment5 extends App {

  val list1 = reverse1(List('a','s','b','v','g','f'))

  val list2 = reverse2(List(9,4,3,4,1,8))

  println("List 1: "+list1+"\nList 2: "+ list2)
  def reverse1[a](ls:List[a]):List[a]={
    ls.reverse
  }
  def reverse2[a](ls:List[a]):List[a]={
    ls.foldLeft(List[a]()) { (r, h) => h :: r }
  }
}
