package org.will

/**
* A base class for billing services. This leaves a billing service able to define
* how they bill a customer.
*
* For example, a service may just bill a customer's card for a given amount; or they
* could add a service charge to the bill.
*/
abstract class BillingService {

  def chargeCard(card: Card, amount: Int): Unit

}

class StandardBillingService extends BillingService {

  override def chargeCard(card: Card, amount: Int): Unit = {
    println(s"Original balance on card no. ${card.number}: £${card.balance}")
    println(s"Charging £$amount")
    println(s"New balance on card no. ${card.number}: £${card.balance - amount}")
  }

}

class ServiceChargeBillingService extends BillingService {

  private val serviceCharge: Int = 5

  override def chargeCard(card: Card, amount: Int): Unit = {
    println(s"Original balance on card no. ${card.number}: £${card.balance}")
    println(s"Charging £$amount with service charge of £$serviceCharge")
    println(s"New balance on card no. ${card.number}: £${card.balance - amount - serviceCharge}")
  }

}
