import org.scalatest.{Assertions, BeforeAndAfter, FunSuite}
import tests.CustomList

class CustomListSpec extends FunSuite with BeforeAndAfter with Assertions {
  var customList: CustomList = _

  before {
    customList = new CustomList()
  }

  test("Testing length function") {
    val list = List[Int](1, 3)
    assert(customList.length(list) == 2)
  }

  test("Testing sum function") {
    val data = List[Int](1, 2, 3, 4)
    assert(customList.sum(data) == 10)
  }

  test("Testing concat function") {
    val data: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6))
    val expected: List[Int] = List(1, 2, 3, 4, 5, 6)

    assert(customList.concat(data) == expected)
  }

  test("Testing takeWhile function") {
    val data: List[Int] = List(2, 4, 5, 7, 11)
    val expected: List[Int] = List(2, 4)

    assert(customList.takeWhile(a => a < 5, data) == expected)
  }
}
