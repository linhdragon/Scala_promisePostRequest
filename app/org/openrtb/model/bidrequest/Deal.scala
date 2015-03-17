package org.openrtb.model.bidrequest

import org.openrtb.model.constant.AuctionType

case class Deal(id: String, bidfloor: Option[Float], bidfloorcur: Option[String], at: Option[AuctionType],
                wseat: Option[Seq[String]], wadomain: Option[Seq[String]], ext: Option[Any])

object Deal {

  def minimal(id: String): Deal = Deal(id, None, None, None, None, None, None)

}