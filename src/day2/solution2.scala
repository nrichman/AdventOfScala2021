import scala.io.Source
import scala.annotation.switch

object Day1_1 {
  def main(args: Array[String]): Unit = {
    val filename = "input.txt"
    var horizontal = 0
    var depth = 0
    var aim = 0

    for (line <- Source.fromFile(filename).getLines) {
      var s = line.split(" ")
      if (s(0) == "forward") {
        horizontal = horizontal + s(1).toInt
        depth = depth + aim * s(1).toInt
      }
      else if (s(0) == "up") {
        aim = aim - s(1).toInt
      }
      else if (s(0) == "down") {
        aim = aim + s(1).toInt
      }
    }

    println(horizontal * depth)
  }
}