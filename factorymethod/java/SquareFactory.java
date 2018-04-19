package io.github.androidhot.designpattern.factorymethod.java;

public class SquareFactory implements ShapeFactory {
    public SquareFactory() {
    }

    @Override public Shape createShape() {
        return new Square();
    }
}
