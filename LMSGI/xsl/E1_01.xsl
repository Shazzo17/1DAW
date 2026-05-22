<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" version="5.0" doctype-system="about:legacy-compat" encoding="UTF-8"/>
  
  <xsl:template match="/">
    <html lang="es">
      <head>
        <Title>Vehiculos disponibles</Title>
        <style>
          table, td, th{
          border:solid black 1px ;
          border-collapse: collapse;
          }
          
          th {
          background-color:lightgray;
          }
          
          td {
          background-color: gold;
          }
        </style>
      </head>
      <body>
        <h1><u>Vehiculos disponibles</u></h1>
        <table>
          <tr>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Potencia</th>
          </tr>
          <xsl:for-each select="/concesionario/coche">
            <tr>
              <td><xsl:value-of select="marca"/></td>
              <td><xsl:value-of select="modelo"/></td>
              <td><xsl:value-of select="potencia"/></td>
            </tr>
          </xsl:for-each>
        </table> 
      </body>
    </html>
</xsl:template>
</xsl:stylesheet>