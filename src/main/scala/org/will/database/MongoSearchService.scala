package org.will.database

import com.google.inject.Inject

/**
  * Created by william on 28/09/16.
  */
class MongoSearchService @Inject() (conn: MongoConnection) extends SearchService {

  override def search(key: String): Option[String] = conn.collection.get(key)

}
