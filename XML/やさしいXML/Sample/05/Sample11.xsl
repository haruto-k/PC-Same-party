<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

  <!--  ����  -->
  <xsl:template match="/">
    <����>
      <xsl:apply-templates select="cars"/>
    </����>
  </xsl:template>

  <!--  �ԃ��X�g  -->
  <xsl:template match="cars">
    <�ԃ��X�g>
      <xsl:apply-templates select="car"/>
    </�ԃ��X�g>
  </xsl:template>

  <!--  ��  -->
  <xsl:template match="car">
    <��>
      <xsl:apply-templates select="name"/>
      <xsl:apply-templates select="price"/>
    </��>
  </xsl:template>

  <!--  �i��  -->
  <xsl:template match="name">
    <�i��>
      <xsl:value-of select="."/>
    </�i��>
  </xsl:template>

  <!--  ���i  -->
  <xsl:template match="price">
    <���i>
      <xsl:value-of select="."/>
    </���i>
  </xsl:template>

</xsl:stylesheet>
