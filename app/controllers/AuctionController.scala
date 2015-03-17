package controllers


import tagcade.rtb.auction.model.AdRequest

import tagcade.rtb.auction.service.AuctionService

import scala.concurrent.ExecutionContext.Implicits.global

import play.api.mvc._

import play.api.Play.current

import play.api.libs.ws._

import play.api.libs.json._

import net.liftweb.json.DefaultFormats


object AuctionController extends Controller {

  def auctionRTB = Action.async{

    request =>

      def requestData = request.body.asJson.get

      implicit val adRequest: JsValue = Json.parse(Json.prettyPrint(requestData))

      /**
       * start
       *
       * case class RequestA(id: String, imps: Array[RequestB])
       * case class RequestB(id: String)
      */
      implicit val formats = DefaultFormats

      // simulate a json string

      val adRequest_String = Json.prettyPrint(requestData)

      val jvAdRequest = net.liftweb.json.JsonParser.parse(adRequest_String)

      val adRequestData:AdRequest = jvAdRequest.extract[AdRequest]

      /**
       * test auction service
       */
      val auctionService = new AuctionService

      val sum = auctionService.addInt(2,3)

      println("Sum: "+ sum)

      /**
       * processRequest
       */
      val process = auctionService.processRequest(adRequestData)
      /*println("processAdRequest: "+process)*/

      /**
       * end
       */
      WS.url("http://localhost:9000/rtb/getAd").post(adRequest).map{
        response =>
          Ok(response.body).as("application/json")
      }



  }
}