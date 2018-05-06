package io.github.androidhot.proxy.kotlin

class SecurityDoor : Door {
  override fun open() {
    println("Opening security door.")
  }

  override fun close() {
    println("Closing the security door.")
  }
}
