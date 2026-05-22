/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploclaseed;

/**
 *
 * @author daw1-25
 */
import java.util.Scanner;
public class Personas {
    private String nombre;
    private String apellidos;
    private int edad;

    public Personas() {
    }

    public Personas(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
        
    public int entrada_datos(Personas per) {
    Scanner entrada = new Scanner(System.in);
    Personas per1 = new Personas();
    String apellidos;
    String nombre;
    int edad;
        System.out.println("Dame tu edad");
    
    
    }
    
    }
    
}
