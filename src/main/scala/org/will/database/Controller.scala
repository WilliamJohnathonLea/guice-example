package org.will.database

import com.google.inject.{Inject, Singleton}

/**
  * Created by william on 28/09/16.
  */
@Singleton
class Controller @Inject() (searchService: SearchService) {

  def get(key: String) = searchService.search(key)

}
