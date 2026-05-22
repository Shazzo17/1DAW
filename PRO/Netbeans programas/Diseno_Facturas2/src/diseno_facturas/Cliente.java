/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diseno_facturas;

/**
 *
 * @author mesteso
 */
public class Cliente {
    String id_cliente;
    String nombre_cliente;
    String direccion;
    String correo;

    public Cliente() {
    }

    public Cliente(String id_cliente, String nombre_cliente, String direccion, String correo) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.direccion = direccion;
        this.correo = correo;
    }

    

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente + ", direccion=" + direccion + ", correo=" + correo + '}';
    }
    
}
