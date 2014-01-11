package com.cookybear.content.asset

class Asset(val itemMeta: ItemMeta, val pageOptions: PageOptions) {

  def toXML =
    <result>
      { itemMeta.toXML.child }
      { pageOptions.toXML }
    </result>

}