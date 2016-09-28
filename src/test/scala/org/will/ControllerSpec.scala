package org.will

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner
import org.will.database.{Controller, MongoConnection, MongoSearchService}

/**
  * Created by william on 28/09/16.
  */
@RunWith(classOf[JUnitRunner])
class ControllerSpec extends FlatSpec with Matchers {

  val controller = new Controller(new MongoSearchService(new MongoConnection()))

  "get" should "return a value if one is found" in {
    controller.get("Hello") shouldBe Some("world!")
  }

  it should "return nothing if no value is found" in {
    controller.get("fail") shouldBe None
  }

}
