package androidhot.github.io.designpatterndemo.adapter.kotlin

public class AndroidPhoneAdapter: ApplePhone {
    private var androidPhone: AndroidPhone? = null

    init {
        this.androidPhone = AndroidPhone()
    }

    override fun operatingSystem() {
        androidPhone?.androidSystem()
    }
}
