package io.github.androidhot.command.java;

// Command
public class TurnOn implements Command {
  private Bulb bulb;

  public TurnOn() {
    bulb = new Bulb();
  }

  @Override
  public void execute() {
    bulb.turnOn();
  }

  @Override
  public void undo() {
    bulb.turnOff();
  }

  @Override
  public void redo() {
    bulb.turnOn();
  }
}
