package io.github.androidhot.flyweight.kotlin

import java.util.*

class AppleStore {
  private val products: MutableList<Product>

  init {
    products = ArrayList<Product>()
    fillStore()
  }

  private fun fillStore() {
    val factory = ProductFactory()
    products.add(factory.createProduct(ProductType.PHONE))
    products.add(factory.createProduct(ProductType.PHONE))
    products.add(factory.createProduct(ProductType.PAD))
    products.add(factory.createProduct(ProductType.PHONE))
    products.add(factory.createProduct(ProductType.PHONE))
    products.add(factory.createProduct(ProductType.PAD))
  }

  fun getProducts(): List<Product> {
    return Collections.unmodifiableList(products)
  }
}
