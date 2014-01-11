package com.cookybear.content.asset

case class Site(val code: String, val name: String) {

  def toXML = <site code={ code } name={ name }/>

}

object Site {
  def fromXML(node: scala.xml.NodeSeq): Site =
    new Site(
      code = (node \ "@code").text,
      name = (node \ "@name").text)
}