package org.openrtb.model.bidrequest

import org.openrtb.model.constant.{ AuctionType, BooleanAsInt }

case class BidRequest(id: String, imp: Array[Imp], site: Option[Site], app: Option[App],
                      device: Option[Device], user: Option[User], test: Option[BooleanAsInt], at: Option[AuctionType],
                      tmax: Option[Int], wseat: Option[Seq[String]], allimps: Option[BooleanAsInt],
                      cur: Option[Seq[String]], bcat: Option[Seq[String]], badv: Option[Seq[String]],
                      regs: Option[Regs], ext: Option[Any])

object BidRequest {

  def minimal(id: String, imp: Array[Imp]): BidRequest =
    BidRequest(id, imp, None, None, None, None, None, None, None, None, None, None, None, None, None, None)

  def recommended(id: String, imp: Array[Imp], device: Device, user: User): BidRequest =
    minimal(id, imp).copy(device = Option(device), user = Option(user))

  def recommendedForApp(id: String, imp: Array[Imp], app: App, device: Device, user: User): BidRequest =
    recommended(id, imp, device, user).copy(app = Option(app))

  def recommendedForSite(id: String, imp: Array[Imp], site: Site, device: Device, user: User): BidRequest =
    recommended(id, imp, device, user).copy(site = Option(site))

}