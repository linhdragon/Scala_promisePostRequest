package org.openrtb.model.bidresponse

import org.openrtb.model.constant._

case class SeatBid(bid: Array[Bid], seat: Option[String], group: Option[BooleanAsInt], ext: Option[Any])

object SeatBid {

  def minimal(bid: Array[Bid]): SeatBid = SeatBid(bid, None, None, None)

}