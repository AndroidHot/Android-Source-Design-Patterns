package androidhot.github.io.designpatterndemo.builder.java;

public class Phone {
  // Required parameters
  private final String mName;
  private final float mPrice;

  // Optional parameters
  private final String mCpu;
  private final int mMemory;
  private final int mStorage;
  private final float mWeight;

  private Phone(Builder builder) {
    mName = builder.name;
    mPrice = builder.price;
    mCpu = builder.cpu;
    mMemory = builder.memory;
    mStorage = builder.storage;
    mWeight = builder.weight;
  }

  // some function

  public static class Builder {
    // Required parameters
    private final String name;
    private final float price;

    // Optional parameters, initialized to default values.
    private String cpu = "";
    private int memory = 0;
    private int storage = 0;
    private float weight = 0;

    public Builder(String name, float price) {
      this.name = name;
      this.price = price;
    }

    public Builder setCpu(String cpu) {
      this.cpu = cpu;
      return this;
    }

    public Builder setMemory(int memory) {
      this.memory = memory;
      return this;
    }

    public Builder setStorage(int storage) {
      this.storage = storage;
      return this;
    }

    public Builder setWeight(float weight) {
      this.weight = weight;
      return this;
    }

    public Phone build() {
      return new Phone(this);
    }
  }
}
