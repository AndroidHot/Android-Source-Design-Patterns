package io.github.androidhot.decorator.kotlin

class SimpleCoffee : Coffee {
  override fun name(): String {
    return "Simple Coffee "
  }

  override fun price(): Float {
    return 10f
  }
}
