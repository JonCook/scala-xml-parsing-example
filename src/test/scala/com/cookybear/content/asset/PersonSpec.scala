package com.cookybear.content.asset

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.cookybear.content.XmlDataSpec

@RunWith(classOf[JUnitRunner])
class PersonSpec extends XmlDataSpec {

  describe("A Person") {
    val person = Person.fromXML(xmlFixture("/xml/person.xml"))

    it("should have a thumbnail") {
      assert(person.thumbnail.get.text === "/media/images/56175000/jpg/_56175853_009932070-1.jpg")
    }

    it("should have a name") {
      assert(person.name === "Alan Hansen")
    }

    it("should have a function") {
      assert(person.function === "BBC Sport football expert (debatable)")
    }
  }

}