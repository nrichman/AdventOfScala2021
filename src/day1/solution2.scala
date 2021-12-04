import scala.io.Source

object Day1_1 {
  def main(args: Array[String]): Unit = {
    val filename = "input.txt"
    val lines = Source.fromFile(filename).getLines.toArray.map(_.toInt)

    var count = 0
    var prev = lines(0)
    var next = lines(3)

    for (i <- 3 to lines.size-1) {
      if (next > prev) {
        count = count + 1
      }

      prev = lines(i-3)
      next = lines(i)
    }
    println(count)
  }
}