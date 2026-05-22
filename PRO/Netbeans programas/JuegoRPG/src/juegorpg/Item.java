/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegorpg;

/**
 *
 * @author migue
 */
abstract public class Item {

    private String nombre;
    private int valorOro;
    private static int totalItemsCreados = 0;

    public Item(String nombre, int valorOro) {
        this.nombre = nombre;
        this.valorOro = valorOro;
        totalItemsCreados++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorOro() {
        return valorOro;
    }

    public void setValorOro(int valorOro) {
        this.valorOro = valorOro;
    }

    public static int getTotalItemsCreados() {
        return totalItemsCreados;
    }

    public static void setTotalItemsCreados(int totalItemsCreados) {
        Item.totalItemsCreados = totalItemsCreados;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", valorOro=" + valorOro + '}';
    }

}
