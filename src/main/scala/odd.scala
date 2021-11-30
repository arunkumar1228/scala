package Example

import scala.io.StdIn

object odd extends App {
  println("enter the number")
  var number=StdIn.readLine().toInt
if(number%2==0)
  {
    println("the number is even")
  }
else
  println("the number is Odd")
}
