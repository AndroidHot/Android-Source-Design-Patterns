package io.github.androidhot.designpattern.singleton.java;

// Static Internal Class singleton pattern.
public class SicSingleton {

  private SicSingleton() {

  }

  public static SicSingleton getInstance() {
    return SingletonHolder.sInstance;
  }

  private static class SingletonHolder {
    private static final SicSingleton sInstance = new SicSingleton();
  }
}
