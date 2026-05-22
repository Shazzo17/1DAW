/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesoresnoencontradosenbd;

import java.io.BufferedReader;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author daw1-25
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

    public ArrayList<Profesores> profesoresNoEncontradosEnBaseDeDatos(Connection con, BufferedReader bf) {
        ArrayList<Profesores> listaProfesoresFiltrados = new ArrayList<>();
        Profesores p;
        String[] ar;
        String dniPArchivo;
        ResultSet dniPBaseDatos;
        PreparedStatement ps;
        String sql = "SELECT dniPr FROM DarClases WHERE dniP = ?";
        String linea;
        int edadProfesor;

        try {
            ps = con.prepareStatement(sql);
            while ((linea = bf.readLine()) != null) {
                ar = linea.split(",");
                dniPArchivo = ar[0];
                ps.setString(1, dniPArchivo);
                dniPBaseDatos = ps.executeQuery();
                if (!dniPBaseDatos.next()) {
                    edadProfesor = Integer.parseInt(ar[3]);
                    p = new Profesores(ar[0], ar[1], ar[2], edadProfesor);
                    listaProfesoresFiltrados.add(p);
                }
                dniPBaseDatos.close();
            }
        } catch (Exception e) {
            System.err.println("Se ha encontrado el error " + e.getMessage());
        }
        return listaProfesoresFiltrados;
    }

    //Tengo una tabla, con la palabra y tres conceptos,y me dicen que tengo un fichero con unas determinadas palabras, yo hare que si la palabra no existe se la metemos y si existe no haremos nada.
    //En este problema suponemos que el concepto de las palabras es variable
    public void Diccionario(Connection con, BufferedReader bf) {
        String[] ar;
        String palabraArchivo;
        ResultSet palabraBaseDatos;
        PreparedStatement ps;
        PreparedStatement pr;
        String sql = "SELECT palabra FROM TablaDiccionario WHERE palabra = ?";
        String insert = "INSERT INTO TablaDiccionario (palabra, concepto1, concepto2, concepto3) VALUES (?,?,?,?)";
        String linea;

        try {
            ps = con.prepareStatement(sql);
            pr = con.prepareStatement(insert);
            while ((linea = bf.readLine()) != null) {
                ar = linea.split(",");
                palabraArchivo = ar[0];
                ps.setString(1, palabraArchivo);
                palabraBaseDatos = ps.executeQuery();
                if (!palabraBaseDatos.next()) {
                    pr.setString(1, ar[0]);
                    pr.setString(2, ar[1]);
                    pr.setString(3, ar[2]);
                    pr.setString(4, ar[3]);
                    pr.executeUpdate();
                }
                palabraBaseDatos.close();
            }
        } catch (Exception e) {
            System.err.println("Se ha encontrado el error " + e.getMessage());
        }
    }

    //Me dan un fichero de personas con los campos dni, nombre,apellido y edad y me dicen que ordene ese fichero por nombres.
    public ResultSet ordenarFicheroPorNombres(Connection con, BufferedReader bfArchivoDado) {
        String ar[];
        String linea;
        String select = "SELECT * FROM Personas ORDER BY NOMBRE";
        String insert = "INSERT INTO Personas (dni, nombre, apellido, edad) VALUES (?, ?, ?, ?)";
        PreparedStatement psInsert;
        PreparedStatement psSelect;
        ResultSet rsResultado = null;

        try {
            psInsert = con.prepareStatement(insert);
            psSelect = con.prepareStatement(select);

            while ((linea = bfArchivoDado.readLine()) != null) {
                ar = linea.split(",");
                psInsert.setString(1, ar[0]);
                psInsert.setString(2, ar[1]);
                psInsert.setString(3, ar[2]);
                psInsert.setString(4, ar[3]);
                psInsert.executeUpdate();
            }
            rsResultado = psSelect.executeQuery();
        } catch (Exception e) {
            System.err.println("Se ha encontrado el error:" + e.getMessage());
        }
        return rsResultado;
    }

    //Dado un fichero disperso, decidme la cantidad de lineas que tiene ese fichero.

}
