/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bases_datos_sql;

/**
 *
 * @author pc1
 */
public class Conectar_Mysql {

    // Declaraciones para la conexion de bases de datos
    // Constantes
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/prueba";

    public Conectar_Mysql() {
    }

    public static String getDriver() {
        return driver;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUrl() {
        return url;
    }

}
