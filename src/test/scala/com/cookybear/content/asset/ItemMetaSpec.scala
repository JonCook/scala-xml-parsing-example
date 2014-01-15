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

    it("should have different types of headlines") {
      assert(itemMeta.headline === "Man sued for keeping company Twitter followers")
      assert(itemMeta.shortHeadline === "Man sued over Twitter followers £ $ # # € €")
    }

    it("should have a summary") {
      assert(itemMeta.summary === "A man is being sued by his former employer after he left the company and took a 17,000-strong Twitter following with him.")
    }

    it("should have a concept ids") {
      assert(itemMeta.primaryConceptId === "http://www.bbc.co.uk/things/b9a58a01-0c74-8b47-972f-68f922ebd90a#id")
      assert(itemMeta.secondaryConceptId === "http://www.bbc.co.uk/things/903ef380-bdae-4a45-9a8b-5e5a270a7d6c#id")
    }

    it("should have different types of publication dates") {
      assert(itemMeta.firstCreated === "2011-12-29T15:20:52+00:00")
      assert(itemMeta.lastUpdated === "2011-12-30T12:14:21+00:00")
    }

    it("should indicate if the asset is live or oppm") {
      assert(itemMeta.isLive === "true")
      assert(itemMeta.isOppm === "true")
    }

    it("should have istats information") {
      assert(itemMeta.iStatsCounterName === "news.business.story.16355930.page")
    }

    it("should have a media type") {
      assert(itemMeta.mediaType === "Audio")
    }
  }

}