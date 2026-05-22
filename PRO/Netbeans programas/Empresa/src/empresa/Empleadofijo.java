/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author daw1-25
 */
import java.time.LocalDate;
public class Empleadofijo extends Empleado{
    private double sueldofijo;
   
    public Empleadofijo(double sueldofijo, String dni, String nombre, String apellido, int anio) {
        super(dni, nombre, apellido, anio);
        this.sueldofijo = sueldofijo;
    }

    public double getSueldofijo() {
        return sueldofijo;
    }

    public void setSueldofijo(double sueldofijo) {
        this.sueldofijo = sueldofijo;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleadofijo{" + "sueldofijo=" + sueldofijo +'}';
    }
    
    @Override
    public double calcularSalario(){
        int ano_actual=LocalDate.now().getYear();
        if (ano_actual-super.getAnio()>=2 && ano_actual-super.getAnio()<=5){
            return sueldofijo=sueldofijo*0.05+sueldofijo;
        }
        if (ano_actual-super.getAnio()>5){
            return sueldofijo=sueldofijo*0.1+sueldofijo;
        }
        return sueldofijo;
    }
}
