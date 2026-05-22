/*
 * Click nbfs://nbhost/Syste+mFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_figura_2_4;

import java.util.Date;

/**
 *
 * @author mesteso
 */
public class Conserjes extends Trabajador{
    String grupo;// valores posibles limpieza,mantenimiento,antencion al cliente
    double salario_base;
    double antiguedad;
    double trienios;

    public Conserjes(String grupo, double salario_base, double antiguedad, double trienios, int nrp, double bono, String dni, String nombre, String apellido1, String apellido2, Date fecha_nac) {
        super(nrp, bono, dni, nombre, apellido1, apellido2, fecha_nac);
        this.grupo = grupo;
        this.salario_base = salario_base;
        this.antiguedad = antiguedad;
        this.trienios = trienios;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
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

    @Override
    public String toString() {
        return "Conserjes{" + "grupo=" + grupo + ", salario_base=" + salario_base + ", antiguedad=" + antiguedad + ", trienios=" + trienios + '}';
    }

    
    // Calcula el salario del conserje
    public double calcular_salario(){
        double total;
        total=this.salario_base+this.trienios*this.antiguedad+super.bono;
        return total;
    }
    
}
