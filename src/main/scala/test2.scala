import scala.io.StdIn.readLine
import java.util.TimeZone.getAvailableIDs

object test2 extends App {

//  var greeting = "Hello "
//  val input = readLine("What is your name?  ")

  val availableId = getAvailableIDs

  var i = 0
  while ( {i < availableId.length}) {
    println(availableId(i))

    {
      i += 1;
    }

  }

//  def availId() = {
//    val avail = getAvailableIDs()
//
//    var i = 0
//    while({i < avail.length}){
//      println(avail(i))
//      {
//        i += 1;
//      }
//    }
//  }
//  availId()
  }


