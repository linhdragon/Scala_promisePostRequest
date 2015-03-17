package tagcade.rtb.auction.service

import org.openrtb.model.bidrequest.BidRequest
import tagcade.rtb.auction.model.{AdDetail, AdRequest}
import tagcade.rtb.auction.builder.{BidRequestBuilder, AdDetailBuilder}

import scala.concurrent.Future


class AuctionService {

  def addInt(a: Int, b: Int): Int = {

    var sum: Int = 0

    sum = a + b

    return sum
  }

  def processRequest(adRequest: AdRequest): String = {

    /**
     * load AdDetail
     */
    val adDetail: AdDetail = new AdDetailBuilder(adRequest).createAdRequest();

    /**
     * BidRequest
     */
    val bidRequest: BidRequest = new BidRequestBuilder(adRequest, adDetail).createBidRequest()

    /**
     * DSP requestor
     */
    val dspRequestor: DSPRequestor = new DSPRequestor

    /**
     * broadcast
     */
    val listResponses: List[Future[String]] = dspRequestor.broadcastBidRequest(bidRequest)

    /**
     * pickWinner
     */

    val winningBidList = null

    return "hello"

  }


  def findWinningBids(bidRequest: BidRequest,listResponses : List[Future[String]] ): List[Future[String]] = {



    null

  }


}
