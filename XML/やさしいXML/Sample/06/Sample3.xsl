<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

  <!--   ����    -->
  <xsl:template match="/">
    <root>
      <xsl:for-each select="cars/car/name">
        <xsl:copy-of select="."/>
      </xsl:for-each>
    </root>
  </xsl:template>

</xsl:stylesheet>
