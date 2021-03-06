package org.openrtb.model.constant
import tagcade.rtb.auction.model.constant.{Constants, Constant}
trait ExpandableDirection extends Constant {
  final type Value = Int
}

object ExpandableDirections extends Constants[ExpandableDirection] {

  val values: List[ExpandableDirection] =
    List(Left, Right, Up, Down, Fullscreen)

  case object Left extends ExpandableDirection {
    def value: Int = 1
  }

  case object Right extends ExpandableDirection {
    def value: Int = 2
  }

  case object Up extends ExpandableDirection {
    def value: Int = 3
  }

  case object Down extends ExpandableDirection {
    def value: Int = 4
  }

  case object Fullscreen extends ExpandableDirection {
    def value: Int = 5
  }

}