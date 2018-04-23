package androidhot.github.io.designpatterndemo.composite.java;

public class TextFile extends AbstractFile {
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }
    @Override public void add(AbstractFile abstractFile) {

    }


    @Override public void remove(AbstractFile abstractFile) {

    }


    @Override public AbstractFile getChild(int index) {
        return null;
    }


    @Override public void killVirus() {
        System.out.println("Kill file " + fileName + " virus.");
    }
}
