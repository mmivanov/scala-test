import org.scalatest._
import tests.CustomFold

class CustomFoldSpec extends FunSuite with BeforeAndAfter with Assertions {
  var customFold: CustomFold = _

  before {
    customFold = new CustomFold(List[Int](5, 4, 3, 2, 1))
  }

  test("Testing custom fold function") {
    assert(customFold.fold(0)((a: Int, b: Int) => { a + (b * b) }) == 55)
    assert(customFold.fold(15)((a: Int, b: Int) => { a - b }) == 0)
  }
}
