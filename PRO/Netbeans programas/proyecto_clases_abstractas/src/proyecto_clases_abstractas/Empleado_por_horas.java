/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_clases_abstractas;

/**
 *
 * @author daw1-25
 */
public class Empleado_por_horas extends Empleado{
    double horas;
    double tarifa;

    public Empleado_por_horas(double horas, double tarifa, String nombre, double salario_Base) {
        super(nombre, salario_Base);
        this.horas = horas;
        this.tarifa = tarifa;
    }
    @Override
    public double calcular_salario(){
        return horas*tarifa;
   }

    @Override
    public String toString() {
        return "Empleado_por_horas{" + "horas=" + horas + ", tarifa=" + tarifa + '}';
    }
    
}
