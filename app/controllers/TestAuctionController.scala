package controllers

import net.liftweb.json.{JValue, DefaultFormats}
import tagcade.rtb.auction.model.{AdRequest, Imp}

import scala.concurrent.ExecutionContext.Implicits.global

import play.api.mvc._

import play.api.Play.current

import play.api.libs.ws._

import play.api.libs.json._

import play.api.libs.functional.syntax._

import scala.collection.mutable._
import net.liftweb.json._
import net.liftweb.json.DefaultFormats
import net.liftweb.json.JsonParser.parse




import net.liftweb.json.JsonParser._


object TestAuctionController extends Controller {


  def index = Action.async{

    request =>

      def requestData = request.body.asJson.get

      implicit val adRequest: JsValue = Json.parse(Json.prettyPrint(requestData))
      /**
       * start
       */
      case class RequestA(id: String, imps: Array[RequestB])
      case class RequestB(id: String)

      implicit val formats = DefaultFormats

      // simulate a json string

      var ooo = Json.prettyPrint(requestData)

      val jValue2 = net.liftweb.json.JsonParser.parse(ooo)
      println(jValue2)

      val adRequest1 = jValue2.extract[RequestA]
      println(adRequest1.id)

      val rs = jValue2.extract[AdRequest]
      println(rs.id)
      println(rs.impsRequest)
      val arrImp: Array[Imp]= rs.impsRequest

      println(arrImp(0).id)
      println(arrImp(0).impId)


      println(arrImp(1).id)
      println(arrImp(1).impId)


      /**
       * end
       */

      WS.url("http://localhost:9000/rtb/getAd").post(adRequest).map{
        response =>
          Ok(response.body).as("application/json")
      }



  }
}