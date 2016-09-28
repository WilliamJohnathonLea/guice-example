package org.will

trait TestTrait {
  self: Greeter =>

  def greet() = s"Hello $person"

}
