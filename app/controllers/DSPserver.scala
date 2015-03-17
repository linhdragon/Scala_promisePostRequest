package controllers

import play.api._
import play.api.libs.json.{Json, JsValue}
import play.api.mvc._

object DSPserver extends Controller {

  /**
   * requestBid data
   */

  def requestDSPBid = Action { request =>

    val adRequest = request.body.asJson.get

    Ok(adRequest)

  }

  def tagCadeAuction = Action { request =>

    val adRequest = request.body.asJson.get

    Ok(adRequest)

  }
}