package com.cookybear.content.asset

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.cookybear.content.XmlDataSpec

@RunWith(classOf[JUnitRunner])
class PageOptionsSpec extends XmlDataSpec {

  describe("A list of page options") {
    val pageOptions = PageOptions.fromXML(xmlFixture("/xml/page-options.xml"))

    it("should have a map of options") {
      pageOptions.options must have size (7)
    }

  }

}