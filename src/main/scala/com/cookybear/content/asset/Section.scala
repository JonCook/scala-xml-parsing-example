package com.cookybear.content.asset

case class Section(
  val id: String,
  val name: String,
  val uri: String) {

  def toXML = <section id={ id } name={ name } uri={ uri }/>

}

object Section {
  def fromXML(node: scala.xml.NodeSeq): Section =
    new Section(
      id = (node \ "@id").text,
      name = (node \ "@name").text,
      uri = (node \ "@uri").text)
}