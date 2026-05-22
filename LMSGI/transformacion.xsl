<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/*">
    <head>
        <title>REGISTRO DE MISIONES HORIZONTE</title>
        <style>
          table { 
          border-collapse: collapse; } 
          
          td, th {
          border-style: solid; border-width: 1px; border-color: black; }
        </style>
      </head>
      <body>
        <h1>REGISTRO DE MISIONES HORIZONTE</h1>
        <table>
          <thead>
            <tr>
              <th>ID</th>
              <th>Mision</th>
              <th>Destino</th>
              <th>Anyo de Lanzamiento</th>
              <th>Estado</th>
            </tr>
          </thead>
          <tbody>
            <xsl:apply-templates select="mision">
              <xsl:sort select="anyo"/>
            </xsl:apply-templates>
          </tbody>
        </table>
      </body>
  </xsl:template>
  <xsl:template match=".">
      <tr>
        <td>
          <xsl:value-of select="@id"/>
        </td>
        <th>
          <xsl:value-of select="nombre"/>
        </th>
        <td>
          <xsl:value-of select="destino"/>
        </td>
        <td>
          <xsl:value-of select="anyo"/>
        </td>
        <td>
          <xsl:value-of select="@estado"/>
        </td>
      </tr>
  </xsl:template>
</xsl:stylesheet version="1.0">