package io.github.androidhot.observer;

import io.github.androidhot.observer.java.Ios;
import io.github.androidhot.observer.java.Ipad;
import io.github.androidhot.observer.java.Iphone;

public class Main {
  public static void main(String[] args) {
    Ios ios = new Ios();
    ios.addObserver(new Ipad());
    ios.addObserver(new Iphone());
    ios.releaseNewSystem();
  }
}
