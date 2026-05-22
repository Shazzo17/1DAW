/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personasiguales;

/**
 *
 * @author daw1-25
 */
public class NombresRepetidos {
    private String nombre;
    int repeticiones;

    public NombresRepetidos(String nombre, int repeticiones) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    @Override
    public String toString() {
        return "NombresRepetidos{" + "nombre=" + nombre + ", repeticiones=" + repeticiones + '}';
    }
    
}
