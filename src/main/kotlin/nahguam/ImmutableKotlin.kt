package nahguam

fun main() {
  var mutable = 1
  mutable = 2

  val immutable = 1
//  immutable = 2
}

fun immutableParam(i: Int) {
//  i = 2
}

fun mutableList() {
  val list = mutableListOf(1, 2, 3);
  list.add(4);
}

fun immutableList() {
  val list = listOf(1, 2, 3)
//  list.add(4); //compile-time error, immutable interface
}
