package io.github.androidhot.iterator;

import io.github.androidhot.iterator.java.AppleList;
import io.github.androidhot.iterator.java.ItemIterator;
import io.github.androidhot.iterator.java.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Product> collection = Arrays.asList(
        new Product("iPhone"),
        new Product("iPad"),
        new Product("MacBook"),
        new Product("Apple Watch"),
        new Product("HomePod"));
    ArrayList<Product> products = new ArrayList<>();
    products.addAll(collection);
    AppleList appleList = new AppleList(products);
    ItemIterator itemIterator = appleList.createIterator();
    while (itemIterator.hasNext()) {
      System.out.println("Apple Product: " + itemIterator.next().toString());
    }
  }
}
