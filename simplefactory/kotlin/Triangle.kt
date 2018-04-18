package io.github.androidhot.designpattern.simplefactory.kotlin

class Triangle : Shape() {

    override fun draw() {
        println("Triangle draw.")
    }

    override fun erase() {
        println("Triangle erase.")
    }
}
