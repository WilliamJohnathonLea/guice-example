package org.will

import com.google.inject.Inject

class Greeter @Inject() (billingService: BillingService) extends TestTrait {
  val person = "Will"

  def getBilled = billingService.chargeCard(Card(1234, 100), 10)

}
