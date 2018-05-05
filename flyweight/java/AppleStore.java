package io.github.androidhot.flyweight.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppleStore {
  private List<Product> products;

  public AppleStore() {
    products = new ArrayList<>();
    fillStore();
  }

  private void fillStore() {
    ProductFactory factory = new ProductFactory();

    products.add(factory.createProduct(ProductType.PHONE));
    products.add(factory.createProduct(ProductType.PAD));
    products.add(factory.createProduct(ProductType.PHONE));
    products.add(factory.createProduct(ProductType.PAD));
    products.add(factory.createProduct(ProductType.PHONE));
    products.add(factory.createProduct(ProductType.PAD));
    products.add(factory.createProduct(ProductType.PHONE));
    products.add(factory.createProduct(ProductType.MAC));
    products.add(factory.createProduct(ProductType.WATCH));
    products.add(factory.createProduct(ProductType.MAC));
  }

  public final List<Product> getProducts() {
    return Collections.unmodifiableList(products);
  }
}
