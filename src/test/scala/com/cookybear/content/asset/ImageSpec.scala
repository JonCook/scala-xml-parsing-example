package com.cookybear.content.asset

import org.scalatest.FunSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import scala.collection.mutable.Stack
import scala.xml.XML
import com.cookybear.content.XmlDataSpec

@RunWith(classOf[JUnitRunner])
class ImageSpec extends XmlDataSpec {

  describe("An Image with a caption") {
    val imageWithCaption = Image.fromXML(xmlFixture("/xml/image/image-with-caption.xml"))

    it("should have an id") {
      assert(imageWithCaption.id === "57606423")
    }

    it("should contain a caption") {
      assert(imageWithCaption.caption === "Mr Kravitz took the Twitter account after leaving Phonedog in October last year")
    }

    it("should contain alt text") {
      assert(imageWithCaption.altText === "A screenshot of Noah Kravitz's Twitter profile")
    }

    it("should have a height") {
      assert(imageWithCaption.height === "128")
    }

    it("should have a width") {
      assert(imageWithCaption.width === "228")
    }

    it("should have a url") {
      assert(imageWithCaption.href === "http://news.bbcimg.co.uk/media/images/57606000/jpg/_57606423_57581119.jpg")
    }
  }

  describe("An Image without a caption") {
    val imageWithoutCaption = Image.fromXML(xmlFixture("/xml/image/image-without-caption.xml"))

    it("should not contain a caption") {
      imageWithoutCaption.caption.isEmpty() must be(true)
    }
  }

}