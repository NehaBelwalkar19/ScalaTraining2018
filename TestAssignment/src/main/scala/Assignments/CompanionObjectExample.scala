//Companion object is the object having same name as class name, it can access class's private members without creating actual object
//of that class

package Assignments

object CompanionObjectExample{

  def main(args: Array[String]): Unit = {
    val stu = new Student(5,"abc")
    println(stu.toString)
  }

}


class Student(sid:Int, sname:String){
  private val Id = sid
  private val name = sname

  override def toString() =
    this.Id+" "+" , "+this.name
}

object Student extends App {

  val stu = new Student(5,"abc")
  println(stu.Id)



}
