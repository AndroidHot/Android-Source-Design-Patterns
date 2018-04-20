package io.github.androidhot.designpattern.abstractfactory.java;

public interface ControllerFactory {
    InterfaceController createInterfaceController();
    OperationController createOperationController();
}
