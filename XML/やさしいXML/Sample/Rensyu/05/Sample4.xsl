<?xml version="1.0" encoding="Shift_JIS" ?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" encoding="Shift_JIS"/>

  <!--  ����  -->
  <xsl:template match="/">
    <html>
      <xsl:apply-templates select="cars"/>
    </html>
  </xsl:template>

  <!--  �ԃ��X�g  -->
  <xsl:template match="cars">
    <body>
      <table border="3">
        <xsl:apply-templates select="car"/>
        <tr>
          <td colspan="3">
            <xsl:value-of select="count(car)"/>���̃f�[�^������܂�
          </td>
        </tr>
      </table>
    </body>
  </xsl:template>

  <!--  ��  -->
  <xsl:template match="car">
    <tr>
      <xsl:apply-templates select="name"/>
      <xsl:apply-templates select="img"/>
      <xsl:apply-templates select="description"/>
    </tr>
  </xsl:template>

  <!--  �i��  -->
  <xsl:template match="name">
    <td>
      <xsl:value-of select="."/>
    </td>
  </xsl:template>

  <!--  ����  -->
  <xsl:template match="description">
    <td>
      <xsl:value-of select="."/>
    </td>
  </xsl:template>

  <!--  �}  -->
  <xsl:template match="img">
    <td>
      <img>
        <xsl:attribute name="src">
          <xsl:value-of select="@file"/>
        </xsl:attribute>
      </img>
    </td>
  </xsl:template>

</xsl:stylesheet>
