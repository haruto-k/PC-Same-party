<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

  <!--  文書  -->
  <xsl:template match="/">
    <文書>
      <xsl:apply-templates select="cars"/>
    </文書>
  </xsl:template>

  <!--  車リスト  -->
  <xsl:template match="cars">
    <車リスト>
      <xsl:apply-templates select="car"/>
    </車リスト>
  </xsl:template>

  <!--  車  -->
  <xsl:template match="car">
    <車>
      <xsl:apply-templates select="name"/>
      <xsl:apply-templates select="price"/>
    </車>
  </xsl:template>

  <!--  品名  -->
  <xsl:template match="name">
    <品名>
      <xsl:value-of select="."/>
    </品名>
  </xsl:template>

  <!--  価格  -->
  <xsl:template match="price">
    <価格>
      <xsl:value-of select="."/>
    </価格>
  </xsl:template>

</xsl:stylesheet>
