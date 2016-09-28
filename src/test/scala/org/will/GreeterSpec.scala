package org.will

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class GreeterSpec extends FlatSpec with Matchers {

  "greet" should "say hello" in {
    val greeter = new Greeter(new StandardBillingService)

    greeter.greet() shouldBe "Hello Will"
  }

}
