package io.github.androidhot.decorator.java;

public class LatteCoffee implements Coffee {
  private Coffee coffee;

  public LatteCoffee(Coffee coffee) {
    this.coffee = coffee;
  }

  @Override
  public String name() {
    return coffee.name() + "with Latte ";
  }

  @Override
  public float price() {
    return coffee.price() + 3;
  }
}
