package io.github.androidhot.designpattern.factorymethod.kotlin

class TriangleFactory() : ShapeFactory {
    override fun createShape(): Shape {
        return Triangle()
    }
}
