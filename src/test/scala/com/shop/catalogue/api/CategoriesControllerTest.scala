package com.shop.catalogue.api

import collection.mutable.Stack
import org.scalatest._
import org.scalatra.test.scalatest._

class CategoriesControllerTest extends ScalatraSuite with FunSuiteLike with Matchers {
  val swagger = new SwaggerConfig
  addServlet(new CategoriesController(swagger), "/categories")

  test("simple get") {
    get("/categories") {
      status should equal(200)
      body should include("""[{"slug":"yellow-tulip","searchTerm":"Yellow Tulip"},{"slug":"red-rose","searchTerm":"Red Rose"},{"slug":"black-rose","searchTerm":"Black Rose"}]""")
    }
  }
}
