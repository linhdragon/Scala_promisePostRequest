package controllers

import scala.concurrent.ExecutionContext.Implicits.global
import play.api.mvc._
import play.api.libs.json._
import play.api.Play.current
import play.api.libs.ws._

object TestAuctionController extends Controller {


  def index = Action.async{

    val data = Json.obj(
      "key1" -> "value1",
      "key2" -> "value2"
    )

    WS.url("http://localhost:9000/rtb/getAd").post(data).map{
      response =>
        Ok(response.body).as("text/html")
    }

  }
}