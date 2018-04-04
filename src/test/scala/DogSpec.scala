import tests.Dog
import org.scalatest._

class DogSpec extends FunSuite with BeforeAndAfter with Assertions {
  var dog: Dog = _

  before {
    dog = new Dog("Test")
  }

  test("Correct name") {
    assert(dog.name == "Test")
  }
}
