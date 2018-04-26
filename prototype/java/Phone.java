package androidhot.github.io.designpatterndemo.prototype.java;

public class Phone implements Cloneable {
    private String name;
    private int price;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public Phone clone() {
        try {
            return (Phone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
