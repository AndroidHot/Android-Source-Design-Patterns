package io.github.androidhot.designpattern.singleton.kotlin

// Lazy way
class LazySingleton private constructor() {
    companion object {
        val instance: LazySingleton by lazy { LazySingleton() }
    }
}
