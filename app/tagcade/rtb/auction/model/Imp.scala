package tagcade.rtb.auction.model

/**
 * tham so dau vao rat quan trong, phai de trung ten voi thuoc tinh json
 * Created by pc on 16/03/2015.
 */

class Imp(val id:String, val typeOf: String, val width: Float, val height: Float) {

  var id_Imp = id

  var type_Imp = typeOf

  var w_Imp = width

  var height_Imp = height

  def validate{

    println("validate IMP")

  }

}
