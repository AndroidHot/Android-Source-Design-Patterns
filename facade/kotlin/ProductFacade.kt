package io.github.androidhot.designpattern.facade.kotlin

class ProductFacade() {
    private var engineers = ArrayList<SoftwareEngineer>()

    fun buildProduct() {
        for (engineer: SoftwareEngineer in engineers) {
            engineer.buildApplication()
        }
    }

    init {
        engineers.add(AndroidEngineer())
        engineers.add(IosEngineer())
        engineers.add(WebEngineer())
    }
}
