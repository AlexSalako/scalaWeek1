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

//Create a method that accepts two parameters, one being a string and one being an integer.
// You method should return the amount of characters from the end of the string that the integer specifies
def slice(string: String, num: Int, num2: Int) = {
  string.slice(num, num2)

}
slice("Alexander", 5, 9)


def add2(x: Int, y: Int) = {
  if (x > y) {
    x + y
  } else {
    x * y
  }
}
add2(33, 44)

//Modify your method from the previous task to have some more conditional statements to check if
//one of the numbers is 0, which if this is true then you should return the other non-0 number
def conditional2(x: Int, y: Int) = {
  if(x == 0){
     y
  } else if(y == 0){
    x
  } else if (x == 0 && y == 0){
    "Enter one number that isn't 0"
  }
  else if (x > y) {
    x + y
  } else {
    x * y
  }
}

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

//Create a method that accepts three parameters, two strings and one integer.
//  Your method will then loop from 1 to the integer provided, outputting the current iteration
//  count every iteration.
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
//Your method should work with a List, Array and Tuple input.

val nameArray = Array("Python", "Ruby", "Java", "Scala")
val numberOfItems = nameArray.length
var i = 3
while ( {
  i < numberOfItems
}) {
  val name = nameArray(i)
  println("Programming language: " + name)

  {
    i -= 1;
  }
}

//Using java.util.TimeZone.getAvailableIDs write a single line of code that returns a data set
//  that looks something like this
