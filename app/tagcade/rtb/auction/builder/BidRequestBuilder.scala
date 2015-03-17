package tagcade.rtb.auction.builder

import org.openrtb.model.bidrequest.{Imp, BidRequest}
import play.api.libs.json.Json
import tagcade.rtb.auction.model.{AdDetail, AdRequest}


import scala.collection.mutable._
import net.liftweb.json._
import net.liftweb.json.Serialization.write

class BidRequestBuilder(adRequest: AdRequest, adDetail: AdDetail) {

  def createBidRequest(): BidRequest ={

    def generateBidRequestId: String = {

      return "12323"

    }
    /**
     * create an array with size equals nof_Impression from request
     */
    val number_of_impression: Int = adRequest.imps.length;

    val impss: Array[Imp] = new Array[Imp](number_of_impression)

    def generateIMPs(nIMPs: Int): Array[Imp] = {

      val i = 0;

      for(i <- 0 to nIMPs){

        /**
         * mapping id to id_imp from adRequest
         */
        val imp: Imp = Imp.minimal(adRequest.imps.apply(i).id_Imp)

        impss(i) = imp
      }

      return impss
    }

    /**
     * param: id and Array[IMP]
     */
    val bidRequest: BidRequest = BidRequest.minimal(generateBidRequestId, generateIMPs(number_of_impression -1))

    /**
     * test data
     */

    implicit val formats = DefaultFormats

    val jsonString = write(bidRequest)

    println("Test bidRequest: "+jsonString)

    /**
     * end test data
     */

    return bidRequest

  }

}
