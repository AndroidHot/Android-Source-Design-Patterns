package io.github.androidhot.decorator.java;

public class SimpleCoffee implements Coffee {
  @Override
  public String name() {
    return "Simple Coffee ";
  }

  @Override
  public float price() {
    return 10;
  }
}
