package com.cookybear.content.utils

import scala.io.Source
import scala.xml.XML

trait FixtureTestUtils {

  def testFixture(path: String): String = {
    try {
      val src = Source.fromURL(getClass.getResource(path), "UTF8")
      val lines = src.mkString
      src.close()
      lines
    } catch {
      case e: NullPointerException => throw new IllegalArgumentException("Could not load test fixture: " + path)
    }
  }

  def xmlFixture(path: String) = {
    XML.loadString(testFixture(path))
  }

}