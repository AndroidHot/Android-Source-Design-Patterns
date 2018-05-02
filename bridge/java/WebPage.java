package androidhot.github.io.designpatterndemo.bridge.java;

public abstract class WebPage {
    protected Theme theme;
    public abstract void showView();
    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
