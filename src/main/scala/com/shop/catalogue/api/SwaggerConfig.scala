package com.shop.catalogue.api

import org.scalatra.swagger.{ApiInfo, JacksonSwaggerBase, Swagger}

class SwaggerConfig extends Swagger(
	Swagger.SpecVersion,
	"1", 
	new ApiInfo(
	    "The Shop Catalogue API",
	    "Docs for the Catalogue API",
	    "http://thoughtworks.com",
	    "apiteam@thoughtworks.com",
	    "MIT",
	    "http://opensource.org/licenses/MIT"
    )
)
