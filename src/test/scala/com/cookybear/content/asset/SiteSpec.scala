package com.cookybear.content.asset

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.cookybear.content.XmlDataSpec

@RunWith(classOf[JUnitRunner])
class SiteSpec extends XmlDataSpec {

  describe("A Site") {
    val site = Site.fromXML(xmlFixture("/xml/site.xml"))

    it("should have a code and name") {
      assert(site.code === "jons-site")
      assert(site.name === "Jon Site")
    }

  }

}