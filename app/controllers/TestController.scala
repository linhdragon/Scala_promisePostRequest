package controllers

import play.api._
import play.api.libs.json.{Json, Writes}
import play.api.mvc._

object TestController extends Controller {

  case class Person(name: String, age: Long)

  def index = Action { request =>

    implicit object PersonWiter extends Writes[Person] {
      def writes(p: Person) = Json.obj(
        "name" -> Json.toJson(p.name),
        "age" -> Json.toJson(p.age)
      )
    }

    println(PersonWiter);


    Ok("Hello World")
  }
}