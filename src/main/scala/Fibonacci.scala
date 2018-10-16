
object Fibonacci extends App {

   def fib(n: Int): Unit ={
     if(n < 2) {
       1
     } else {
       fib(n-1) + fib(n-2)
     }
   }








}
// Fn = Fn-1 + Fn-2


