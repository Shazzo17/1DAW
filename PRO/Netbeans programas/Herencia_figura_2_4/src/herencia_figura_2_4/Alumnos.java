/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_figura_2_4;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mesteso
 */
public class Alumnos extends Personas {
    int nia;
    Notas no;
    double bonoa;

    public Alumnos(int nia, Notas no, double bonoa, String dni, String nombre, String apellido1, String apellido2, Date fecha_nac) {
        super(dni, nombre, apellido1, apellido2, fecha_nac);
        this.nia = nia;
        this.no = no;
        this.bonoa = bonoa;
    }
    
    

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public Notas getNo() {
        return no;
    }

    public void setNo(Notas no) {
        this.no = no;
    }

    public double getBonoa() {
        return bonoa;
    }

    public void setBonoa(double bonoa) {
        this.bonoa = bonoa;
    }
    
    // Calcula el sueldo del alumno,
    // devuelve un double que es el resultado de sumar todas las notas y dividirlas por el numero de notas
    // y multiplicar por el bonoa
    public double calcular_salario(){
        double total;
        total= (no.getFisica()+no.getGeografia()+no.getLengua()+no.getMatematicas())/4*bonoa;
        return total;
        
    }
}
