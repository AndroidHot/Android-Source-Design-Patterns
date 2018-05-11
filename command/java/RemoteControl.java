package io.github.androidhot.command.java;

// Invoker
public class RemoteControl {
  private Command command;

  public RemoteControl(Command command) {
    this.command = command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void submit() {
    command.execute();
  }
}
