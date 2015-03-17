package tagcade.rtb.auction.model


/**
 * case keyword is very important
 */
case class DSP(id: String, rtbUrl: String, rtbTimeout: Int, connectionTimeout: Int, qualityScore: Float, enableTimeout: Boolean)

/**
 * case keyword is very important
 */
object DSP {

  def minimal(id: String, rtbUrl: String, rtbTimeout: Int): DSP ={

    val dsp: DSP = new DSP(id, rtbUrl, rtbTimeout, 0, 0,true)

    return dsp
  }



  }


/**
 * convert object into json in scala;
 *
 *
import scala.collection.mutable._
import net.liftweb.json._
import net.liftweb.json.Serialization.write
 *
 *
 *
implicit val formats = DefaultFormats
val jsonString = write(dsp)
println("jsonString dsp: "+jsonString)
 *
 *
 *
 */


