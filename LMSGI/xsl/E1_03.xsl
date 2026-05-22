<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  
  <xsl:output method="html" version="5.0" doctype-system="about:legacy-compat" encoding="UTF-8"/>
  
  <xsl:template match="/">
    <html lang="es">
      <head>
        <Title>Datos agenda</Title>
        <style>
          table, th, td {
          border:solid black 1px;
          border-collapse: collapse;
          }
          th {
          background-color: lightgray;
          }
          
          td {
          background-color: lightgreen;
          }
        </style>
      </head>
      <body>
        <h1><u>Datos agenda</u></h1>
        <table>
          <tr>
            <th>CATEGORIA</th>
            <th>NOMBRE</th>
            <th>FOTO</th>
          </tr>
          <xsl:for-each select="agenda/ficha[@categoria!='particular']">
            <xsl:sort select="@zona"/>
            <xsl:sort select="apellido1"/>
            <xsl:sort select="apellido2"/>
            <tr>
              <td><xsl:value-of select="@categoria"/></td>
              <td><xsl:value-of select="nombre | apellido1 | apellido2"/></td>
              <td><img src="{foto}" width="50px"/></td>
            </tr>
          </xsl:for-each>
        </table> 
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>