package io.github.androidhot.flyweight.kotlin

import java.util.*

class ProductFactory {
  private val products = EnumMap<ProductType, Product>(ProductType::class.java)

  fun createProduct(type: ProductType): Product {
    var product = products[type]
    if (product == null) {
      product = when(type) {
        ProductType.PHONE -> Phone()
        ProductType.PAD -> Pad()
      }
      products[type] = product
    }
    return product
  }
}
