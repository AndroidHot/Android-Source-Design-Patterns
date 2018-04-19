package io.github.androidhot.designpattern.simplefactory.java;

public class ShapeFactory {
    public static final int CIRCLE_TYPE = 0;
    public static final int SQUARE_TYPE = 1;
    public static final int TRIANGLE_TYPE = 2;

    public static Shape getShape(int type) {
        Shape subShape = null;
        switch (type) {
            case CIRCLE_TYPE:
                subShape = new Circle();
                break;
            case SQUARE_TYPE:
                subShape = new Square();
                break;
            case TRIANGLE_TYPE:
                subShape = new Triangle();
                break;
            default:
                break;
        }
        return subShape;
    }
}
