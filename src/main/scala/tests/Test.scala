package tests

object Test extends App {
  override def main(args: Array[String]): Unit = {
    val list = new CustomList()
    val data = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val fold = new CustomFold(data)

    println("List(1, 2, 3, 4, 5, 6, 7, 8, 9) length: " + list.length(data))
    println("List(1, 2, 3, 4, 5, 6, 7, 8, 9) sum: " + list.sum(data))
    println("List(List(1, 3, 5), List(2, 4, 6)) concatenation: "+ list.concat(List(List(1, 3, 5), List(2, 4, 6))))
    println("List(1, 2, 3, 4, 5, 6, 7, 8, 9) takeWhile: " + list.takeWhile((x) => {x < 5}, data))

    println("List(1, 2, 3, 4, 5, 6, 7, 8, 9) custom fold with (a, b) => {a + b}: " + fold.fold(0)((a, b) => {a + b}))
    println("List(1, 2, 3, 4, 5, 6, 7, 8, 9) custom fold with (a, b) => {a * b}: " + fold.fold(1)((a, b) => {a * b}))
    println("List(1, 2, 3, 4, 5, 6, 7, 8, 9) custom fold with (a, b) => {a + (b * b)}: " + fold.fold(0)((a, b) => {a + (b * b)}))
  }
}
