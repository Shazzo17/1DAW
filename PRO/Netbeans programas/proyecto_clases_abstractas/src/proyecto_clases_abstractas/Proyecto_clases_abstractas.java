/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_clases_abstractas;

/**
 *
 * @author daw1-25
 */
public class Proyecto_clases_abstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total;
        servicios se=new Servicios();
        ArrayList<Empleado> emp;
        emp=se.entrada_de_datos();
        total=se.total_salarios(emp);
    }
    
}
