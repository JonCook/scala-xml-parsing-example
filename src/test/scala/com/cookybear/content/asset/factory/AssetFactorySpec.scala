package com.cookybear.content.asset.factory

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.cookybear.content.XmlDataSpec
import com.cookybear.content.asset.Asset
import scala.xml.Node

@RunWith(classOf[JUnitRunner])
class AssetFactorySpec extends XmlDataSpec {

  describe("A factory for allocating assets") {

    it("should load an asset from xml") {
      val asset: Asset = AssetFactory.factory(xmlFixture("/xml/story.xml"))
      asset should not be null

    }

    it("should return empty for an unknown asset") {
      val node: Node = <root><hello></hello></root>
      intercept[IllegalArgumentException] {
        AssetFactory.factory(node)
      }

    }
  }

}