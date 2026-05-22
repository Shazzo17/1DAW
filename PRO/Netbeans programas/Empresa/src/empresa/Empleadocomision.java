/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author daw1-25
 */
public class Empleadocomision extends Empleado{
    private double salariominimo;
    private int numeroclientes;
    private double montocliente;
   
    public Empleadocomision(double salariominimo, int numeroclientes, double montocliente, String dni, String nombre, String apellido, int anio) {
        super(dni, nombre, apellido, anio);
        this.salariominimo = salariominimo;
        this.numeroclientes = numeroclientes;
        this.montocliente = montocliente;
    }
    
    public double getSalariominimo() {
        return salariominimo;
    }

    public void setSalariominimo(double salariominimo) {
        this.salariominimo = salariominimo;
    }

    public int getNumeroclientes() {
        return numeroclientes;
    }

    public void setNumeroclientes(int numeroclientes) {
        this.numeroclientes = numeroclientes;
    }

    public double getMontocliente() {
        return montocliente;
    }

    public void setMontocliente(double montocliente) {
        this.montocliente = montocliente;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleadocomision{" + "salariominimo=" + salariominimo + ", numeroclientes=" + numeroclientes + ", montocliente=" + montocliente +'}';
    }
    
    @Override
    public double calcularSalario(){
    double sueldototal;
    sueldototal=montocliente*numeroclientes;
    if (sueldototal < salariominimo) {
    return salariominimo;
    }
    return sueldototal;
    }
}
