package org.will.database

import com.google.inject.AbstractModule

/**
  * Created by william on 28/09/16.
  */
class MongoModule extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[SearchService]).to(classOf[MongoSearchService])
  }

}
