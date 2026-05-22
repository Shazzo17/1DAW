/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author daw1-25
 */
public abstract class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int anio;
    public abstract double calcularSalario();

    /**
     * 
     *@return nombre+apellido
     */
    
    public String nombre_completo(){
        return nombre + " " + apellido;
    }
    
    public Empleado(String dni, String nombre, String apellido, int anio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anio = anio;
    }

    public Empleado() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", anio=" + anio + '}';
    }


    
}
