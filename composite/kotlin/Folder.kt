package androidhot.github.io.designpatterndemo.composite.kotlin

class Folder(private val folderName: String) : AbstractFile() {
    private var abstractFiles = ArrayList<AbstractFile>()
    override fun add(abstractFile: AbstractFile) {
        abstractFiles.add(abstractFile)
    }

    override fun remove(abstractFile: AbstractFile) {
        abstractFiles.remove(abstractFile)
    }

    override fun getChild(index: Int): AbstractFile {
        return abstractFiles[index]
    }

    override fun killVirus() {
        println("Kill folder $folderName virus.")
        for (abstractFile in abstractFiles) {
            abstractFile.killVirus()
        }
    }
}
