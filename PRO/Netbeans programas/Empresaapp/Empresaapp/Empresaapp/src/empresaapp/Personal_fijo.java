/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaapp;

import java.time.LocalDate;
import java.time.Year;

/**
 *
 * @author mesteso
 */
public class Personal_fijo extends Personal {
    double sueldo_fijo;

    public Personal_fijo(double sueldo_fijo, String dni, String nombre, String apellido, int ano_ingreso) {
        super(dni, nombre, apellido, ano_ingreso);
        this.sueldo_fijo = sueldo_fijo;
    }

    public double getSueldo_fijo() {
        return sueldo_fijo;
    }

    public void setSueldo_fijo(double sueldo_fijo) {
        this.sueldo_fijo = sueldo_fijo;
    }

    @Override
    public String toString() {
        return "Personal_fijo{" + "sueldo_fijo=" + sueldo_fijo + '}';
    }
    
    
    public  double calcular_salario(){
        int ano_actual=LocalDate.now().getYear();
        if(ano_actual-ano_ingreso<2){
            return sueldo_fijo;
        }
        if(ano_actual-ano_ingreso>=2 && ano_actual-ano_ingreso<=5){
            return sueldo_fijo=sueldo_fijo+sueldo_fijo*0.05;
        }
        return sueldo_fijo=sueldo_fijo+sueldo_fijo*0.1;
        
        
    }
}
