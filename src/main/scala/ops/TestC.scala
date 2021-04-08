package ops

trait TestCSyntax {
  implicit class TestCOps(result: String) {
    def up(): String = {
      println(hashCode())
      result.toUpperCase()
    }
  }
}

class TestC extends TestCSyntax {
  def print() = "Hi".up()
}

object TestC {
  def main(args: Array[String]): Unit = {
    val testC = new TestC {}

    testC.print // 266665255
    testC.print // 1881037496
  }
}
