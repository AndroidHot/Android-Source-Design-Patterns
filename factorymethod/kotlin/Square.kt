package io.github.androidhot.designpattern.factorymethod.kotlin

class Square : Shape() {
    override fun draw() {
        println("Square draw.")
    }

    override fun erase() {
        println("Square erase.")
    }

}
