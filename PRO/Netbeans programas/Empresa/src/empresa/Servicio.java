/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author daw1-25
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Servicio {
    public static void mostrarSalarios(ArrayList<Empleado> emp) {
        Empleado empa = null;
        Iterator<Empleado> itr=emp.iterator();
        while (itr.hasNext()) {
        empa = itr.next();
            System.out.println(empa.nombre_completo()+ " " + empa.calcularSalario());
        }
    }
            
    public static Empleado empleadoConMasClientes(ArrayList<Empleado> emp){
        Iterator<Empleado> itr=emp.iterator();
        Empleado empleadomasclientes = null;
        int MaxClientes = 0;
        while (itr.hasNext()) {
            Empleado empa = itr.next();
                if (empa instanceof Empleadocomision) {
                    Empleadocomision tc = (Empleadocomision) empa;
                    if (MaxClientes<tc.getNumeroclientes()){
                        MaxClientes=tc.getNumeroclientes();
                        empleadomasclientes = empa;
                    }
                }
        }
        return empleadomasclientes;
    }
    
        public static void entradadedatos(ArrayList<Empleado> emp) {
        Scanner entrada = new Scanner(System.in);
        String dni;
        String nombre;
        String apellido;
        int anio;
        double sueldofijo;
        double salariominimo;
        int numeroclientes;
        double montocliente;
        boolean añadirusuario=true;
        int tipoempleado;
        String sino;
        
        while (añadirusuario){
            System.out.println("Pon un 1 si quieres meter un empleado fijo y un 2 si quieres meter un empleado a comision");
            tipoempleado = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Dame el dni del empleado");
            dni = entrada.nextLine();
            System.out.println("Dame el nombre del empleado");
            nombre = entrada.nextLine();
            System.out.println("Dame el apellido del empleado");
            apellido = entrada.nextLine();
            System.out.println("Dame el año de contratacion del empleado");
            anio = entrada.nextInt();
            entrada.nextLine();
            
            if (tipoempleado == 1) {
                System.out.println("Dame el sueldofijo del empleado");
                sueldofijo = entrada.nextDouble();
                entrada.nextLine();
                Empleadofijo Ef = new Empleadofijo(sueldofijo,dni, nombre, apellido, anio);
                emp.add(Ef);
            }
            
            if (tipoempleado == 2){
                System.out.println("Dame el salario minimo del empleado");
                salariominimo = entrada.nextDouble();
                entrada.nextLine();
                System.out.println("Dame el monto de cliente del empleado");
                montocliente = entrada.nextDouble();
                entrada.nextLine();
                System.out.println("Dame el numero de clientes del empleado");
                numeroclientes = entrada.nextInt();
                entrada.nextLine();
                Empleadocomision Ec = new Empleadocomision(salariominimo, numeroclientes, montocliente, dni, nombre, apellido, anio);
                emp.add(Ec);
            }
                
            if (tipoempleado > 2) {
                System.out.println("Tiene que ser un numero entre el 1 y el 2");
            }
            System.out.println("¿Quieres añadir otro usuario? Usa si o no");
            sino = entrada.nextLine();
            if (sino.equalsIgnoreCase("no")){
                añadirusuario = false;
            }
                
            
            
        }
    }
        /**
    public static Empleado empleadoConMasClientes(ArrayList<Empleado> emp){
        Empleado e=null,c;
        Iterator<Empleado> itr=per.iterator();
        int maximo = 0;
        
        while (itr.hasNext()) {
            c=itr.next();
            if (c instanceof Empleadocomision){
                dato = (((Empleadocomision) c).getMontocliente();
                if (dato>maximo) {
                    maximo=dato;
                    p=c;
                }
            }
                
        }
        return p;
    }
        **/
}



