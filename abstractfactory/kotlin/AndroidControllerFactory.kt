package io.github.androidhot.designpattern.abstractfactory.kotlin

class AndroidControllerFactory : ControllerFactory {
    override fun createInterfaceController(): InterfaceController {
        return AndroidInterfaceController()
    }

    override fun createOperationController(): OperationController {
        return AndroidOperationController()
    }
}
