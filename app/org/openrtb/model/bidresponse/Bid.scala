package org.openrtb.model.bidresponse

import org.openrtb.model.constant.{ ContentCategory, CreativeAttribute }

case class Bid(id: String, impid: String, price: Float, adid: Option[String], nurl: Option[String], adm: Option[String],
               adomain: Option[Seq[String]], bundle: Option[String], iurl: Option[String], cid: Option[String],
               crid: Option[String], cat: Option[Seq[ContentCategory]], attr: Option[Seq[CreativeAttribute]],
               dealid: Option[String], h: Option[Int], w: Option[Int], ext: Option[Any])

object Bid {

  def minimal(id: String, impid: String, price: Float): Bid =
    Bid(id, impid, price, None, None, None, None, None, None, None, None, None, None, None, None, None, None)

}
