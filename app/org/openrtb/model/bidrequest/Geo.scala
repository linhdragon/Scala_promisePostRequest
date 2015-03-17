package org.openrtb.model.bidrequest

import org.openrtb.model.constant.LocationType

case class Geo(lat: Option[Float], lon: Option[Float], `type`: Option[LocationType], country: Option[String],
               region: Option[String], regionfips: Option[String], metro: Option[String], city: Option[String],
               zip: Option[String], utcoffset: Option[Integer], ext: Option[Any])

object Geo {

  def minimal: Geo =
    Geo(None, None, None, None, None, None, None, None, None, None, None)

}