package nahguam

class SingletonLazyKotlin {
  val instance by lazy { SingletonLazyKotlin() }

  fun doIt() {
    TODO()
  }
}

object SingletonKotlin {
  fun doIt() {
    TODO()
  }
}
