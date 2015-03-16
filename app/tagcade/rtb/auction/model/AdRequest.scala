package tagcade.rtb.auction.model

import java.io._
/**
 * tham so dau vao rat quan trong, phai de trung voi thuoc tinh cua json
 * Created by pc on 16/03/2015.
 */
class AdRequest(val id: String, val imps: Array[Imp]) {

  var idRequest: String = id
  var impsRequest: Array[Imp] = imps

  def validate{
    println("validate xc")
    println("validate yc")
  }


}