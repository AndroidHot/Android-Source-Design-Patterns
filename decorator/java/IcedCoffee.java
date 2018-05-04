package io.github.androidhot.decorator.java;

public class IcedCoffee implements Coffee {
  private Coffee coffee;
  public IcedCoffee(Coffee coffee) {
    this.coffee = coffee;
  }

  @Override
  public String name() {
    return coffee.name() + "with Ice ";
  }

  @Override
  public float price() {
    return coffee.price() + 2;
  }
}
