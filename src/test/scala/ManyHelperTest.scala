import org.scalatest.FunSuite
import scala.collection.immutable._

class ManyHelperTest extends FunSuite {

  test("intersect is invoked on a non-empty stack") {

    val many1 = List(1, 2, 3, 4)
    val many2 = List(3, 4, 5, 6)
    val resultMany = ManyHelper.intersect(many1, many2)
    assert(resultMany.size === 2)
    assert(resultMany(0) === 3)
    assert(resultMany(1) === 4)
  }
}