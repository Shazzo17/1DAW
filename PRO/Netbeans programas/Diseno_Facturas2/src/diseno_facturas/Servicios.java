/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diseno_facturas;

/**
 *
 * @author mesteso
 */
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Servicios {

    public Servicios() {
    }
   public int longitud_entrada entrada_datos(Facturas[] fact) throws ParseException {
     Scanner entrada=new Scanner(System.in);
      Cliente cl=new Cliente();
      Proveedor pro=new Proveedor();
      Productos prod=new Productos();
      Facturas fa= new Facturas();
      Productos[] linea_producto=new Productos[50];
      String id_cliente;
      String nombre_cliente;
      String nombre_proveedor;
      String direccion;
      String correo;
      String num_factura;
      Date fecha_factura;
      Date fecha_producto;
      String leer_fecha;
      String descripcion_producto;
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      int longitud_productos;//cantidad de productos
      int indice; // se añaden los productos
      int cantidad;// La cantidad de productos que se lleva el cliente. 
      //Servirá tambien para terminar el bucle de los productos, cuando
      // se lea una cantidad cero,
      Double importe_producto;
      Double importe_total_producto;
      
      // Colocar el bucle para pedir mas facturas
      System.out.println(" Dame el id del cliente");
      id_cliente=entrada.next();
      System.out.println(" Dame el nombre del cliente");
      nombre_cliente=entrada.next();
      System.out.println(" Dame la direccion del cliente");
      direccion=entrada.next();
      System.out.println(" Dame el correo del cliente");
      correo=entrada.next();
      cl=new Cliente(id_cliente,nombre_cliente,direccion,correo);
      System.out.println(" Dame el identificador de la factura");
      num_factura=entrada.next();
      System.out.println(" Dame la fecha de la  factura");
      leer_fecha=entrada.next();
      fecha_factura=sdf.parse(leer_fecha);
      System.out.println(" Dame el nombre del proveedor");
      nombre_proveedor=entrada.next();
      System.out.println(" Dame la direccion del proveedor");
      direccion=entrada.next();
      System.out.println(" Dame el correo del cliente");
      correo=entrada.next();
      pro=new Proveedor(nombre_proveedor,direccion,correo);
      indice=0;
      System.out.println(" Dame la cantidad de producto");
      cantidad=entrada.nextInt();
      while (cantidad!=0){
           System.out.println(" Dame la fecha de la compra del producto");
           leer_fecha=entrada.next();
           fecha_producto=sdf.parse(leer_fecha);
           System.out.println(" Dame la descripcion del producto");
           descripcion_producto=entrada.next();
           System.out.println(" Dame el importe de cada unidad de producto");
           importe_producto=entrada.nextDouble();
           importe_total_producto=importe_producto*cantidad;
           prod=new Productos(fecha_producto,cantidad,descripcion_producto, importe_producto,importe_total_producto);
           linea_producto[indice]=prod;
           indice++;
           System.out.println(" Dame la siguiente cantidad o cero para terminar");
           cantidad=entrada.nextInt();
        }
      longitud_productos=indice-1;
      fa=new Facturas(cl,num_factura,fecha_factura,pro,linea_producto);
      fa.setLongitud_productos(longitud_productos);
      
      
      
      
   }
   
}
