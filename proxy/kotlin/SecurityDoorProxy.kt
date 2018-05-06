package io.github.androidhot.proxy.kotlin

class SecurityDoorProxy(private val door: SecurityDoor) : Door {
  override fun open() {
    if (checkPassword()) {
      door.open()
    } else{
      println("The password is wrong, Please check the password.")
    }
  }

  override fun close() {
    door.close()
  }

  private fun checkPassword(): Boolean {
    return false
  }
}
