package tagcade.rtb.auction.service

import tagcade.rtb.auction.model.AdRequest

/**
 * Created by pc on 16/03/2015.
 */
class AuctionService {

  def addInt(a: Int, b: Int): Int = {

    var sum: Int = 0

    sum = a + b

    return sum
  }

  def processRequest(adRequest: AdRequest): String = {

    return "hello"

  }


}
