package androidhot.github.io.designpatterndemo.composite.kotlin

class TextFile(private val fileName: String) : AbstractFile() {
    override fun add(abstractFile: AbstractFile) {}

    override fun remove(abstractFile: AbstractFile) {}

    override fun getChild(index: Int): AbstractFile? {
        return null
    }

    override fun killVirus() {
        println("Kill file $fileName virus.")
    }
}
