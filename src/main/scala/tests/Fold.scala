package tests

class Fold {
  def length(dogs: List[Int]): Int = {
    dogs.foldLeft(0)((n: Int, _) => {n + 1})
  }

  def sum(data: List[Int]): Int = {
    data.foldLeft(0)((n: Int, k: Int) => {n + k})
  }

  def concat(data: List[List[Int]]): List[Int] = {
    data.foldLeft(List[Int]())((n: List[Int], k: List[Int]) => {n ::: k})
  }

  def takeWhile(predicate: (Int) => Boolean, data: List[Int]): List[Int] = {
    data.foldLeft(List[Int]())((res: List[Int], item: Int) => { if(predicate(item)) res ::: List[Int](item) else res})
  }
}
