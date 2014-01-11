package com.cookybear.content.asset

case class Media(val images: List[Tuple2[String, Map[String, Image]]]) {

  def toXML =
    <media>
      {
        if (!images.isEmpty)
          for (imageTuple <- images) yield <imageCollection type={ imageTuple._1 }>{
            for ((id, image) <- imageTuple._2) yield image.toXml
          }</imageCollection>
      }
    </media>

}

object Media {
  def fromXML(node: scala.xml.NodeSeq): Media = {
    val images = List[Tuple2[String, Map[String, Image]]]((node \ "images").toList map {
      s =>
        ((s \ "@type").text, Map[String, Image]((s \ "image").toList map {
          a => ((a \ "@id").text, Image.fromXML(a))
        }: _*))
    }: _*)

    new Media(images)
  }

}