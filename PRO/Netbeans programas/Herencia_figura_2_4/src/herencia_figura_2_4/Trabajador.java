/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_figura_2_4;

import java.util.Date;

/**
 *
 * @author mesteso
 */
public  abstract class Trabajador extends Personas{

       protected int nrp;
       protected double bono;
       protected abstract double calcular_salario();

    public Trabajador(int nrp, double bono, String dni, String nombre, String apellido1, String apellido2, Date fecha_nac) {
        super(dni, nombre, apellido1, apellido2, fecha_nac);
        this.nrp = nrp;
        this.bono = bono;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nrp=" + nrp + ", bono=" + bono + '}';
    }
    
    
       
    
       
    
    
    
}
