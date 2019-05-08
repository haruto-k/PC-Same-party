<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" encoding="Shift_JIS"/>

  <!--  文書  -->
  <xsl:template match="/">
    <html>
      <xsl:apply-templates select="cars"/>
    </html>
  </xsl:template>

  <!--  車リスト  -->
  <xsl:template match="cars">
    <body>
      <xsl:apply-templates select="car"/>
    </body>
  </xsl:template>

  <!--  車  -->
  <xsl:template match="car">
    <div>
      <xsl:apply-templates select="name"/>
      <xsl:apply-templates select="img"/>
      <xsl:apply-templates select="description"/>
    </div>
  </xsl:template>

  <!--  品名  -->
  <xsl:template match="name">
    <h1>
      <xsl:value-of select="."/>
    </h1>
  </xsl:template>

  <!--  説明  -->
  <xsl:template match="description">
    <p>
      <xsl:value-of select="."/>
    </p>
  </xsl:template>

  <!--  図  -->
  <xsl:template match="img">
    <img>
      <xsl:attribute name="src">
        <xsl:value-of select="@file"/>
      </xsl:attribute>
    </img>
  </xsl:template>

</xsl:stylesheet>
