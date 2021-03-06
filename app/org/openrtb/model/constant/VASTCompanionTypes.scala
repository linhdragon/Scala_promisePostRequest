package org.openrtb.model.constant
import tagcade.rtb.auction.model.constant.{Constants, Constant}
trait VASTCompanionType extends Constant {
  final type Value = Int
}

object VASTCompanionTypes extends Constants[VASTCompanionType] {

  val values: List[VASTCompanionType] =
    List(Static, HTML, Iframe)

  case object Static extends VASTCompanionType {
    def value: Int = 1
  }

  case object HTML extends VASTCompanionType {
    def value: Int = 2
  }

  case object Iframe extends VASTCompanionType {
    def value: Int = 3
  }

}