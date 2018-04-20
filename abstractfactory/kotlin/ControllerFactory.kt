package io.github.androidhot.designpattern.abstractfactory.kotlin

interface ControllerFactory {
    fun createInterfaceController() : InterfaceController
    fun createOperationController() : OperationController
}
