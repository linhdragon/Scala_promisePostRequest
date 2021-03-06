package org.openrtb.model.bidrequest

import org.openrtb.model.constant.BooleanAsInt

case class Imp(id: String, banner: Option[Banner], video: Option[Video], native: Option[Native],
               displaymanager: Option[String], displaymanagerver: Option[String], instl: Option[BooleanAsInt],
               tagid: Option[String], bidfloor: Option[Float], bidfloorcur: Option[String],
               secure: Option[BooleanAsInt], iframebuster: Option[Seq[String]], pmp: Option[Pmp],
               ext: Option[Any])

object Imp {

  def minimal(id: String): Imp =
    Imp(id, None, None, None, None, None, None, None, None, None, None, None, None, None)

}