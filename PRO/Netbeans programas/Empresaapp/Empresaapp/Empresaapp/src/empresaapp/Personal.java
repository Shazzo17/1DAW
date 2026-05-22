/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaapp;

import java.util.Date;

/**
 *
 * @author mesteso
 */
abstract public class Personal {
    String dni;
    String nombre;
    String apellido;
    int ano_ingreso;

    /**
     *
     * @return
     */
    public abstract double calcular_salario();

    public Personal() {
    }
    
    
    public Personal(String dni, String nombre, String apellido, int ano_ingreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ano_ingreso = ano_ingreso;
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

    public int getAno_ingreso() {
        return ano_ingreso;
    }

    public void setAno_ingreso(int ano_ingreso) {
        this.ano_ingreso = ano_ingreso;
    }

    @Override
    public String toString() {
        return "Personal{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", ano_ingreso=" + ano_ingreso + '}';
    }
    
  
    
}
