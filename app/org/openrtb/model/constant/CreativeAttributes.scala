package org.openrtb.model.constant
import tagcade.rtb.auction.model.constant.{Constants, Constant}
trait CreativeAttribute extends Constant {
  final type Value = Int
}

object CreativeAttributes extends Constants[CreativeAttribute] {

  val values: List[CreativeAttribute] =
    List(AutoPlayAudioAd, UserInitiatedAudioAd)

  case object AutoPlayAudioAd extends CreativeAttribute {
    def value: Int = 1
  }

  case object UserInitiatedAudioAd extends CreativeAttribute {
    def value: Int = 2
  }

  // TODO: Others

}
