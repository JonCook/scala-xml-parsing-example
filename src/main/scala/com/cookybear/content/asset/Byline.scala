package com.cookybear.content.asset

case class Byline(val name: String, val title: String, val persons: List[Person]) {

  def toXML =
    <byline name={ name } title={ title }>
      {
        if (!persons.isEmpty)
          <persons>{
            for (person <- persons) yield person.toXML
          }</persons>
      }
    </byline>

}

object Byline {
  def fromXML(node: scala.xml.NodeSeq): Byline =
    new Byline(
      name = (node \ "@name").text,
      title = (node \ "@title").text,
      List[Person]((node \ "person").toList map { s => Person.fromXML(s) }: _*))

}