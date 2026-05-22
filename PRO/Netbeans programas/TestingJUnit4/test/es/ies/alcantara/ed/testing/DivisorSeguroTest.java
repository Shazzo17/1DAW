/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.ies.alcantara.ed.testing;

/**
 *
 * @author daw1-25
 */
import es.iesalcantara.ed.testing.DivisorSeguro;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisorSeguroTest {

    @Test
    public void testDivisionCorrecta() {
        assertEquals(5, DivisorSeguro.dividir(10, 2));
    }

    
    @Test(expected = IllegalArgumentException.class)
    public void testDivisionPorCero() {
        DivisorSeguro.dividir(10, 0);
    }
}