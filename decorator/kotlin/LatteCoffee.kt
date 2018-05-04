package io.github.androidhot.decorator.kotlin

class LatteCoffee(private val coffee: Coffee) : Coffee {
  override fun name(): String {
    return coffee.name() + "with Latte "
  }

  override fun price(): Float {
    return coffee.price() + 3f
  }
}
