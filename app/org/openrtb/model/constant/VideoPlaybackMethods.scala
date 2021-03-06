package org.openrtb.model.constant
import tagcade.rtb.auction.model.constant.{Constants, Constant}
trait VideoPlaybackMethod extends Constant {
  final type Value = Int
}

object VideoPlaybackMethods extends Constants[VideoPlaybackMethod] {

  val values: List[VideoPlaybackMethod] =
    List(AutoPlaySoundOn, AutoPlaySoundOff, ClickToPlay, MouseOver)

  case object AutoPlaySoundOn extends VideoPlaybackMethod {
    def value: Int = 1
  }

  case object AutoPlaySoundOff extends VideoPlaybackMethod {
    def value: Int = 2
  }

  case object ClickToPlay extends VideoPlaybackMethod {
    def value: Int = 3
  }

  case object MouseOver extends VideoPlaybackMethod {
    def value: Int = 4
  }

}