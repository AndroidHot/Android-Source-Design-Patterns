package io.github.androidhot.singleton;

// Double Check Lock Singleton pattern.
public class DclSingleton {
  private static DclSingleton sInstance = null;

  private DclSingleton() {

  }

  public static DclSingleton getInstance() {
    if (sInstance == null) {
      synchronized (DclSingleton.class) {
        if (sInstance == null) {
          sInstance = new DclSingleton();
        }
      }
    }
    return sInstance;
  }
}
