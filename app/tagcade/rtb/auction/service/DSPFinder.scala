package tagcade.rtb.auction.service

import org.openrtb.model.bidrequest.BidRequest
import tagcade.rtb.auction.model.DSP

/**
 * note for that
 * val: final
 * var: non final
 */
class DSPFinder(bidRequest: BidRequest) {

  def findDSP: List[DSP] = {

    var dspList: List[DSP] = List()

    val timeout: Int = 100

    val number_of_dsp: Int = 10

    /*var i = 0*/

    for(i <- 0 to number_of_dsp){

      val dsp: DSP = DSP.minimal("" + i, "http://localhost:9000/rtb/bid", timeout)

      dspList = dspList:+ dsp

    }

    /**
     * it does not need to use return key word
     */
    dspList

  }

}
