package io.github.androidhot.command.java;

// Command
public class TurnOff implements Command {
  private Bulb bulb;

  public TurnOff() {
    bulb = new Bulb();
  }

  @Override
  public void execute() {
    bulb.turnOff();
  }

  @Override
  public void undo() {
    bulb.turnOn();
  }

  @Override
  public void redo() {
    bulb.turnOff();
  }
}
