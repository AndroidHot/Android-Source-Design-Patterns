package io.github.androidhot.designpattern.factorymethod.java;

public class Triangle extends Shape {
    public Triangle() {
    }

    @Override public void draw() {
        System.out.println("Triangle erase.");
    }


    @Override public void erase() {
        System.out.println("Triangle erase.");
    }
}
