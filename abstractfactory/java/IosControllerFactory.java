package io.github.androidhot.designpattern.abstractfactory.java;

public class IosControllerFactory implements ControllerFactory {
    @Override public InterfaceController createInterfaceController() {
        return new IosInterfaceController();
    }


    @Override public OperationController createOperationController() {
        return new IosOperationController();
    }
}
