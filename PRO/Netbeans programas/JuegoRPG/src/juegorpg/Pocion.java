/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegorpg;

/**
 *
 * @author migue
 */
public class Pocion extends Item implements Consumible {

    private int puntosCuracion;

    public Pocion(int puntosCuracion, String nombre, int valorOro) {
        super(nombre, valorOro);
        this.puntosCuracion = puntosCuracion;
    }

    public int getPuntosCuracion() {
        return puntosCuracion;
    }

    public void setPuntosCuracion(int puntosCuracion) {
        this.puntosCuracion = puntosCuracion;
    }

    @Override
    public String toString() {
        return "Pocion{" + "puntosCuracion=" + puntosCuracion + '}';
    }

    @Override
    public void usar() {
        System.out.println("Te has bebido una pocion y te has curado " + puntosCuracion + " de vida");
    }

}
