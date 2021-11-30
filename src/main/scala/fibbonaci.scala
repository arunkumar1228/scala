package Example

import scala.annotation.tailrec

object fibbonaci extends App{
  def fib(a:Int):Int= {
    @tailrec
    def tailfib(a: Int, prev: Int, next: Int, Index: Int): Int = {
      if (Index == a) next
      else
        tailfib(a, next, prev + next, Index + 1)
    }
    tailfib(a,0,1,Index=1)
  }
println(fib(10))
}
