/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas_con_el_mismo_pelo_edad;

/**
 *
 * @author mesteso
 */
public class Pelos_iguales {
    String color_pelo;
    int edad;
    int cantidad;

    public Pelos_iguales() {
    }

    public Pelos_iguales(String color_pelo, int edad, int cantidad) {
        this.color_pelo = color_pelo;
        this.edad = edad;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pelos_iguales{" + "color_pelo=" + color_pelo + ", edad=" + edad + ", cantidad=" + cantidad + '}';
    }
    
}
