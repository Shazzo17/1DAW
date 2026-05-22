/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacion;
import java.util.ArrayList;

/**
 *
 * @author daw1-25
 */
public class Universidad {
    private String numero_Universidad;
    private String nombre;
    private String direccion;
    private String tipo;
    ArrayList<Alumnos> al;

    public Universidad(String numero_Universidad, String nombre, String direccion, String tipo) {
        this.numero_Universidad = numero_Universidad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public Universidad(String numero_Universidad, String nombre, String direccion, String tipo, ArrayList<Alumnos> al) {
        this.numero_Universidad = numero_Universidad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        this.al = al;
    }

    public Universidad() {
    }

    public String getNumero_Universidad() {
        return numero_Universidad;
    }

    public void setNumero_Universidad(String numero_Universidad) {
        this.numero_Universidad = numero_Universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Alumnos> getAl() {
        return al;
    }

    public void setAl(ArrayList<Alumnos> al) {
        this.al = al;
    }
    
}
