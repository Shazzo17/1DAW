/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacion;

/**
 *
 * @author daw1-25
 */
public class Alumnos {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String numero_Universidad;

    public Alumnos() {
    }

    public Alumnos(String dni, String nombre, String apellidos, String direccion, String numero_Universidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numero_Universidad = numero_Universidad;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero_Universidad() {
        return numero_Universidad;
    }

    public void setNumero_Universidad(String numero_Universidad) {
        this.numero_Universidad = numero_Universidad;
    }
    
}
