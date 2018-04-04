package tests

object Test extends App {
  override def main(args: Array[String]): Unit = {
    val fold = new Fold()
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println("List(1, 2, 3, 4, 5, 6, 7, 8, 9) length: " + fold.length(list))
    println("List(1, 2, 3, 4, 5, 6, 7, 8, 9) sum: " + fold.sum(list))
    println("List(List(1, 3, 5), List(2, 4, 6)) concatenation: "+ fold.concat(List(List(1, 3, 5), List(2, 4, 6))))
    println("List(1, 2, 3, 4, 5, 6, 7, 8, 9) takeWhile: " + fold.takeWhile((x) => {x < 5}, list))
  }
}
