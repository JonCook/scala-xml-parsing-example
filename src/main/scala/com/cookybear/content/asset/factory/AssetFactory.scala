package com.cookybear.content.asset.factory

import com.cookybear.content.asset.Asset
import com.cookybear.content.asset.Story

object AssetFactory {
  
  def factory(node: scala.xml.Node): Asset = {
    val trimmedNode = scala.xml.Utility.trim(node)
    
    trimmedNode match {
      case <story>{children @ _*}</story> => Story.fromXML(trimmedNode)
    }
    
  }
  
}