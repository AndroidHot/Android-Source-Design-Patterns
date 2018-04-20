package io.github.androidhot.designpattern.singleton.kotlin

// Static Internal Class singleton pattern.
class SicSingleton private constructor() {
    companion object {
        fun getInstance(): SicSingleton {
            return Inner.instance
        }
    }

    private object Inner {
        val instance = SicSingleton()
    }
}
