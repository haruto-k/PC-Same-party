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
      <car>
        <xsl:apply-templates select="name"/>
        <xsl:apply-templates select="price"/>
        <xsl:choose>
          <xsl:when test="price &gt;= 200">
            <option>高値</option>
          </xsl:when>
          <xsl:otherwise>
            <option>安値</option>
          </xsl:otherwise>
        </xsl:choose>
      </car>
  </xsl:template>

  <!--   品名    -->
  <xsl:template match="name">
    <xsl:copy-of select="."/>
  </xsl:template>

  <!--   価格    -->
  <xsl:template match="price">
    <xsl:copy-of select="."/>
  </xsl:template>

</xsl:stylesheet>
