package com.cookybear.content.asset

class Image(
  val height: String,
  val href: String,
  val id: String,
  val width: String,
  val caption: String,
  val altText: String) {

  def toXml =
    <image height={ height } href={ href } id={ id } width={ width }>
      { if (!caption.isEmpty) <caption>{ caption }</caption> }
      <altText>{ altText }</altText>
    </image>

}

object Image {
  def fromXML(node: scala.xml.Node): Image = {
    new Image(
      height = (node \ "@height").text,
      href = (node \ "@href").text,
      id = (node \ "@id").text,
      width = (node \ "@width").text,
      caption = (node \ "caption").text,
      altText = (node \ "altText").text)
  }
}