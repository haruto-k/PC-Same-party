<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

  <!--   ����    -->
  <xsl:template match="/">
    <root>
      <xsl:apply-templates select="cars"/>
    </root>
  </xsl:template>

  <!--   �ԃ��X�g    -->
  <xsl:template match="cars">
    <cars>
      �ԃ��X�g���������܂����B
      <xsl:apply-templates select="car"/>
    </cars>
  </xsl:template>

  <!--   ��    -->
  <xsl:template match="car">
    <car>�Ԃ�1�䏈�����܂����B</car>
  </xsl:template>

</xsl:stylesheet>
