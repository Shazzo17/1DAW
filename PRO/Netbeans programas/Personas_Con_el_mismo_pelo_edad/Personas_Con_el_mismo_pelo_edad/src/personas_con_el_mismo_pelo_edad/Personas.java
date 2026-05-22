/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas_con_el_mismo_pelo_edad;

/**
 *
 * @author mesteso
 */
public class Personas {
    private String dni;
    private String nombre;
    private String color_pelo;
    private int edad;

    public Personas() {
    }

    public Personas(String dni, String nombre, String color_pelo, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.color_pelo = color_pelo;
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

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" + "dni=" + dni + ", nombre=" + nombre + ", color_pelo=" + color_pelo + ", edad=" + edad + '}';
    }
    
}
