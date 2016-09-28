package org.will

import com.google.inject.Injector
import com.google.inject.Guice

object Main {

  def main(args: Array[String]): Unit = {
    val injector: Injector = Guice.createInjector(new BillingModule())
    val service = injector.getInstance(classOf[BillingService])
    val greeter = injector.getInstance(classOf[TestTrait])
    val greeter2 = injector.getInstance(classOf[Greeter])

    service.chargeCard(Card(1234, 100), 20)
    println(greeter.greet())
    greeter2.getBilled
  }

}
