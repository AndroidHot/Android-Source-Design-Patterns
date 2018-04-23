package androidhot.github.io.designpatterndemo.composite.java;

import java.util.ArrayList;

public class Folder extends AbstractFile {
    private ArrayList<AbstractFile> abstractFiles = new ArrayList<>();
    private String folderName;

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    @Override public void add(AbstractFile abstractFile) {
        abstractFiles.add(abstractFile);
    }


    @Override public void remove(AbstractFile abstractFile) {
        abstractFiles.remove(abstractFile);
    }


    @Override public AbstractFile getChild(int index) {
        return abstractFiles.get(index);
    }


    @Override public void killVirus() {
        System.out.println("Kill folder " + folderName + " virus.");
        for (AbstractFile file: abstractFiles) {
            file.killVirus();
        }
    }
}
