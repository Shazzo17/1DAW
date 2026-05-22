/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.minecraft;

/**
 *
 * @author daw1-25
 */
public class Item {
    private String nombre;
    private int cantidad;

    public Item(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void usar() {
    if (cantidad > 0) {
    cantidad--;
    }
    }
    
    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
}
