package io.github.androidhot.strategy;

import io.github.androidhot.strategy.java.BubbleSortStrategy;
import io.github.androidhot.strategy.java.InsertSortStrategy;
import io.github.androidhot.strategy.java.QuickSortStrategy;
import io.github.androidhot.strategy.java.SortHelper;

public class Main {
  public static void main(String[] args) {
    int[] array = new int[] {1995, 12, 0, 1};
    SortHelper sortHelper = new SortHelper(new InsertSortStrategy());
    sortHelper.sort(array);

    sortHelper.setSortStrategy(new BubbleSortStrategy());
    sortHelper.sort(array);

    sortHelper.setSortStrategy(new QuickSortStrategy());
    sortHelper.sort(array);
  }
}
