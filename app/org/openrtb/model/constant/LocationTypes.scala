package org.openrtb.model.constant
import tagcade.rtb.auction.model.constant.{Constants, Constant}
trait LocationType extends Constant {
  final type Value = Int
}

object LocationTypes extends Constants[LocationType] {

  val values: List[LocationType] =
    List(GPS, IP, UserProvided)

  case object GPS extends LocationType {
    def value: Int = 1
  }

  case object IP extends LocationType {
    def value: Int = 2
  }

  case object UserProvided extends LocationType {
    def value: Int = 3
  }

}