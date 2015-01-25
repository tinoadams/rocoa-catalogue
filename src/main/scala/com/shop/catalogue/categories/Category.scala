package com.shop.catalogue.categories

// A Category object to use as a data model
case class Category(slug: String, searchTerm: String)

// An amazing datastore!
object CategoryData {

  /**
   * Some fake Categories data so we can simulate retrievals.
   */
  var all = List(
    new Category("yellow-tulip", "Yellow Tulip"),
    new Category("red-rose", "Red Rose"),
    new Category("black-rose", "Black Rose"))
}