package io.github.androidhot.designpattern.facade.kotlin

class IosEngineer() : SoftwareEngineer() {
    override fun buildApplication() {
        println("Build iOS Application.")
    }
}
