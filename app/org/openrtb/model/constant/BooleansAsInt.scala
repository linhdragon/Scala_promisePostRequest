package org.openrtb.model.constant

import tagcade.rtb.auction.model.constant.{Constants, Constant}

sealed trait BooleanAsInt extends Constant {
  final type Value = Int
}

object BooleansAsInt extends Constants[BooleanAsInt] {

  val values: List[BooleanAsInt] = List(`false`, `true`)

  case object `false` extends BooleanAsInt {
    def value: Int = 0
  }

  case object `true` extends BooleanAsInt {
    def value: Int = 1
  }

}