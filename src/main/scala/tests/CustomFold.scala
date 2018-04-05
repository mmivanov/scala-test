package tests

import scala.annotation.tailrec

class CustomFold(data: List[Int]) {
  var list: List[Int] = data

  def fold(initial: Int)(func: (Int, Int) => Int): Int = {
    @tailrec
    def rec(list: List[Int], initial: Int): Int = {
      list match {
        case Nil => initial
        case x :: xs => rec(xs, func(initial, x))
      }
    }

    rec(list, initial)
  }
}
