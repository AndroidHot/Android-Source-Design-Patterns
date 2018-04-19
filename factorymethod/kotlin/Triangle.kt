package io.github.androidhot.designpattern.factorymethod.kotlin

class Triangle : Shape() {
    override fun draw() {
        println("Triangle draw.")
    }

    override fun erase() {
        println("Triangle erase.")
    }
}
