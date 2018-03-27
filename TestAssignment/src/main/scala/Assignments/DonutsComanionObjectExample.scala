package Assignments

object DonutsComanionObjectExample {

}


class Donut(name: String, productCode: Long){
  def print = println(s"Donut name = $name, productCode = $productCode")
}

object Donut extends App {
  val donut_Object = new Donut("regular",12345)
  donut_Object.print

}