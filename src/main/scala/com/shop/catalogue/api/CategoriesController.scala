package com.shop.catalogue.api

import org.scalatra._
import org.scalatra.swagger._
import org.scalatra.json._
import org.json4s.{DefaultFormats, Formats}
import com.shop.catalogue.categories._

class CategoriesController(val swagger: Swagger) extends ScalatraServlet with JacksonJsonSupport with SwaggerSupport  {

  // Sets up automatic case class to JSON output serialization, required by the JValueResult trait.
  protected implicit val jsonFormats: Formats = DefaultFormats

  // A description of our application. This will show up in the Swagger docs.
  protected val applicationDescription = "Operations for browsing and searching product categories"

  // Before every action, set the content type to be in JSON format.
  before() {
    contentType = formats("json")
  }

  val getCategories =
    (apiOperation[List[Category]]("getCategories")
      summary "Show all Categories"
      notes "Shows all the Categories in the shop. You can search it too."
      parameter queryParam[Option[String]]("search").description("A search term"))

  get("/", operation(getCategories)){
    params.get("search") match {
      case Some(searchTerm) => CategoryData.all filter (_.searchTerm.toLowerCase contains searchTerm.toLowerCase())
      case None => CategoryData.all
    }
  }
}