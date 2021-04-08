package ops

trait TestASyntax {
  implicit final def syntaxResultOps(result: String): TestAOps = new TestAOps(result)
}
final class TestAOps(private val result: String) extends AnyVal {
  def up(): String = {
    println(hashCode())
    result.toUpperCase()
  }
}

class TestA extends TestASyntax {
  def print() = "Hi".up()
}

object TestA {
  def main(args: Array[String]): Unit = {
    val testA = new TestA {}

    testA.print // 2337
    testA.print // 2337
  }
}
