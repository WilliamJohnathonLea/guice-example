package org.will

import com.google.inject.Injector
import com.google.inject.Guice
import org.will.database.{Controller, MongoModule}

object Main {

  def main(args: Array[String]): Unit = {
    val injector: Injector = Guice.createInjector(new MongoModule())
    val controller = injector.getInstance(classOf[Controller])

    println(controller.get("Hello"))
  }

}
