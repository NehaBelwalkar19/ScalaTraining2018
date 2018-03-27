package Scala99Assignments
//check list is palindrom or not

object Assignment6 extends App {

  val isPalindrome:Boolean = isPalindrome(List(1,2,3,2,1))
  println("Is Palindrome="+isPalindrome)
  def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse

}
