import com.shop.catalogue.api._
import org.scalatra.LifeCycle
import javax.servlet.ServletContext
import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{ApiInfo, JacksonSwaggerBase, Swagger}

class ScalatraBootstrap extends LifeCycle {

  val swagger = new SwaggerConfig

  override def init(context: ServletContext) {
    context.mount(new CategoriesController(swagger), "/categories", "categories")
    context.mount (new ApiDocsController(swagger), "/api-docs")
  }
}

class ApiDocsController(val swagger: Swagger) extends ScalatraServlet with JacksonSwaggerBase
