/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.ed.documentacion;

/**
 *
 * @author daw1-25
 */
public class ValidadorEdad {

    public static boolean esMayorDeEdad(int edad) {
        if (edad < 0) {
        throw new IllegalArgumentException("Edad inválida");
        }
        
        return edad >= 18;
        
    }
}
