package io.github.androidhot.designpattern.facade.kotlin

class AndroidEngineer() : SoftwareEngineer() {
    override fun buildApplication() {
        println("Build Android Application.")
    }
}
