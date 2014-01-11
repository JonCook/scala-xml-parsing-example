package com.cookybear.content.asset
import scala.xml.XML
import scala.util.parsing.json.JSON

class ResultList(val asset: Asset) {

  def toXML =
	  <results>
  			{asset.toXML}
	  </results>
  
}