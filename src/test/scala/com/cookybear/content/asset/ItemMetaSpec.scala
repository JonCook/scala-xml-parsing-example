package com.cookybear.content.asset

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.cookybear.content.XmlDataSpec

@RunWith(classOf[JUnitRunner])
class ItemMetaSpec extends XmlDataSpec {

  describe("A piece of item meta") {
    val itemMeta = ItemMeta.fromXML(xmlFixture("/xml/item-meta.xml"))

    it("should have an asset uri") {
      assert(itemMeta.assetUri === "/football/arsenal")
    }

    it("should have a platform and audience") {
      assert(itemMeta.platform === "highweb")
      assert(itemMeta.audience === "domestic")
    }

    it("should have an asset type") {
      assert(itemMeta.assetTypeCode === "STY")
    }

  }

}