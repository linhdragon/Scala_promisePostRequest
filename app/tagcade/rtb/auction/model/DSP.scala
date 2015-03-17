package tagcade.rtb.auction.model


class DSP(id: String, rtbUrl: String, rtbTimeout: Int, connectionTimeout: Int, qualityScore: Float, enableTimeout: Boolean) {

  def validate(): Unit = {
    println("validate DSP")
  }

  def process(): Unit = {
    println("process DSP")
  }
}
