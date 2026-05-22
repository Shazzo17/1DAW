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
public class Facturas {
    Cliente cl;
    String id_factura;
    Date fecha;
    Proveedor pr;
    Productos[] prod;
   int  longitud_productos=0;

    public Facturas() {
    }

    public Facturas(Cliente cl, String id_factura, Date fecha, Proveedor pr, Productos[] prod) {
        this.cl = cl;
        this.id_factura = id_factura;
        this.fecha = fecha;
        this.pr = pr;
        this.prod = prod;
    }

    public Cliente getCl() {
        return cl;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Proveedor getPr() {
        return pr;
    }

    public void setPr(Proveedor pr) {
        this.pr = pr;
    }

    public Productos getProd(int posicion) {
        return prod[posicion];
    }

    public void setProd(Productos pr) {
       prod[longitud_productos]=pr;
       longitud_productos++;
       
    }

    public int getLongitud_productos() {
        return longitud_productos;
    }

    public void setLongitud_productos(int longitud_productos) {
        this.longitud_productos = longitud_productos;
    }
    
    
}
