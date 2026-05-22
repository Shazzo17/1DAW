/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.ed.testing;

/**
 *
 * @author daw1-25
 */
public class UtilidadesTexto {
    public static String normalizar(String texto) {
        // Hay que comprobar primero si es null para evitar un NullPointerException
        if (texto == null) {
            return "";
        }
        // trim() quita espacios al inicio y final; toUpperCase() lo pasa a mayúsculas
        return texto.trim().toUpperCase();
    }
}