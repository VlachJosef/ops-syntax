package ops

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.infra.Blackhole

// $ sbt Jmh / run -i 3 -wi 3 -f1 -t1 -prof gc
class Benchmarks {
  @Benchmark
  def rangeA(bh: Blackhole): Unit = {
    val testA = new TestA {}
    1.to(100000)
      .foreach { _ =>
        bh.consume(testA.print)
      }
  }

  @Benchmark
  def rangeB(bh: Blackhole): Unit = {
    val testB = new TestB {}
    1.to(100000)
      .foreach { _ =>
        bh.consume(testB.print)
      }
  }
}
