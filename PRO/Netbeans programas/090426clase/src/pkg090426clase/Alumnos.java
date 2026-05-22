/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg090426clase;

/**
 *
 * @author daw1-25
 */
public class Alumnos extends Personas {

    private int numMatricula;

    public Alumnos(int numMatricula, String dni, String nombre, String apellido, int edad) {
        super(dni, nombre, apellido, edad);
        this.numMatricula = numMatricula;
    }

    public Alumnos() {
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "numMatricula=" + numMatricula + '}';
    }

}
