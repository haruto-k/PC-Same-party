<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="Shift_JIS"/>

  <!--   ����    -->
  <xsl:template match="/">
    <root>
      <xsl:apply-templates select="cars/car"/>
    </root>
  </xsl:template>

  <!--   ��    -->
  <xsl:template match="car">
      <car>
        <xsl:apply-templates select="name"/>
        <xsl:apply-templates select="price"/>
        <xsl:choose>
          <xsl:when test="price &gt;= 300">
            <option>���l</option>
          </xsl:when>
          <xsl:when test="price &lt; 300 and price &gt;= 200">
            <option>�ʏ�</option>
          </xsl:when>
          <xsl:otherwise>
            <option>���l</option>
          </xsl:otherwise>
        </xsl:choose>
      </car>
  </xsl:template>

  <!--   �i��    -->
  <xsl:template match="name">
    <xsl:copy-of select="."/>
  </xsl:template>

  <!--   ���i    -->
  <xsl:template match="price">
    <xsl:copy-of select="."/>
  </xsl:template>

</xsl:stylesheet>
