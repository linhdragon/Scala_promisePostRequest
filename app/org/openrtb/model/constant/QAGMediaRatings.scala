package org.openrtb.model.constant

trait QAGMediaRating extends Constant {
  final type Value = Int
}

object QAGMediaRatings extends Constants[QAGMediaRating] {

  val values: List[QAGMediaRating] =
    List(All, Over12, Mature)

  case object All extends QAGMediaRating {
    def value: Int = 1
  }

  case object Over12 extends QAGMediaRating {
    def value: Int = 2
  }

  case object Mature extends QAGMediaRating {
    def value: Int = 3
  }

}