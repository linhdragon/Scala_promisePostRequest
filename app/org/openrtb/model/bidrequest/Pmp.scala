package org.openrtb.model.bidrequest

import org.openrtb.model.constant.BooleanAsInt

case class Pmp(private_auction: Option[BooleanAsInt], deals: Option[Seq[Deal]], ext: Option[Any])

object Pmp {

  def minimal: Pmp = Pmp(None, None, None)

}
