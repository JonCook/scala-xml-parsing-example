package com.cookybear.content

import com.cookybear.content.asset.Asset
import com.cookybear.content.asset.factory.AssetFactory
import com.cookybear.content.asset.ResultList
import scala.xml.XML
import scala.io.Source
import com.cookybear.content.utils.FixtureTestUtils

object Main extends XmlDataSpec {

  def main(args: Array[String]): Unit = {
    val asset: Asset = AssetFactory.factory(xmlFixture("/xml/story.xml"))
    val resultList = new ResultList(asset)

    prettyPrint(resultList.toXML)
  }

}