/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegorpg;

/**
 *
 * @author migue
 */
public class Arma extends Item {

    private int puntosAtaque;

    public Arma(int puntosAtaque, String nombre, int valorOro) {
        super(nombre, valorOro);
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public String toString() {
        return "Arma{" + "puntosAtaque=" + puntosAtaque + '}';
    }

}
