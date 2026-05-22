/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.ies.alcantara.ed.testing;

/**
 *
 * @author daw1-25
 */
import es.iesalcantara.ed.testing.UtilidadesTexto;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilidadesTextoTest {

    @Test
    public void testTextoConEspacios() {
        assertEquals("HOLA MUNDO", UtilidadesTexto.normalizar("  hola mundo   "));
    }

    @Test
    public void testTextoNull() {
        // Esperamos que devuelva una cadena vacía en vez de dar error
        assertEquals("", UtilidadesTexto.normalizar(null));
    }

    @Test
    public void testTextoSoloEspacios() {
        // Al quitarle los espacios con trim(), debe quedar vacío
        assertEquals("", UtilidadesTexto.normalizar("     "));
    }
}