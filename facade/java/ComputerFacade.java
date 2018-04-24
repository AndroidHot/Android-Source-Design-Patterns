package io.github.androidhot.designpattern.facade.java;

public class ComputerFacade {
    private Computer computer;

    public ComputerFacade() {
        computer = new Computer();
    }

    public void turnOn() {
        computer.getElectricShock();
        computer.makeSound();
        computer.showLoadingScreen();
        computer.IntoMainSystem();
    }

    public void turnOff() {
        computer.closeEverything();
        computer.makeSound();
        computer.pullCurrent();
    }
}
