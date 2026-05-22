/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.ies.alcantara.ed.testing;

/**
 *
 * @author daw1-25
 */
import es.iesalcantara.ed.testing.Contador;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContadorTest {
    
    private Contador miContador;

    // @Before se ejecuta SIEMPRE justo antes de cada @Test. 
    // Así nos aseguramos de que cada prueba empieza con un contador nuevo en 0.
    @Before
    public void setUp() {
        miContador = new Contador();
    }

    @Test
    public void testValorInicial() {
        assertEquals(0, miContador.obtenerValor());
    }

    @Test
    public void testIncrementarUnaVez() {
        miContador.incrementar();
        assertEquals(1, miContador.obtenerValor());
    }

    @Test
    public void testIncrementarDosVeces() {
        miContador.incrementar();
        miContador.incrementar();
        assertEquals(2, miContador.obtenerValor());
    }
}