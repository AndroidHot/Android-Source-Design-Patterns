package io.github.androidhot.designpattern.factorymethod.java;

public class TriangleFactory implements ShapeFactory {
    public TriangleFactory() {
    }

    @Override public Shape createShape() {
        return new Triangle();
    }
}
