import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global


object onCompletion extends App {

  def sleep(time: Long): Unit = Thread.sleep(time)

  val function = Future {
    sleep(7000)
    100+200

  }
  function.onComplete {
    case success => println("Welcome to QA")

  }
  println("......1"); sleep(1000)
  println(".......2"); sleep(2000)
  println("........3"); sleep(3000)
  println(".........4"); sleep(4000)
}
