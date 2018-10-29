

object TooHot2{
  class tooHot(val temperature:Int, val isSummer: Boolean)

  def main(args: Array[String]): Unit = {
    val temp = new tooHot(95, true)
    if (temp.temperature > 90 & temp.temperature <= 100 && temp.isSummer == true) {
      println(true)
    } else if (temp.temperature > 60 & temp.temperature >= 90) {
      println(false)
    }
  }
}
