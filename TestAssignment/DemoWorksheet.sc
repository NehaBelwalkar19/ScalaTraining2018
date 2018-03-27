import java.io.File

println("hello".toUpperCase())

val a : Int = 1
val b = false
val c = 2 + "1"

var d = 1
d = 2

val name = "Neha"
name.charAt(0)
a.equals(1)

lazy val lazyA = "Neha"
println(lazyA)

val files = new File(".").listFiles()
files.map{
  f => f.getName
}


for{
  file <- files
}yield  file.getName


case class Person(name:String, nationality : String, friends: Person*)

val neha = Person("Neha","Indian")
val swapnil = Person ("Swapnil","Indian",neha)
val pratik = Person("Pratik","US")


val facebook = List(neha,swapnil,pratik)

val indians = facebook.filter(person => person.nationality == "Indian").map(per => per.name)

for{
  person <- facebook withFilter(_.nationality=="Indian")
}yield  person.name



