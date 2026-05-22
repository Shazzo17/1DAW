/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diseno_facturas;

/**
 *
 * @author mesteso
 */
import java.util.Date;
public class Productos {
    Date fecha_pedido;
    int cantidad;
    String descripcion;
    Double importe_unidad;
    Double precio_total;

    public Productos() {
    }

    public Productos(Date fecha_pedido, int cantidad, String descripcion, Double importe_unidad) {
        this.fecha_pedido = fecha_pedido;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.importe_unidad = importe_unidad;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getImporte_unidad() {
        return importe_unidad;
    }

    public void setImporte_unidad(Double importe_unidad) {
        this.importe_unidad = importe_unidad;
    }

    public Double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Double precio_total) {
        this.precio_total = precio_total;
    }

    @Override
    public String toString() {
        return "Productos{" + "fecha_pedido=" + fecha_pedido + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", importe_unidad=" + importe_unidad + ", precio_total=" + precio_total + '}';
    }
    
    
}
