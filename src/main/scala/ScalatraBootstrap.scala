import com.shop.catalogue.api._
import org.scalatra.LifeCycle
import javax.servlet.ServletContext
import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{ApiInfo, JacksonSwaggerBase, Swagger}

class ScalatraBootstrap extends LifeCycle {

  implicit val swagger = new SwaggerConfig

  override def init(context: ServletContext) {
    context.mount(new CategoriesController, "/categories", "categories")
    context.mount (new ApiDocsController, "/api-docs")
  }
}

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

class ApiDocsController(implicit val swagger: Swagger) extends ScalatraServlet with JacksonSwaggerBase
