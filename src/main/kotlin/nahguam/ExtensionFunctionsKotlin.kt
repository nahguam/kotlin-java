package nahguam

import java.util.*
import java.util.stream.Stream

fun main() {
  val list = listOf(1, 2, 3)
  val result = list.stream().firstOdd().orElse(null)
  println(result)
}

fun Stream<Int>.firstOdd(): Optional<Int> = filter { it % 2 != 0 }.findFirst()
