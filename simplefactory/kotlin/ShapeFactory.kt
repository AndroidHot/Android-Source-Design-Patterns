package io.github.androidhot.designpattern.simplefactory.kotlin

class ShapeFactory {
    companion object {
        val CIRCLE_TYPE: Int = 0
        val SQUARE_TYPE: Int = 1
        val TRIANGLE_TYPE: Int = 2

        fun getShape(type: Int): Shape? {
            var subShape: Shape? = null
            when(type) {
                CIRCLE_TYPE -> subShape = Circle()
                SQUARE_TYPE -> subShape = Square()
                TRIANGLE_TYPE -> subShape = Triangle()
                else -> {}
            }
            return subShape
        }
    }
}
