/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.ed.documentacion;

/**
 * Un simple programa para hacer calculos simples (suma, resta y division).
 * @author daw1-25
 * @version 1.0
 */

public class Calculadora {
    
    /**
     * Suma dos numeros.
     * @param a El primer numero a sumar.
     * @param b El segundo numero a sumar.
     * @return El resultado de la suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
        }
    
    /**
     * Resta dos numeros.
     * @param a El primer numero a restar.
     * @param b El segundo numero a restar.
     * @return El resultado de la resta de a y b.
     */
    public int restar(int a, int b) {
        return a - b;
        }
    
    /**
     * Divide 2 numeros
     * @param a El primer numero a dividir.
     * @param b El segundo numero a dividir.
     * @return El resultado de la division.
     * @throws IllegalArgumentException si b es igual a cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
        throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        
    return (double) a / b;
    }
}