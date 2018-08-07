package io.github.androidhot.strategy.java;

public class SortHelper {
  private SortStrategy sortStrategy;

  public SortHelper(SortStrategy sortStrategy) {
    this.sortStrategy = sortStrategy;
  }

  public void setSortStrategy(SortStrategy sortStrategy) {
    this.sortStrategy = sortStrategy;
  }

  public void sort(int[] array) {
    sortStrategy.sort(array);
  }
}
