package org.will.database

/**
  * Created by william on 28/09/16.
  */
trait SearchService {

  def search(key: String): Option[String]

}
