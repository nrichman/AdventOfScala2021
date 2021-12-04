import scala.io.Source

object Day1_1 {
  def main(args: Array[String]): Unit = {
    val filename = "input.txt"
    var count = 0
    var prev = 99999
    for (line <- Source.fromFile(filename).getLines) {
      if (line.toInt > prev) {
        count = count + 1
      }
      prev = line.toInt
    }
    println(count)
  }
}