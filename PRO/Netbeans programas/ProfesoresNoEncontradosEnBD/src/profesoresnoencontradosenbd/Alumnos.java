/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesoresnoencontradosenbd;

/**
 *
 * @author daw1-25
 */
public class Alumnos {

    private String dniA;
    private String nombre;
    private String apellido;
    private int edad;

    public Alumnos(String dniA, String nombre, String apellido, int edad) {
        this.dniA = dniA;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Alumnos() {
    }

    public String getDniA() {
        return dniA;
    }

    public void setDniA(String dniA) {
        this.dniA = dniA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "dniA=" + dniA + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

}
