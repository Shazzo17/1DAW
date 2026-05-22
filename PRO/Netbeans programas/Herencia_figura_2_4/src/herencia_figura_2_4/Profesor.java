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
public class Profesor extends Trabajador {
    String departamento;
    double salario_base;
    double  antiguedad;
    double trienios;
    double plus;

    public Profesor(String departamento, double salario_base, double antiguedad, double trienios, double plus, int nrp, double bono, String dni, String nombre, String apellido1, String apellido2, Date fecha_nac) {
        super(nrp, bono, dni, nombre, apellido1, apellido2, fecha_nac);
        this.departamento = departamento;
        this.salario_base = salario_base;
        this.antiguedad = antiguedad;
        this.trienios = trienios;
        this.plus = plus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getTrienios() {
        return trienios;
    }

    public void setTrienios(double trienios) {
        this.trienios = trienios;
    }

    public double getPlus() {
        return plus;
    }

    public void setPlus(double plus) {
        this.plus = plus;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + ", salario_base=" + salario_base + ", antiguedad=" + antiguedad + ", trienios=" + trienios + ", plus=" + plus + '}';
    }
    
    public double calcular_salario(){
        double total;
        total=this.salario_base+this.antiguedad*this.trienios+this.plus+super.bono;
        return total;
    }
    
}
