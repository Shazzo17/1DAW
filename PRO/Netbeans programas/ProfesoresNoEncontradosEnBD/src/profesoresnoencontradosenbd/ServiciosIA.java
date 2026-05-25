package profesoresnoencontradosenbd;
//Prueba push;

import java.io.BufferedReader;
import java.sql.*;
import java.util.ArrayList;

public class ServiciosIA {
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

    // 1.- Tengo una tabla Productos con el nombre, precio y stock. Me dan un fichero con unos determinados productos (separados por comas: nombre,precio,stock). Yo haré que si el producto ya existe en la base de datos le sumemos el nuevo stock al que ya tiene, y si no existe lo insertaremos como un producto nuevo.
    public void comprobarSiExisteProducto(Connection con, BufferedReader bfArchivo) {
        String ar[];
        String linea;
        String select = "SELECT nombre FROM Productos WHERE nombre = ?;";
        String insert = "INSERT INTO Productos (nombre, precio, stock) VALUES (?, ?, ?);";
        String update = "UPDATE Productos SET stock=stock+? WHERE nombre=?;";
        PreparedStatement psSelect;
        PreparedStatement psInsert;
        PreparedStatement psUpdate;
        ResultSet rsSelect = null;

        try {
            psSelect = con.prepareStatement(select);
            psInsert = con.prepareStatement(insert);
            psUpdate = con.prepareStatement(update);

            while ((linea = bfArchivo.readLine()) != null) {
                ar = linea.split(",");
                psSelect.setString(1, ar[0]);
                rsSelect = psSelect.executeQuery();

                if (rsSelect.next()) {
                    psUpdate.setInt(1, Integer.parseInt(ar[2]));
                    psUpdate.setString(2, ar[0]);
                    psUpdate.executeUpdate();

                } else {
                    psInsert.setString(1, ar[0]);
                    psInsert.setDouble(2, Double.parseDouble(ar[1]));
                    psInsert.setInt(3, Integer.parseInt(ar[2]));
                    psInsert.executeUpdate();

                }
                rsSelect.close();
            }
        } catch (Exception e) {
            System.err.println("Se ha encontrado el error " + e.getMessage());
        }
    }

    // 2.- Me dan un fichero de Alumnos con los campos dni, nombre, curso y nota. Tengo que devolver un ArrayList con los alumnos del fichero que tengan una nota igual o mayor a 5 y que NO existan ya en la tabla Alumnos_Becados de la base de datos (comprobando por dni).
    public ArrayList<Alumnos> alumnosAprobadosYQueNoEstanEnLaTabla(Connection con, BufferedReader bfArchivo) {
        ArrayList<Alumnos> listaFiltrada = new ArrayList<>();
        Alumnos alumno;
        String ar[];
        String linea;
        String select = "SELECT nombre FROM Alumnos_Becados WHERE dni = ?";
        PreparedStatement psSelect;
        ResultSet rsResultado;

        try {
            psSelect = con.prepareStatement(select);

            while ((linea = bfArchivo.readLine()) != null) {
                ar = linea.split(",");
                if (Double.parseDouble(ar[3]) >= 5) {
                    psSelect.setString(1, ar[0]);
                    rsResultado = psSelect.executeQuery();
                    if (!rsResultado.next()) {
                        alumno = new Alumnos(ar[0], ar[1], ar[2], Double.parseDouble(ar[3]));
                        listaFiltrada.add(alumno);
                    }
                    rsResultado.close();
                }

            }
        } catch (Exception e) {
            System.err.println("Se ha encontrado el error " + e.getMessage());
        }
        return listaFiltrada;
    }

    // 3.- Me dan un fichero con los campos matricula, marca y modelo de coches. Me dicen que guarde todos esos coches en la base de datos y luego devuelva un ResultSet con todos los coches de la tabla ordenados alfabéticamente por marca.
    public ResultSet cochesOrdenadosPorMarca(Connection con, BufferedReader bfArchivo) {
        ResultSet rsResultado = null;
        String ar[];
        String linea;
        String select = "SELECT * FROM Coches ORDER BY marca;";
        String insert = "INSERT INTO Coches (matricula, marca, modelo) VALUES (?, ?, ?);";
        PreparedStatement psSelect;
        PreparedStatement psInsert;

        try {
            psInsert = con.prepareStatement(insert);
            psSelect = con.prepareStatement(select);

            while ((linea = bfArchivo.readLine()) != null) {
                ar = linea.split(",");
                psInsert.setString(1, ar[0]);
                psInsert.setString(2, ar[1]);
                psInsert.setString(3, ar[2]);
                psInsert.executeUpdate();
            }
            rsResultado = psSelect.executeQuery();

        } catch (Exception e) {
            System.err.println("Se ha encontrado el error " + e.getMessage());
        }
        return rsResultado;
    }


    //EJERCICIO HECHO POR IA
    // 3.- Me dan un fichero con los campos matricula, marca y modelo de coches. Me dicen que guarde todos esos coches en la base de datos y luego devuelva un ResultSet con todos los coches de la tabla ordenados alfabéticamente por marca.
    public ResultSet registrarYOrdenarCoches(Connection con, BufferedReader bf) {
        String ar[];
        String linea;
        String insert = "INSERT INTO Coches (matricula, marca, modelo) VALUES (?, ?, ?)";
        String select = "SELECT * FROM Coches ORDER BY marca ASC";
        PreparedStatement psInsert;
        PreparedStatement psSelect;
        ResultSet rsResultado = null;

        try {
            psInsert = con.prepareStatement(insert);
            psSelect = con.prepareStatement(select);

            // 1. FASE DE INSERCIÓN (Dentro del bucle)
            while ((linea = bf.readLine()) != null) {
                ar = linea.split(",");
                psInsert.setString(1, ar[0]); // matricula
                psInsert.setString(2, ar[1]); // marca
                psInsert.setString(3, ar[2]); // modelo
                psInsert.executeUpdate();
            }

            // 2. FASE DE CONSULTA (Fuera del bucle)
            rsResultado = psSelect.executeQuery();

        } catch (Exception e) {
            System.err.println("Se ha encontrado el error: " + e.getMessage());
        }

        return rsResultado;
    }

    // 4.- Dado un fichero disperso que contiene direcciones de correo electrónico, decidme la cantidad de correos que pertenecen al dominio "@gmail.com".
// 4.- Dado un fichero disperso que contiene direcciones de correo electrónico, decidme la cantidad de correos que pertenecen al dominio "@gmail.com".
    public int contarCorreosGmail(BufferedReader bf) {
        String linea;
        int contadorGmail = 0;

        try {
            while ((linea = bf.readLine()) != null) {
                // 1. Limpiamos la línea por ser un fichero disperso
                linea = linea.trim();

                // 2. Comprobamos que no esté vacía Y que termine en @gmail.com
                if (!linea.isEmpty() && linea.toLowerCase().endsWith("@gmail.com")) {
                    contadorGmail++;
                }
            }
        } catch (Exception e) {
            System.err.println("Se ha encontrado un error: " + e.getMessage());
        }

        return contadorGmail;
    }
}
