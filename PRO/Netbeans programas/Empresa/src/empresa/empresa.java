/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author daw1-25
 */
public class empresa {
        public static void main(String[] args) {
            ArrayList<Empleado> emp = new ArrayList<>();
            Servicio.entradadedatos(emp);
            System.out.println("Resultados");
            Servicio.mostrarSalarios(emp);
            Empleado empleadomasclientes = Servicio.empleadoConMasClientes(emp);
            System.out.println("El empleado con mas clientes es: " + empleadomasclientes() + " " + empleadomasclientes.getApellido());
    }
}
