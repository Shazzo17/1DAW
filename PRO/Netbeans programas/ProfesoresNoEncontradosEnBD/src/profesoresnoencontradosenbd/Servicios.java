/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesoresnoencontradosenbd;

import com.mysql.cj.jdbc.ClientPreparedStatement;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    public void Diccionario(Connection con, BufferedReader bf) {
        String[] ar;
        String palabraArchivo;
        ResultSet palabraBaseDatos;
        PreparedStatement ps;
        PreparedStatement pr;
        String sql = "SELECT palabra FROM TablaDiccionario WHERE palabra = ?";
        String insert = "INSERT INTO TablaDiccionario (palabra, concepto1, concepto2, concepto3) VALUES (?, ?, ?, ?)";
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
}
