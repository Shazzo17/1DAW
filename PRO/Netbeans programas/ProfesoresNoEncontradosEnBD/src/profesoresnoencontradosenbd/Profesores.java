/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesoresnoencontradosenbd;

/**
 *
 * @author daw1-25
 */
public class Profesores {

    private String dniP;
    private String nombre;
    private String apellido;
    private int edad;

    public Profesores(String dniP, String nombre, String apellido, int edad) {
        this.dniP = dniP;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Profesores() {
    }

    public String getDniP() {
        return dniP;
    }

    public void setDniP(String dniP) {
        this.dniP = dniP;
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
        return "Profesores{" + "dniP=" + dniP + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

}
