<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

  <!--   文書    -->
  <xsl:template match="/">
    <root>
      <xsl:apply-templates select="cars/car"/>
    </root>
  </xsl:template>

  <!--   車    -->
  <xsl:template match="car">
    <xsl:copy>
      <xsl:text>車のデータです。</xsl:text>
      <xsl:apply-templates select="name"/>
    </xsl:copy>
  </xsl:template>

  <!--   品名   -->
  <xsl:template match="name">
    <xsl:copy-of select="."/>
  </xsl:template>

</xsl:stylesheet>
