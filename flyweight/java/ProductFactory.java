package io.github.androidhot.flyweight.java;

import java.util.EnumMap;
import java.util.Map;

public class ProductFactory {
  private final Map<ProductType, Product> products;

  public ProductFactory() {
    products = new EnumMap<ProductType, Product>(ProductType.class);
  }

  public Product createProduct(ProductType type) {
    Product product = products.get(type);
    if (product == null) {
      switch (type) {
        case PHONE:
          product = new Phone();
          products.put(type, product);
          break;
        case PAD:
          product = new Pad();
          products.put(type, product);
          break;
        case MAC:
          product = new Mac();
          products.put(type, product);
          break;
        case WATCH:
          product = new Watch();
          products.put(type, product);
          break;
        default:
          break;
      }
    }
    return product;
  }
}
