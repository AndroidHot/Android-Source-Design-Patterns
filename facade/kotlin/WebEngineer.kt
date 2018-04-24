package io.github.androidhot.designpattern.facade.kotlin

class WebEngineer() : SoftwareEngineer() {
    override fun buildApplication() {
        println("Build Web Application.")
    }
}
