/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaexamenia;

/**
 *
 * @author migue
 */
public class Revista extends Material {

    private int numeroEdicion;

    public Revista(String titulo, int anioPublicacion, int numeroEdicion) {
        super(titulo, anioPublicacion); // Llama al constructor del padre
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
}
