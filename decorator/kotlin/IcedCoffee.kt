package io.github.androidhot.decorator.kotlin

class IcedCoffee(private val coffee: Coffee) : Coffee {
  override fun name(): String {
    return coffee.name() + "with Ice "
  }

  override fun price(): Float {
    return coffee.price() + 2f
  }
}
