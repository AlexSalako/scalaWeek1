import scala.collection.mutable.ArrayBuffer
class SuperHero(val name: String, val nickname:String, val birthPlace:String, val gender:Char) {
  println("A new hero was created " + name)

  def this(name: String){
    this(name, "", "", ' ')
  }
  def this(name: String, birthPlace:String){
    this(name, "", birthPlace, ' ')
  }
  def details() ={
    println(name + " was born in " + birthPlace)
  }


}
