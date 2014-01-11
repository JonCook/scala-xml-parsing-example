package com.cookybear.content.asset

case class PageOptions(val options: Map[String, Boolean]) {

  def toXML =
    {
      if (!options.isEmpty)
        <options>{
          for ((key, value) <- options) yield <option name={ key } value={ value.toString() }></option>
        }</options>
    }
}

object PageOptions {
  def fromXML(node: scala.xml.NodeSeq): PageOptions = {
    val options = Map[String, Boolean]((node \ "pageOption").toList map { s => ((s \ "@name").text, (s \ "@value").text.toBoolean) }: _*)
    new PageOptions(options)
  }
}