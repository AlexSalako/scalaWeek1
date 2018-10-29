import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global



object future extends App{
  def sleep(time: Long): Unit = Thread.sleep(time)

  val function = Future {
  sleep(5000)
    100+100
  }
  val result = Await.result(function, 10 seconds)
  println(result)
  sleep(15000)
}

