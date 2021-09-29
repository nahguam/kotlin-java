package nahguam

data class DataKotlin(
  var value: Int = 0
)

fun main() {
  val result = DataKotlin().apply {
    value = 1
  }
  println(result)
}
