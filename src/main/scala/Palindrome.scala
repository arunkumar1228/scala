import scala.annotation.tailrec

object Palindrome extends App {
  def akk(n: Int): String = {
    @tailrec
    def com(n: Int, org: Int, rev: Int):String = {
      if (n == 0) {
        if (org == rev)
          "it's palindrome"
        else
          "it's not a palindrome"
      }
      else {
        com(n / 10, org, rev * 10 + (n % 10))
      }
    }
    com(n, n, rev = 0)
  }
  println(akk(21212))
}