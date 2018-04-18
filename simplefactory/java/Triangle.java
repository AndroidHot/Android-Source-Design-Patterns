package io.github.androidhot.designpattern.simplefactory.java;

public class Triangle extends Shape {

    public Triangle() {
    }

    @Override public void draw() {
        System.out.println("Triangle draw.");
    }


    @Override public void erase() {
        System.out.println("Triangle erase.");
    }
}
