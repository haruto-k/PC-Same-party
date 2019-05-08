<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

  <!--   ����    -->
  <xsl:template match="/">
    <root>
      <xsl:apply-templates select="cars/car[3]"/>
    </root>
  </xsl:template>

  <!--   ��    -->
  <xsl:template match="car">
    <xsl:copy>
      <xsl:apply-templates select="name"/>
      <xsl:apply-templates select="price"/>
    </xsl:copy>
  </xsl:template>

  <!--   �i��   -->
  <xsl:template match="name">
    <xsl:copy-of select="."/>
  </xsl:template>

  <!--   ���i   -->
  <xsl:template match="price">
    <xsl:copy-of select="."/>
  </xsl:template>

</xsl:stylesheet>
