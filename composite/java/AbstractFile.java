package androidhot.github.io.designpatterndemo.composite.java;

public abstract class AbstractFile {
    public abstract void add(AbstractFile abstractFile);
    public abstract void remove(AbstractFile abstractFile);
    public abstract AbstractFile getChild(int index);
    public abstract void killVirus();
}
