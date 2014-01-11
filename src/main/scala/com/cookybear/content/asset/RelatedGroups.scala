package com.cookybear.content.asset

import scala.xml.NodeSeq

case class RelatedGroups(val relatedGroups: List[Tuple2[String, List[Item]]]) {

  def toXML =
    <relatedGroups>{
        if (!relatedGroups.isEmpty)
          for(group <- relatedGroups) yield 
          	<group type={group._1}>{
        		for (item <- group._2) yield item.toXML
          	}</group> 
  	}
	</relatedGroups>
  
}

object RelatedGroups {
  def fromXML(node: NodeSeq): RelatedGroups = {
    val relatedGroups = List[Tuple2[String, List[Item]]]((node \ "group").toList map {
      s =>
        ((s \ "@type").text, List[Item]((s \ "item").toList map {
          a => (Item.fromXML(a))
        }: _*))
    }: _*)
    
    new RelatedGroups(relatedGroups)
  }
  
}