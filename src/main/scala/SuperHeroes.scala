import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

object SuperHeroes {
  def main(args: Array[String]): Unit = {
    //println("Superheroes unite!!")

    val hero = new Array[String](10)
     val heroes = Array("Superman", "Batman", "Spiderman")


      val superHeroes = Array("Wonder Woman", "Jean Grey", "Batwoman")

    //ArrayBuffer allows to append elements to Arrays
    val mutableSuperHeroes = ArrayBuffer("Wonder Woman", "Jean Grey", "Batwoman")
      mutableSuperHeroes += "Thor"
      //println(mutableSuperHeroes)

      for(elem <- 0 until mutableSuperHeroes.length) println(elem + " " + mutableSuperHeroes(elem) )

    //Lists and ListBuffers
    val marvel = ListBuffer("Spiderman", "Venom", "Wolverine", "Sabretooth")
    marvel += "Black Panther"

    marvel(3) = "Summer"
    //println(marvel)

    //Maps
    val dragonBall = Map("Goku" -> 99, "Gohan" -> 85, "Vegeta" -> 93)
    val goku = dragonBall.getOrElse("Goku", 0)
    println(dragonBall.keys)
    println(dragonBall.values)
    for((key, values) <- dragonBall) println(key + ": " + values)



  }

  val superman = new SuperHero("Clark Kent", "Superman", "Krypton", 'M')

  val batman = new SuperHero("Bruce Wayne", "Batman", "Gotham", 'M')
  batman.details()
  val spiderMan = new SuperHero("Spiderman", "New York")

  val joker = new Villain("Joker", "Gotham")
  joker.details()



}
