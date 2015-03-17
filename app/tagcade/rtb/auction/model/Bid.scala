package tagcade.rtb.auction.model

class Bid(id: String, impId: String, price: Float, adid: String, nUrl: String, adm: String, adomain:String, lurl:String, cid:String, crid:String, attr:Array[Int], dealId:String, h: Int, w:Int, ext:String ) {

  val idBid: String = impId
  val impIdBid: String= impId
  val priceBid: Float= price
  val adidBid: String= adid
  val nUrlBid: String= nUrl
  val admBid: String= adm
  val adomainBid:String= adomain
  val lurlBid:String= lurl
  val cidBid:String= cid
  val cridBid:String= crid
  val attrBid:Array[Int]= attr
  val dealIdBid:String= dealId
  val hBid: Int= h
  val wBid:Int= w
  val extBid:String= ext
}
