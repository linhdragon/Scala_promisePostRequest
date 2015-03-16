package controllers

import scala.concurrent.ExecutionContext.Implicits.global
import play.api.mvc._
import play.api.libs.json._
import play.api.Play.current
import play.api.libs.ws._

object TestAuctionController extends Controller {


  def index = Action.async{

    request =>

      def requestData = request.body.asJson.get

      val data: JsValue = Json.parse(Json.prettyPrint(requestData))


    WS.url("http://localhost:9000/rtb/getAd").post(data).map{
      response =>
        Ok(response.body).as("application/json")
    }

  }
}