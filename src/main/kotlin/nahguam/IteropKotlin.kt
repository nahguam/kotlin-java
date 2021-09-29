package nahguam

class NullableImpl : InteropJava.InterfaceNullable {
  override fun doIt(i: Int?) {
    TODO("Not yet implemented")
  }
}

class NotNullableImpl : InteropJava.InterfaceNotNullable {
  override fun doIt(i: Int) {
    TODO("Not yet implemented")
  }
}
