/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_clases_abstractas;

/**
 *
 * @author daw1-25
 */
public class Empleado_Asalariado extends Empleado{
    double bono;

    public Empleado_Asalariado(double bono, String nombre, double salario_Base) {
        super(nombre, salario_Base);
        this.bono = bono;
    }
    @Override
    public double calcular_salario(){
        return salario_Base+bono;
    }

    @Override
    public String toString() {
        return "Empleado_Asalariado{" + "bono=" + bono + '}';
    }
}
