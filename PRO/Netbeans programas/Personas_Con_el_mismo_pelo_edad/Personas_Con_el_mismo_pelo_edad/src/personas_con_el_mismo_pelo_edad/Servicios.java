/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas_con_el_mismo_pelo_edad;

import java.util.Scanner;

/**
 *
 * @author mesteso
 */
public class Servicios {
    public int entrada_datos(Personas[] per){
        Scanner entrada=new Scanner(System.in);
        Personas per1=new Personas();
        String dni;
        String nombre;
        String color_pelo;
        int edad;
        int indice;
        System.out.println("Dame la edad de la persona");
        edad=entrada.nextInt();
        indice=0;
        while(edad!=0){
            System.out.println("Dame el dni del Persona");
            dni=entrada.next();
            System.out.println("Dame el nombre del Persona");
            nombre=entrada.next();
            System.out.println("Dame el color de pelo del Persona");
            color_pelo=entrada.next();
            per1=new Personas(dni,nombre,color_pelo,edad);
            
            per[indice]=per1;
            System.out.println(per[indice].toString());
            indice++;
            System.out.println("Dame la edad de la persona");
            edad=entrada.nextInt();
        }
      return indice-1;  
    }
    public int Personas_mismo_pel_edad(Personas[] per,int longitud_array,Pelos_iguales[] pi){
        int indice_per;
        int indice_pel;
        int longitud_pelos=0;
        int cantidad;
        int posicion;
        Pelos_iguales pl= new Pelos_iguales();
        String colo_pelo;
        int edad;
        Personas dato;
        indice_per=0;
        indice_pel=0;
        while (indice_per<=longitud_array){
            dato=per[indice_per];
            if (indice_pel==0){
                colo_pelo=dato.getColor_pelo();
                edad=dato.getEdad();
                pl=new Pelos_iguales(colo_pelo,edad,1);
                pi[indice_pel]=pl;
                longitud_pelos=indice_pel;
            }
            else
            {
                indice_pel=0;
                while (indice_pel<=longitud_pelos && dato.getColor_pelo().compareTo(pi[indice_pel].getColor_pelo())!=0){
                    indice_pel++;
                }
                if (indice_pel<longitud_pelos){
                    if (dato.getEdad()==pi[indice_pel].getEdad()){
                        cantidad=pi[indice_pel].getCantidad()+1;
                        pi[indice_pel].setCantidad(cantidad);
                    }
                    else{
                        // Crear un nuevo objeto en medio del array de Pelos_iguales
                       // desplazar a la derecha
                        posicion=indice_pel;
                        while (posicion<=longitud_pelos){
                            pi[longitud_pelos+1]=pi[longitud_pelos];
                            longitud_pelos--;
                        }
                        colo_pelo=dato.getColor_pelo();
                        edad= dato.getEdad();
                        pl=new Pelos_iguales(colo_pelo,edad,1);
                        pi[posicion]=pl;
                        
                    }
                    
                    
                       
                    
                }
                else{
                    // Crear un nuevo objeto completo
                     colo_pelo=dato.getColor_pelo();
                     edad= dato.getEdad();
                     pl=new Pelos_iguales(colo_pelo,edad,1);
                     pi[indice_pel]=pl;
                     longitud_pelos=indice_pel;
                }
            }
        }
        return indice_pel;
    }
    
}
