package controllers

import play.api.mvc._
import play.api.libs.json._

import play.api.libs.json.Reads._

/**
 * Json.stringify(json)   -- jsonString
 * Json.prettyPrint(json)   -- jsonString
 * power of these method: convert string into json and revert
 */

object AuctionController extends Controller {

  case class Person(name: String, age: Long)

  def auctionRTB = Action {

    request =>

    def requestData = request.body.asJson.get

    val value: JsValue = Json.parse(Json.prettyPrint(requestData))

    /**
     * create a person
     */

    val person = {
      Person apply("name", (value \ ("age")).as[Long])
    }

    println(person.name)

    println(person.age)

    /**
     * validate name field
     */
    val nameResult: JsResult[String] = (value \ "name").validate[String]

    nameResult match {
      case s: JsSuccess[String] => println("Name: " + s.get)
      case e: JsError => println("Errors: " + JsError.toFlatJson(e).toString())
    }

    /**
     * validate age field
     */
    val ageResult: JsResult[Long] = (value \ "age").validate[Long]

    ageResult match {
      case s: JsSuccess[String] => println("age: " + s.get)
      case e: JsError => println("Errors: " + JsError.toFlatJson(e).toString())
    }

    /**
     * convert from person into json
     * can use 2 methods
     * Json.stringify(json)   -- jsonString
     * Json.prettyPrint(json)   -- jsonString
     */


    Json.prettyPrint(request.body.asJson.get)

    val jsonResult: JsValue = Json.parse(Json.prettyPrint(requestData))

    Ok(jsonResult)

  }

}