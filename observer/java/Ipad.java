package io.github.androidhot.observer.java;

import java.util.Observable;
import java.util.Observer;

public class Ipad implements Observer {
  @Override
  public void update(Observable o, Object arg) {
    System.out.println("iPad have available updates.");
  }
}
