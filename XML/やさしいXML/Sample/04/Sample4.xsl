<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>


  <!--   文書    -->
  <xsl:template match="/">
    <xsl:processing-instruction name="xml-stylesheet">
      type="text/css" href="Sample.css"
    </xsl:processing-instruction>
    <root>
      <xsl:apply-templates select="cars"/>
    </root>
  </xsl:template>

  <!--   車リスト    -->
  <xsl:template match="cars">
    <cars>
      車リストを処理しました。
      <xsl:apply-templates select="car"/>
    </cars>
  </xsl:template>

  <!--   車    -->
  <xsl:template match="car">
    <car>車を1台処理しました。</car>
  </xsl:template>

</xsl:stylesheet>
