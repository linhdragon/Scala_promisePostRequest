package org.openrtb.model.bidrequest

import org.openrtb.model.constant.{ BooleanAsInt, ContentCategory }

case class App(id: Option[String], name: Option[String], bundle: Option[String], domain: Option[String],
               storeurl: Option[String], cat: Option[Seq[ContentCategory]], sectioncat: Option[Seq[ContentCategory]],
               pagecat: Option[Seq[ContentCategory]], ver: Option[String], privacypolicy: Option[BooleanAsInt],
               paid: Option[BooleanAsInt], publisher: Option[Publisher], content: Option[Content],
               keywords: Option[String], ext: Option[Any])

object App {

  def minimal: App =
    App(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)

  def recommended(id: String): App = minimal.copy(id = Option(id))

}