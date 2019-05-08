<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

<xsl:variable name="mycompany">
  <company>�J�[�o���N��</company>
</xsl:variable>

  <!--   ����    -->
  <xsl:template match="/">
    <root>
      <xsl:copy-of select="$mycompany"/>
      <xsl:apply-templates select="cars/car"/>
    </root>
  </xsl:template>

  <!--   ��    -->
  <xsl:template match="car">
    <xsl:copy>
      <xsl:apply-templates select="name"/>
    </xsl:copy>
  </xsl:template>

  <!--   �i��    -->
  <xsl:template match="name">
      <xsl:copy-of select="$mycompany"/>
    <xsl:copy-of select="."/>
  </xsl:template>
</xsl:stylesheet>
