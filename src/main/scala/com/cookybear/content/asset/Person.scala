package com.cookybear.content.asset
import scala.xml.Text

case class Person(val name: String, val function: String, val thumbnail: Option[Text] = None) {

  def toXML =
    <person thumbnail={ thumbnail }>
      <name>{ name }</name>
      <function>{ function }</function>
    </person>

}

object Person {
  def fromXML(node: scala.xml.Node): Person =
    new Person(
      name = (node \ "name").text,
      function = (node \ "function").text,
      thumbnail = Some(new Text((node \ "@thumbnail").text)))
}