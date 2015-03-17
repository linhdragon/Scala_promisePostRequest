package org.openrtb.model.constant
import tagcade.rtb.auction.model.constant.{Constants, Constant}
trait ContentDeliveryMethod extends Constant {
  final type Value = Int
}

object ContentDeliveryMethods extends Constants[ContentDeliveryMethod] {

  val values: List[ContentDeliveryMethod] = List(Streaming, Progressive)

  case object Streaming extends ContentDeliveryMethod {
    def value: Int = 1
  }

  case object Progressive extends ContentDeliveryMethod {
    def value: Int = 2
  }

}
