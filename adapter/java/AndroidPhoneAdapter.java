package androidhot.github.io.designpatterndemo.adapter.java;

public class AndroidPhoneAdapter implements ApplePhone {
    private AndroidPhone androidPhone;

    public AndroidPhoneAdapter() {
        androidPhone = new AndroidPhone();
    }

    @Override public void operatingSystem() {
        androidPhone.androidSystem();
    }
}
