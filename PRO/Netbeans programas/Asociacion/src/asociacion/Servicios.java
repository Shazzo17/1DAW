/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacion;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author daw1-25
 * 
 */
public class Servicios {
    public ArrayList<Universidad> entrada_datos_con_alumnos(){
        ArrayList<Universidad> uni=new ArrayList<>();
        Universidad u;
        Scanner entrada=new Scanner(System.ini);
        String num_univ;
        String nombre;
        String direccion;
        String tipo;
        ArrayList<Alumnos> al;
        System.out.println("Dame el identificador de universidad");
        num_univ=entrada.next();
        while (num_univ.compareTo("0")!=0) {
            System.out.println("Dame el nombre de universidad");
            nombre=entrada.next();
            System.out.println("Dame la direccion de universidad");
            direccion=entrada.next();
            System.out.println("Dame el tipo de universidad");
            tipo=entrada.next();
            u=new Universidad(num_univ,nombre,direccion,tipo);
            uni.add(u);
            System.out.println("Dame el identificador de universidad");
            num_univ=entrada.next();
        }
        System.out.println("Dame el identificador de universidad a buscar");
        num_univ=entrada.next();
        if(buscar_universidad(num_univ,uni)){
         al=entrada_alumno_segun_univ();
         u.setAl(al);
         uni.add(u);
        }
        return uni;
    }
    
    public ArrayList<Alumnos> entrada_alumno_segun_univ(){
    
    }
    
    public boolean buscar_universidad(num_univ,ArrayList<Universidad> un){
    }
}
