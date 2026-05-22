/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.ed.documentacion;

/**
 * Un programa que normaliza el texto.
 * @author daw1-25
 * @version 1.0
 */
public class UtilidadesTexto {
   
    /**
     * Si no hay texto devuelve una c adena de texto vacia, si hay texto quita los espacios del principio o del final del texto y lo convierte a UpperCase
     * @param texto El texto que quieres normalizar.
     * @return Si el texto era null devuelve una cadena de texto vacia, si no devuelve el texto en UpperCase y sin espacios al final ni al principio.
     */
    public static String normalizarTexto(String texto) {
    if (texto == null) {
        return "";
        }
    
    return texto.trim().toUpperCase();
    
    }
}
