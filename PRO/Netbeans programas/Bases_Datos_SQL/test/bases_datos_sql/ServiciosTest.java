/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package bases_datos_sql;

import com.sun.jdi.connect.spi.Connection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pc1
 */
public class ServiciosTest {
    
    public ServiciosTest() {
    }

    @Test
    public void testConectar_Bd() {
        System.out.println("conectar_Bd");
        String Driver = "";
        String user = "";
        String password = "";
        String url = "";
        Servicios instance = new Servicios();
        Connection expResult = null;
        Connection result = instance.conectar_Bd(Driver, user, password, url);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
