package org.will

import com.google.inject.AbstractModule

class BillingModule extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[BillingService]).to(classOf[ServiceChargeBillingService])
    bind(classOf[TestTrait]).to(classOf[Greeter])
  }

}
