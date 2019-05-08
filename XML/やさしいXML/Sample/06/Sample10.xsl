<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="text" encoding="Shift_JIS"/>

  <!--  文書  -->
  <xsl:template match="/">
    <xsl:apply-templates select="cars"/>
  </xsl:template>

  <!--  車リスト  -->
  <xsl:template match="cars">
    <xsl:apply-templates select="car"/>
  </xsl:template>

  <!--  車  -->
  <xsl:template match="car">
    <xsl:value-of select="name"/><xsl:text>,</xsl:text>
    <xsl:value-of select="price"/><xsl:text>,</xsl:text>
    <xsl:value-of select="color"/><xsl:text>
</xsl:text>
  </xsl:template>

</xsl:stylesheet>
