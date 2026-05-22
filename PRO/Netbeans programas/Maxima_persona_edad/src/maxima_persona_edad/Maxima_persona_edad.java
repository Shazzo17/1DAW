/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxima_persona_edad;

/**
 *
 * @author mesteso
 */
import java.util.Scanner;
public class Maxima_persona_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* String mayor;
        int edad;
        String nombre;
        String dni;
        Personas per= new Personas();
        Scanner entr=new Scanner(System.in);
        System.out.println("Dame la edad de la  persona");
        edad=entr.nextInt();
        mayor="";
       
        while (edad!=0) {
            System.out.println("Dame el nombre persona");
            nombre=entr.next();
            System.out.println("Dame el dni persona");
            dni=entr.next();
            if (nombre.compareTo(mayor)>0) {
                mayor =nombre;
                per=new Personas(dni,mayor,edad);
                System.out.println("El nombre de la persona mayor es "+per.toString());
            }
            System.out.println("Dame la edad de la persona 0 cero para salir");
            edad=entr.nextInt();
        }
        System.out.println("el nombre mayor de la persona es "+per.toString());*/
            Personas[] datos=new Personas[50];
            int longitud_array;
            Personas per= new Personas();
            longitud_array=per.entrada_datos(datos);
            per.ordenar(datos, longitud_array);
            
            
            
        }
        
        
    }
    

