package nahguam

fun main() {
  val map = mapOf(1 to 1)

  map.map { valueTimes2OrDefault(it, 1) }
    .forEach { println(it) }

  map.map { NullabilityJava.valueTimes2OrDefault(it, 1) }
}

fun <K> valueTimes2OrDefault(entry: Map.Entry<K, Int?>?, defaultValue: Int): Int =
  entry?.value?.let { it * 2 } ?: defaultValue
