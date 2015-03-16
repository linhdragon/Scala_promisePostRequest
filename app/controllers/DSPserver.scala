package controllers

import play.api._
import play.api.libs.json.{Json, JsValue}
import play.api.mvc._

object DSPserver extends Controller {

  def tagCadeAuction = Action { request =>

    def requestData = request.body.asJson.get

    Ok(requestData)

  }
}