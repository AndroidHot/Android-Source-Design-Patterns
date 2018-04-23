package androidhot.github.io.designpatterndemo.composite.kotlin

abstract class AbstractFile {
    abstract fun add(abstractFile: AbstractFile)
    abstract fun remove(abstractFile: AbstractFile)
    abstract fun getChild(index: Int): AbstractFile?
    abstract fun killVirus()
}
