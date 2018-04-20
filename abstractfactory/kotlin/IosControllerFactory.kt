package io.github.androidhot.designpattern.abstractfactory.kotlin

class IosControllerFactory : ControllerFactory {
    override fun createInterfaceController(): InterfaceController {
        return IosInterfaceController()
    }

    override fun createOperationController(): OperationController {
        return IosOperationController()
    }
}
