package org.openrtb.model.constant
import tagcade.rtb.auction.model.constant.{Constants, Constant}
trait SourceRelationship extends Constant {
  final type Value = Int
}

object SourceRelationships extends Constants[SourceRelationship] {

  val values: List[SourceRelationship] =
    List(Indirect, Direct)

  case object Indirect extends SourceRelationship {
    def value: Int = 0
  }

  case object Direct extends SourceRelationship {
    def value: Int = 1
  }

}