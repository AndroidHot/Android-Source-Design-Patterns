package io.github.androidhot.iterator.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemIterator implements Iterator<Product> {
  private int cursor;
  private AppleList appleList;

  public ItemIterator(AppleList appleList) {
    this.appleList = appleList;
    this.cursor = -1;
  }

  @Override
  public boolean hasNext() {
    return findNextCursor() != -1;
  }

  @Override
  public Product next() {
    cursor = findNextCursor();
    if (cursor != -1) {
      return appleList.getProducts().get(cursor);
    }
    return null;
  }

  private int findNextCursor() {
    ArrayList<Product> items = appleList.getProducts();
    int tempCursor = cursor;
    tempCursor++;
    if (tempCursor >= items.size()) {
      return -1;
    }
    return tempCursor;
  }
}
