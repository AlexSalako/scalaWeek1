//Output “Hello World!” via the println() method
println("Hello World!")

//Store “Hello World!” in a variable and then output it
var greetings = "Hello Alex"
println(greetings)

//Create a method that accepts a string as a parameter, and then outputs that string.
def output(string: String) = {string}
output("Hello jack")

//Create a method that accepts two Integers as an input, then returns the sum of those integers.
var add = (x: Int, y: Int) => x + y
add(10, 20)

def slice(string: String, num: Int) = {
  string[-num: ]
}

def add2(x: Int, y: Int) = {
  if (x > y) {
    x + y
  } else {
    x * y
  }
}
add2(33, 44)

def iteration(input: String, num: Int) = {input * num}
  iteration("Hello\n", 7);


def if_true(x: Int, y: Int): Unit = {
  val True = true
  if(True == true){
     x + y
  } else {
     x * y
  }
}
if_true(33, 44)

def fizzBuzz(string1: String, string2: String, num: Int) = {
  for (i <- 1 until (num)) {
    if(i % 15 == 0){
      println(string1+string2)
    } else if(i % 3 == 0) {
      println(string1)
    } else if(i % 5 == 0) {
      println( string2)
    } else {
     println(i)
    }
  }
}
 fizzBuzz("Fizz", "Buzz", 16)



//Create a method accepts two parameters, one a String and the other an integer,
//your method will then output that string in a rectangle-like fashion as many
//  times as the number dictates.

def rectangle(string: String, num: Int) = {
  var rec = string * num
  println(rec * num)
}
rectangle("Alex", 4)

//Create a method that takes a pair of integers and then returns the pair swapped around
//using pattern matching

