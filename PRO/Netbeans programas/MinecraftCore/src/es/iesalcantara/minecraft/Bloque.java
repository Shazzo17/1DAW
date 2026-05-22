/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.minecraft;

/**
 *
 * @author daw1-25
 */
public class Bloque {
    private String tipo;
    private int dureza;

    public Bloque(String tipo, int dureza) {
        this.tipo = tipo;
        this.dureza = dureza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public boolean esIrrompible() {
        return dureza > 100;
    }
    
    @Override
    public String toString() {
        return "Bloque{" + "tipo=" + tipo + ", dureza=" + dureza + '}';
    }
}
