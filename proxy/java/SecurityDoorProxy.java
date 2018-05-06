package io.github.androidhot.proxy.java;

public class SecurityDoorProxy implements Door {
  private SecurityDoor door;

  public SecurityDoorProxy(SecurityDoor door) {
    this.door = door;
  }

  @Override
  public void open() {
    if (checkPassword()) {
      door.open();
    } else {
      System.out.println("The password is wrong, Please check the password.");
    }
  }

  @Override
  public void close() {
    door.close();
  }

  private boolean checkPassword() {
    return false;
  }
}
