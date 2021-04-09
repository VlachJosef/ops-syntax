package ops

trait TestBSyntax {
  implicit final def syntaxResultOps(result: String): TestBOps = new TestBOps(result)
}
final class TestBOps(private val result: String) {
  def up(): String = {
    //println(hashCode())
    result.toUpperCase()
  }
}

class TestB extends TestBSyntax {
  def print() = "Hi".up()
}

object TestB {
  def main(args: Array[String]): Unit = {
    val testB = new TestB {}

    testB.print // 2029631290
    testB.print // 1773461579
  }
}
