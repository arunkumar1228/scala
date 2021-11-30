package Example

import scala.annotation.tailrec

object Fact extends App {
  def factor(n:Int):Int={
  @tailrec
    def factorial(n: Int, out: Int): Int = {
      if (n ==0)
        out
      else
        factorial(n - 1, n * out)
    }
   factorial(n,out=1)
  }
  println(factor(4))
}