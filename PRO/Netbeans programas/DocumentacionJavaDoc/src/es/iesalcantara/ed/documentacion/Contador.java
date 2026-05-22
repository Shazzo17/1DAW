/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.ed.documentacion;

/**
 *
 * @author daw1-25
 */
public class Contador {
    private int valor;

    public Contador() {
        valor = 0;
        }

    public void incrementar() {
        valor++;
        }

    public int obtenerValor() {
        return valor;
        }
}