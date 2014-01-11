package com.cookybear.content.asset

import com.cookybear.content.XmlDataSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BylineSpec extends XmlDataSpec {

  describe("A Byline with a list of authors") {
    val byline = Byline.fromXML(xmlFixture("/xml/byline.xml"))

    it("should have name and title") {
      assert(byline.name === "By AJP Taylor & Adam Brookes & Alan Hansen")
      assert(byline.title === "Historian")
    }

    it("should contain a list of people") {
      byline.persons must have length (3)
    }

  }

}