package io.github.androidhot.designpattern.simplefactory.kotlin

class Circle : Shape() {

    override fun draw() {
        println("Circle draw.")
    }

    override fun erase() {
        println("Circle erase.")
    }
}
