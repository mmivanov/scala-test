import tests.Cat
import org.scalatest._

class CatSpec extends FunSuite with BeforeAndAfter with Assertions {
  var cat: Cat = _

  before {
    cat = new Cat("models.Cat name")
  }

  test("Correct name") {
    assert(cat.name === "models.Cat name")
  }
}
