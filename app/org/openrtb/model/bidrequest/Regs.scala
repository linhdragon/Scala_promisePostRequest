package org.openrtb.model.bidrequest

import org.openrtb.model.constant.BooleanAsInt

case class Regs(coppa: Option[BooleanAsInt], ext: Option[Any])

object Regs {

  def minimal: Regs = Regs(None, None)

}