/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.minecraft;

/**
 *
 * @author daw1-25
 */
public class Personaje {
    private String nombre;
    private int vida;
    private int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void subirNivel() {
    nivel++;
    }
    
    public void recibirDanio(int cantidad) {
    vida -= cantidad;
    }
    
        @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", vida=" + vida + ", nivel=" + nivel + '}';
    }
}
