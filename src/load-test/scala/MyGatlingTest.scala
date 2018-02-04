
import com.shopdirect.maximoautomation.ServiceApplication
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import org.springframework.boot.SpringApplication
import org.springframework.context.ConfigurableApplicationContext

import scala.concurrent.duration._
import scalaj.http._

class MyGatlingTest extends Simulation {

  val app: ConfigurableApplicationContext = SpringApplication.run(classOf[ServiceApplication])
  Runtime.getRuntime.addShutdownHook(new Thread() {
    override def run(): Unit = app.stop()
  })

  val baseUrl = "http://localhost:8080"

  val addBody =
    """{"buildId":"build", "url":"http://jenkins:8080/job/test/123/", "time":"2012-04-23T18:25:43.511Z",
      |"vcHash":"665169b62d95c73d0de89337fa7ea6622c1a08c2", "vcTag":"1.1", "vcBranch":"test", "vcDescription":"description"}""".stripMargin

  val httpProtocol = http
    .baseURL(baseUrl)
    .inferHtmlResources()
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate, sdch")
    .acceptLanguageHeader("en-US,en;q=0.8")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36")
    .contentTypeHeader("application/json")

  val healthScn = scenario("Health").exec(Health.request)

  val addBuildScn = scenario("Adding new build").exec(AddBuild.request)

  val updateBuildScn = scenario("Updating an existing build").exec(UpdateBuild.request)

  val getAllBuildsScn = scenario("Get all builds").exec(GetAllBuilds.request)

  val getBuildScn = scenario("Get build").exec(GetBuild.request)

  setUp(
    healthScn.inject(constantUsersPerSec(1) during(5 seconds)),
    addBuildScn.inject(constantUsersPerSec(1) during(5 seconds)),
    updateBuildScn.inject(constantUsersPerSec(1) during(5 seconds)),
    getAllBuildsScn.inject(constantUsersPerSec(1) during(5 seconds)),
    getBuildScn.inject(constantUsersPerSec(1) during(5 seconds))
  ).assertions(
    global.successfulRequests.percent.is(100)
  ).protocols(httpProtocol)

  object Health {
    val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

    val request = http("Call Health Endpoint")
      .get("/health")
      .headers(headers_0)
  }

  object AddBuild {
    val request = http("Post new build details to Build endpoint")
      .post("/buildinfo")
      .body(StringBody(addBody))
  }

  object UpdateBuild {
    val dbId = Http(baseUrl + "/buildinfo").postData(addBody).header("Content-Type", "application/json").header("Charset", "UTF-8").asString

    val updateBody = "{\"id\":\"" + dbId.body + "\", \"time\":\"2012-04-23T18:25:43.511Z\", \"status\":\"SUCCESS\"}"

    val request = http("Post build update details to build endpoint")
      .put("/buildinfo")
      .body(StringBody(updateBody))
  }

  object GetAllBuilds {
    val request = http("Get all stored build from build endpoint")
        .get("/buildinfo")
  }

  object GetBuild {
    val buildId = scala.util.Random.alphanumeric.take(10).mkString

    val body =
      "{\"buildId\":\"" + buildId + "\", \"url\":\"http://jenkins:8080/job/test/123/\", \"time\":\"2012-04-23T18:25:43.511Z\"," +
        "\"vcHash\":\"665169b62d95c73d0de89337fa7ea6622c1a08c2\", \"vcTag\":\"1.1\", \"vcBranch\":\"test\", \"vcDescription\":\"description\"}"

    Http(baseUrl + "/buildinfo").postData(body).header("Content-Type", "application/json").header("Charset", "UTF-8").asString

    val request = http("Get a stored build from build endpoint")
      .get("/buildinfo/" + buildId)
  }
}