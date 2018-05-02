package androidhot.github.io.designpatterndemo.bridge.kotlin

class AboutPage(private val theme: Theme) : WebPage(theme) {
    override fun showView() {
        theme.dyeing()
        println("Show AboutPage.")
    }
}
