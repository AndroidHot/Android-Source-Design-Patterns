package io.github.androidhot.designpattern.factorymethod.kotlin

class SquareFactory() : ShapeFactory {
    override fun createShape(): Shape {
        return Square()
    }
}
