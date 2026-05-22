/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.ed.testing;

/**
 *
 * @author daw1-25
 */
public class DivisorSeguro {
    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("El divisor no puede ser 0");
        }
        return dividendo / divisor;
    }
}