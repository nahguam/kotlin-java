package nahguam

fun collections() {
  val list = listOf(1, 2, 3)

  list
    .map { it * 2 } // [2, 4, 6] //immutable intermediate
    .map { it - 1 } // [1, 3, 5] //immutable result

  list
    .asSequence()
    .map { it * 2 } // [2, 4, 6] //stream-like intermediate
    .map { it - 1 } // [1, 3, 5] //stream-like intermediate
    .toList() //immutable result
}
