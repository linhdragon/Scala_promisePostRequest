package org.openrtb.model.constant

trait Gender extends Constant {
  final type Value = String
}

object Genders extends Constants[Gender] {

  val values: List[Gender] =
    List(Male, Female, Other)

  case object Male extends Gender {
    def value: String = "M"
  }

  case object Female extends Gender {
    def value: String = "F"
  }

  case object Other extends Gender {
    def value: String = "O"
  }

}