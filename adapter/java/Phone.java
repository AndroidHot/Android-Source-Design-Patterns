package androidhot.github.io.designpatterndemo.adapter.java;

public class Phone {
    private ApplePhone applePhone;

    public Phone() {}

    public Phone(ApplePhone applePhone) {
        this.applePhone = applePhone;
    }

    public void setApplePhone(ApplePhone applePhone) {
        this.applePhone = applePhone;
    }

    public void operatingSystem() {
        applePhone.operatingSystem();
    }
}
