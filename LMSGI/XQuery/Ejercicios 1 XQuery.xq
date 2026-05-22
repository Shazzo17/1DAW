(:1:)
for $pelicula in //peliculas/pelicula
return $pelicula/titulo/text(),

(:2:)
for $pelicula in //peliculas/pelicula
order by $pelicula/titulo
return $pelicula/titulo/text(),

(:3:)
for $pelicula in //peliculas/pelicula
order by $pelicula/titulo, $pelicula/nacionalidad
return $pelicula/titulo/text() | $pelicula/nacionalidad/text(),

(:4:)
for $pelicula in //peliculas/pelicula
return $pelicula/titulo/text() |$pelicula/nacionalidad/text() | $pelicula/duracion/text(),

(:5:)
for $pelicula in //peliculas/pelicula
order by $pelicula/año
return $pelicula/titulo/text() |$pelicula/nacionalidad/text() | $pelicula/duracion/text(),

(:6:)
for $pelicula in //peliculas/pelicula
where $pelicula/año < 2000
order by $pelicula/año
return $pelicula/titulo/text() |$pelicula/nacionalidad/text() | $pelicula/duracion/text(),

(:7:)
for $pelicula in //peliculas/pelicula
where $pelicula/año > 2000 and $pelicula/año < 2010
order by $pelicula/año
return $pelicula/titulo/text() |$pelicula/nacionalidad/text() | $pelicula/duracion/text(),

(:8:)
for $pelicula in //peliculas/pelicula
where $pelicula/año < 2000 and $pelicula/nacionalidad = "españa"
order by $pelicula/año
return $pelicula/titulo/text() |$pelicula/nacionalidad/text() | $pelicula/duracion/text(),

(:9:)
<html>
    <head>
        <title>Consulta peliculas</title>
    </head>
    <body>
        <h1>Datos peliculas</h1>
        <table border="1">
            <tr>
                <th>Titulo</th>
                <th>Nacionalidad</th>
                <th>Duracion</th>
            </tr>
            {
                for $pelicula in //peliculas/pelicula
                where $pelicula/año < 2000 and $pelicula/nacionalidad = "españa"
                order by $pelicula/año
                return
                <tr>
                    <td>{$pelicula/titulo/text()}</td>
                    <td>{$pelicula/nacionalidad/text()}</td>
                    <td>{$pelicula/duracion/text()}</td> 
                </tr>
            }
        </table>
    </body>
</html>