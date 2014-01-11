package com.cookybear.content.asset

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.cookybear.content.XmlDataSpec

@RunWith(classOf[JUnitRunner])
class SectionSpec extends XmlDataSpec {

  describe("A Section") {
    val section = Section.fromXML(xmlFixture("/xml/section.xml"))

    it("should have an id") {
      assert(section.id === "99104")
    }
    
    it("should have an uri") {
      assert(section.uri === "/news/business")
    }
    
    it("should have a name") {
      assert(section.name === "Business")
    }

  }

}