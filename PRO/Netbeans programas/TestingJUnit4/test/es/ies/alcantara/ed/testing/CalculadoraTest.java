/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.ies.alcantara.ed.testing;

/**
 *
 * @author daw1-25
 */
import es.iesalcantara.ed.testing.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSumaPositivos() {
        assertEquals(5, Calculadora.sumar(2, 3));
    }

    @Test
    public void testSumaNegativoYPositivo() {
        assertEquals(1, Calculadora.sumar(-2, 3));
    }
}