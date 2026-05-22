/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_clases_abstractas;

/**
 *
 * @author daw1-25
 */
public abstract class Empleado {
    protected String nombre;
    protected double salario_Base;
    public abstract double calcular_salario();
    
    public Empleado(String nombre, double salario_Base) {
        this.nombre = nombre;
        this.salario_Base = salario_Base;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario_Base=" + salario_Base + '}';
    }
   
}
