/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maxima_persona_edad;

import java.util.Scanner;

/**
 *
 * @author mesteso
 */
public class Personas {
    String dni;
    String nombre;
    int edad;

    public Personas() {
    }

    

    public Personas(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    public int entrada_datos(Personas[] per){
        Scanner entrada=new Scanner(System.in);
        Personas per1=new Personas();
        String dni;
        String nombre;
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
            per1=new Personas(dni,nombre,edad);
            
            per[indice]=per1;
            System.out.println(per[indice].toString());
            indice++;
            System.out.println("Dame la edad de la persona");
            edad=entrada.nextInt();
        }
      return indice-1;  
    }
}
