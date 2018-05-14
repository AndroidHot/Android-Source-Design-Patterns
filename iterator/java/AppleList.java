package io.github.androidhot.iterator.java;

import java.util.ArrayList;

public class AppleList {
  private ArrayList<Product> products;

  public AppleList(ArrayList<Product> products) {
    this.products = products;
  }

  public void addProduct(Product product) {
    this.products.add(product);
  }

  public void removeProduct(Product product) {
    this.products.remove(product);
  }

  public ArrayList<Product> getProducts() {
    return this.products;
  }

  public ItemIterator createIterator() {
    return new ItemIterator(this);
  }
}
