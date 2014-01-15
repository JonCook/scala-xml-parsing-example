package com.cookybear.content.asset
import scala.xml.XML

case class ItemMeta(
  val assetUri: String,
  val platform: String,
  val audience: String,
  val assetId: String,
  val title: String,
  val headline: String,
  val shortHeadline: String,
  val summary: String,
  val assetTypeCode: String,
  val section: Section,
  val primaryConceptId: String,
  val secondaryConceptId: String,
  val firstCreated: String,
  val lastUpdated: String,
  val site: Site,
  val isLive: String,
  val iStatsCounterName: String,
  val hasShortForm: String,
  val isOppm: String,
  val mediaType: String,
  val adCampaignKeyword: String) {

  def toXML =
    <itemMeta>
      <assetUri>{ assetUri }</assetUri>
      <platform>{ platform }</platform>
      <audience>{ audience }</audience>
      <assetId>{ assetId }</assetId>
      { if (!title.isEmpty) <title>{ title }</title> }
      { if (!headline.isEmpty) <headline>{ headline }</headline> }
      { if (!shortHeadline.isEmpty) <shortHeadline>{ shortHeadline }</shortHeadline> }
      { if (!summary.isEmpty) <summary>{ summary }</summary> }
      <type>{ assetTypeCode }</type>
      { section.toXML }
      <primaryConceptId>{ primaryConceptId }</primaryConceptId>
      <secondaryConceptId>{ secondaryConceptId }</secondaryConceptId>
      <firstCreated>{ firstCreated }</firstCreated>
      <lastUpdated>{ lastUpdated }</lastUpdated>
      { site.toXML }
      <language>en-GB</language>
      <isLive>{ isLive }</isLive>
      <iStatsCounterName>{ iStatsCounterName }</iStatsCounterName>
      <hasShortForm>{ hasShortForm }</hasShortForm>
      <isOppm>{ isOppm }</isOppm>
      <mediaType>{ mediaType }</mediaType>
      <adCampaignKeyword>{ adCampaignKeyword }</adCampaignKeyword>
    </itemMeta>
}

object ItemMeta {
  def fromXML(node: scala.xml.NodeSeq): ItemMeta = {

    new ItemMeta(
      assetUri = (node \\ "@href").text,
      platform = (node \ "platform").text,
      audience = (node \ "audience").text,
      assetId = (node \ "assetId").text,
      title = (node \ "title").text,
      headline = (node \ "headline").text,
      shortHeadline = (node \ "shortHeadline").text,
      summary = (node \ "summary").text,
      assetTypeCode = (node \ "assetTypeCode").text,
      section = Section.fromXML((node \ "section")),
      primaryConceptId = (node \ "primaryConceptId").text,
      secondaryConceptId = (node \ "secondaryConceptId").text,
      firstCreated = (node \ "firstCreated").text,
      lastUpdated = (node \ "lastUpdated").text,
      site = Site.fromXML((node \ "site")),
      isLive = (node \ "isLive").text,
      iStatsCounterName = (node \ "iStatsCounterName").text,
      hasShortForm = (node \ "hasShortForm").text,
      isOppm = (node \ "isOppm").text,
      mediaType = (node \ "mediaType").text,
      adCampaignKeyword = (node \ "adCampaignKeyword").text)

  }
}

