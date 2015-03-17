package tagcade.rtb.auction.service

import net.liftweb.json.DefaultFormats
import net.liftweb.json.Serialization._
import org.openrtb.model.bidrequest.BidRequest
import play.api.libs.json.{Json, JsValue}
import play.api.libs.ws.WS
import tagcade.rtb.auction.model.DSP
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.Play.current

import scala.concurrent.Future


class DSPRequestor {

  def broadcastBidRequest(bidRequest: BidRequest): List[Future[String]] = {

    val dspFinder: DSPFinder = new DSPFinder(bidRequest)

    val dspList:List[DSP] = dspFinder.findDSP

    var futureResponseList: List[Future[String]] = List()

    var futureResponse:Future[String] =  null

    val irt = dspList.toIterator

    implicit val formats = DefaultFormats

    val jsonString = write(bidRequest)

    /*println("Test bidRequest: "+jsonString)*/

    while (irt.hasNext){

      val dsp = irt.next()

      futureResponse = WS.url(dsp.rtbUrl).withRequestTimeout(100).post(jsonString).map{

        response =>

          response.body

      }.recover{

         null

      }

      futureResponseList = futureResponseList:+ futureResponse
    }

    futureResponseList

  }

}
