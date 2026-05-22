/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg090426clase;

/**
 *
 * @author daw1-25
 */
public class Profesores extends Personas {

    public Profesores(String dni, String nombre, String apellido, int edad) {
        super(dni, nombre, apellido, edad);
    }

    @Override
    public String toString() {
        return "Profesores{" + '}';
    }

}
