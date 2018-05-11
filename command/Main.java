package io.github.androidhot.command;

import io.github.androidhot.command.java.*;

public class Main {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl(new TurnOn());
    remoteControl.submit();
    remoteControl.setCommand(new TurnOff());
    remoteControl.submit();
  }
}
