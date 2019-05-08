<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

  <!--  文書  -->
  <xsl:template match="/">
    <root>
      <xsl:apply-templates select="cars"/>
    </root>
  </xsl:template>

  <!--  車リスト  -->
  <xsl:template match="cars">
    <cars>
      <xsl:attribute name="sum">
        <xsl:value-of select="sum(car/price)"/>
      </xsl:attribute>
      <xsl:apply-templates select="car"/>
    </cars>
  </xsl:template>

  <!--  車  -->
  <xsl:template match="car">
    <car>
      <xsl:attribute name="file">
        <xsl:value-of select="img/@file"/>
      </xsl:attribute>
      <xsl:apply-templates select="name"/>
      <xsl:apply-templates select="price"/>
    </car>
  </xsl:template>

  <!--  品名  -->
  <xsl:template match="name">
    <name>
      <xsl:value-of select="."/>
    </name>
  </xsl:template>

  <!--  価格  -->
  <xsl:template match="price">
    <price>
      <xsl:value-of select="."/>
    </price>
  </xsl:template>

</xsl:stylesheet>
