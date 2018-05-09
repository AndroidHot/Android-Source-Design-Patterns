package io.github.androidhot.observer.java;

import java.util.Observable;

public class Ios extends Observable {
  public void releaseNewSystem() {
    this.setChanged();
    this.notifyObservers();
  }
}
