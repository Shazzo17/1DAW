/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.ies.alcantara.ed.testing;

/**
 *
 * @author daw1-25
 */
import es.iesalcantara.ed.testing.UtilidadesNumero;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilidadesNumeroTest {

    @Test
    public void testNumeroPar() {
        assertTrue(UtilidadesNumero.esPar(4));
    }

    @Test
    public void testNumeroImpar() {
        assertFalse(UtilidadesNumero.esPar(7));
    }

    @Test
    public void testNumeroCero() {
        assertTrue(UtilidadesNumero.esPar(0));
    }
}