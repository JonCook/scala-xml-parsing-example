package com.cookybear.content

import org.scalatest.BeforeAndAfter
import org.scalatest.matchers.MustMatchers
import org.scalatest.FunSpec
import com.cookybear.content.utils.FixtureTestUtils
import scala.xml.Elem
import scala.xml.PrettyPrinter

/**
 * Convenience trait to cut down on the number of mixins we're using in all our tests.
 */
trait XmlDataSpec extends FunSpec with MustMatchers with FixtureTestUtils with BeforeAndAfter {

  def prettyPrint(element: Elem) = {
    val xmlPrinter = new PrettyPrinter(80, 2)
    println(xmlPrinter.format(element))
  }

}