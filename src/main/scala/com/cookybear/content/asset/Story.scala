package com.cookybear.content.asset

class Story(itemMeta: ItemMeta, pageOptions: PageOptions, byline: Byline, body: scala.xml.NodeSeq, media: Media, relatedGroups: RelatedGroups) extends Asset(itemMeta, pageOptions) {

  override def toXML =
	<result>  
  		{super.toXML.child}
  		{byline.toXML}
  		{body}
  		{media.toXML}
  		{relatedGroups.toXML}
  	</result>
}

object Story {
  def fromXML(node: scala.xml.NodeSeq): Story =
    new Story(
        ItemMeta.fromXML((node \ "itemMeta")), 
        PageOptions.fromXML((node \ "pageOptions")),
        Byline.fromXML((node \ "byline")),
  		(node \ "body"),
        Media.fromXML((node \ "media")),
  		RelatedGroups.fromXML(node \ "relatedGroups"))
}