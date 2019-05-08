<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

  <!--   文書    -->
  <xsl:template match="/">
    <root>
      <xsl:apply-templates select="//title"/>
    </root>
  </xsl:template>

  <!--   タイトル    -->
  <xsl:template match="title">
    <title>
      <xsl:number level="multiple" count="chapter|section|subsection" />
      <xsl:value-of select="."/>
    </title>
  </xsl:template>

</xsl:stylesheet>
