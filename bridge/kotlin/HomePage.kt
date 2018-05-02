package androidhot.github.io.designpatterndemo.bridge.kotlin

class HomePage(private val theme: Theme) : WebPage(theme) {
    override fun showView() {
        theme.dyeing()
        println("Show HomePage")
    }
}
