package io.github.androidhot.proxy.java;

public class SecurityDoor implements Door {
  @Override
  public void open() {
    System.out.println("Opening security door.");
  }

  @Override
  public void close() {
    System.out.println("Closing the security door.");
  }
}
