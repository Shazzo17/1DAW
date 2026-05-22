/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bases_datos_sql;

import java.sql.Connection;

/**
 *
 * @author pc1
 */
public class Bases_Datos_SQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con=null;
        Servicios ser=new Servicios();
        String drive=Conectar_Mysql.getDriver();
        String user=Conectar_Mysql.getUser();
        String password=Conectar_Mysql.getPassword();
        String url=Conectar_Mysql.getUrl();
        con=ser.conectar_Bd(drive, user, password, url);
        if(con!=null){
            System.out.println("Se ha conectado a la base de datos");
        }
        
    }
    
}
