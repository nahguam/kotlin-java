package nahguam

fun doubleIfEven(i: Int) = if (i % 2 == 0) {
  i * 2
} else {
  i
}

fun doubleWhenEven(i: Int) = when (i % 2) {
  0 -> i * 2
  else -> i
}

fun tryDoIt() = try {
  ExpressionJava.throwingFunction()
} catch (e: Exception) {
  throw RuntimeException(e)
}

fun doIt(): Result<Int> = try {
  Result.success(ExpressionJava.throwingFunction())
} catch (e: Exception) {
  Result.failure(e)
}

