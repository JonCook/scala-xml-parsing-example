package com.cookybear.content.asset

case class Item(val itemMeta: Option[ItemMeta] = None) {

  def toXML =
    <item>
      { itemMeta.get.toXML.child }
    </item>

}

object Item {
  def fromXML(node: scala.xml.Node): Item = {
    val trimmedNode = scala.xml.Utility.trim(node)

    trimmedNode match {
      case <item>{ itemMeta @ <itemMeta>{ children @ _* }</itemMeta> }</item> => new Item(Some(ItemMeta.fromXML(itemMeta)))
      case <item>{ link @ <link>{ children @ _* }</link> }</item> => new Item(Some(ItemMeta.fromXML(link)))
    }

  }
}