/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bases_datos_sql;

//import com.sun.jdi.connect.spi.Connection;
import com.mysql.cj.protocol.Resultset;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author pc1
 */
public class Servicios {

    public Connection conectar_Bd(String driver, String user, String password, String url) {
        Connection con = null;

        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("no se ha podido conectar" + e);
        }
        return con;

    }
    import java.sql.Connection ;
    import java.sql.PreparedStatement ;
    import java.sql.ResultSet ;
    import java.sql.Statement ;

    public class Servicios {

        // =====================================================================
        // EJERCICIO 1: SISTEMA DE GESTIÓN DE BIBLIOTECA
        // =====================================================================
        /**
         * 1.1 Registrar un nuevo libro asociándolo a un autor ya existente.
         * Recibe los datos del libro y el ID del autor al que pertenece.
         */
        public boolean registrarLibro(Connection con, String titulo, int añoPubli, String editorial, int idAutor) {
            boolean insertado = false;
            // Preparamos la sentencia SQL. Usamos ? para evitar inyección SQL.
            String sql = "INSERT INTO Libros (titulo, año_publi_, editorial, id_autor) VALUES (?, ?, ?, ?)";

            try {
                PreparedStatement ps = con.prepareStatement(sql);
                // Rellenamos las interrogaciones con los datos que nos han pasado
                ps.setString(1, titulo);
                ps.setInt(2, añoPubli);
                ps.setString(3, editorial);
                ps.setInt(4, idAutor); // Aquí está la clave foránea que lo une al autor

                // Ejecutamos la inserción
                ps.executeUpdate();
                insertado = true; // Si llegamos aquí, no ha habido fallos
                System.out.println("Libro '" + titulo + "' registrado con éxito.");

            } catch (Exception e) {
                System.err.println("Error al registrar el libro: " + e.getMessage());
            }
            return insertado;
        }

        /**
         * 1.2 Mostrar todos los libros prestados actualmente uniendo tablas
         * (JOIN). Suponemos que existe una tabla 'Prestamos' con un campo
         * 'devuelto' (boolean).
         */
        public void mostrarLibrosPrestados(Connection con) {
            // Hacemos un JOIN de las 3 tablas: Libros, Autor y Prestamos
            String sql = "SELECT l.titulo, a.nombre, a.apellido "
                    + "FROM Libros l "
                    + "JOIN Autor a ON l.id_autor = a.id_autor "
                    + "JOIN Prestamos p ON l.id_libro = p.id_libro "
                    + "WHERE p.devuelto = false"; // Solo los que NO han sido devueltos

            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);

                System.out.println("--- LIBROS ACTUALMENTE PRESTADOS ---");
                while (rs.next()) {
                    // Sacamos los datos de la fila actual
                    String titulo = rs.getString("titulo");
                    String autorNombre = rs.getString("nombre");
                    String autorApellido = rs.getString("apellido");

                    System.out.println("Libro: " + titulo + " | Autor: " + autorNombre + " " + autorApellido);
                }
            } catch (Exception e) {
                System.err.println("Error al consultar préstamos: " + e.getMessage());
            }
        }

        /**
         * 1.3 Sistema de búsqueda por título o autor. Busca cualquier libro que
         * contenga el texto introducido en su título o en el nombre del autor.
         */
        public void buscarLibroOAutor(Connection con, String terminoBusqueda) {
            // Usamos LIKE para buscar coincidencias parciales en ambas tablas
            String sql = "SELECT l.titulo, a.nombre, a.apellido "
                    + "FROM Libros l "
                    + "JOIN Autor a ON l.id_autor = a.id_autor "
                    + "WHERE l.titulo LIKE ? OR a.nombre LIKE ?";

            try {
                PreparedStatement ps = con.prepareStatement(sql);
                // Añadimos los % para que busque el texto en cualquier parte de la palabra
                String busquedaSQL = "%" + terminoBusqueda + "%";
                ps.setString(1, busquedaSQL);
                ps.setString(2, busquedaSQL);

                ResultSet rs = ps.executeQuery();

                System.out.println("--- RESULTADOS DE BÚSQUEDA PARA: '" + terminoBusqueda + "' ---");
                while (rs.next()) {
                    System.out.println("Encontrado -> Título: " + rs.getString("titulo")
                            + " | Autor: " + rs.getString("nombre") + " " + rs.getString("apellido"));
                }
            } catch (Exception e) {
                System.err.println("Error en la búsqueda: " + e.getMessage());
            }
        }

        // =====================================================================
        // EJERCICIO 2: RECORRER RESULTSET (Tabla usuarios)
        // =====================================================================
        /**
         * Ejercicio 2 adaptado a un método. Lista todos los nombres de la tabla
         * usuarios usando Statement.
         */
        public void listarNombresUsuarios(Connection conexion) {
            try {
                // 1. Crear el objeto para ejecutar la sentencia SQL sin parámetros
                Statement st = conexion.createStatement();

                // 2. Ejecutar la consulta (Cuidado: asume que la tabla usuarios existe)
                String sql = "SELECT nombre FROM usuarios";
                ResultSet rs = st.executeQuery(sql);

                // 3. Recorrer el ResultSet e imprimir nombres
                System.out.println("--- Lista de nombres (Ejercicio 2) ---");
                while (rs.next()) {
                    // Recuperamos la columna "nombre" de la iteración actual
                    String nombre = rs.getString("nombre");
                    System.out.println("Empleado: " + nombre);
                }

                // Nota: No cerramos la conexión aquí (conexion.close()) para poder 
                // seguir usándola en otros métodos desde el main.
            } catch (Exception e) {
                System.err.println("Error al listar usuarios: " + e.getMessage());
            }
        }

        // =====================================================================
        // EJERCICIO 3: BÚSQUEDA CON LIKE (Tabla usuarios)
        // =====================================================================
        /**
         * Ejercicio 3 adaptado a un método. Busca en la base de datos "prueba"
         * (tabla usuarios) los nombres que empiecen por una letra.
         */
        public void buscarUsuariosPorLetra(Connection conexion) {
            try {
                // Definimos el comodín: A% significa "Empieza por A y le sigue cualquier cosa"
                String busqueda = "A%";
                String sql = "SELECT * FROM usuarios WHERE nombre LIKE ?";

                PreparedStatement ps = conexion.prepareStatement(sql);
                // Rellenamos la primera y única interrogación
                ps.setString(1, busqueda);

                ResultSet rs = ps.executeQuery();

                System.out.println("--- Usuarios que empiezan por 'A' (Ejercicio 3) ---");
                // Recorremos los resultados
                while (rs.next()) {
                    // Imprimimos concatenando el nombre y el email
                    System.out.println(rs.getString("nombre") + " - " + rs.getString("email"));
                }
            } catch (Exception e) {
                System.err.println("Error en la búsqueda por letra: " + e.getMessage());
            }
        }
    }
}
