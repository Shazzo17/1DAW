/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegorpg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author migue
 */
public class ServiciosInventario {

    public ArrayList<Arma> armasMayorDanioDado(ArrayList<Item> it, int danioDado) {
        ArrayList<Arma> armasFiltradas = new ArrayList<>();
        Iterator<Item> itr = it.iterator();
        Item i;
        while (itr.hasNext()) {
            i = itr.next();
            if (i instanceof Arma) {
                Arma a = (Arma) i;
                if (a.getPuntosAtaque() > danioDado) {
                    armasFiltradas.add(a);
                }
            }
        }
        return armasFiltradas;
    }

    public Item buscarItemRapido(HashMap<String, Item> it, String nombreBuscado) {
        Item i;
        i = it.get(nombreBuscado);
        return i;
    }
}
