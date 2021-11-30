package ScalaExample

import scala.annotation.tailrec
import scala.io.StdIn

object Reverse extends App{
  def ar(reverse:String): String ={
    @tailrec
    def ka(reverse:String, len:Int, out:String): String={
      if (len<0)out
      else ka(reverse,len-1, out+reverse.charAt(len))
    }
    ka(reverse,reverse.length-1,out="")
  }
val a =StdIn.readLine()
  println(ar(a))
}
