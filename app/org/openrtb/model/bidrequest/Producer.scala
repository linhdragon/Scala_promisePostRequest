package org.openrtb.model.bidrequest

import org.openrtb.model.constant.ContentCategory

case class Producer(id: Option[String], name: Option[String], cat: Option[ContentCategory], domain: Option[String],
                    ext: Option[Any])

object Producer {

  def minimal: Producer = Producer(None, None, None, None, None)

}