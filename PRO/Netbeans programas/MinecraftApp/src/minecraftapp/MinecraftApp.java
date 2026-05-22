/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minecraftapp;

/**
 *
 * @author daw1-25
 */
import java.util.Scanner;
import es.iesalcantara.minecraft.*;

public class MinecraftApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el nombre");
        String nombreRecibido = teclado.nextLine();
        System.out.println("Dime la vida");
        int vidaRecibida = teclado.nextInt();
        System.out.println("Dime el nivel");
        int nivelRecibido = teclado.nextInt();
        teclado.nextLine();
        Personaje p1 = new Personaje(nombreRecibido,vidaRecibida,nivelRecibido);
        
        p1.subirNivel();
        System.out.println("Tu nivel ha subido y ahora es " + p1.getNivel());
        
        p1.recibirDanio(99);
        System.out.println("TU VIDA HA BAJADO MUCHO Y ESTAS A " + p1.getVida());
        
        System.out.println("Dime el nombre de tu bloque");
        String nombrebloqueRecibido = teclado.nextLine();
        System.out.println("Dime la dureza de tu bloque");
        int durezaRecibida = teclado.nextInt();
        teclado.nextLine();
        Bloque b1 = new Bloque(nombrebloqueRecibido,durezaRecibida);
        
        if (b1.esIrrompible()) {
        System.out.println("El bloque es irrompible");}
        else {System.out.println("El bloque no es irrompible");}
        
        System.out.println("Dime el nombre de tu item");
        String nombreitemRecibido = teclado.nextLine();
        System.out.println("Dime la cantidad de items que tienes");
        int cantidadRecibida = teclado.nextInt();
        Item i1 = new Item(nombreitemRecibido,cantidadRecibida);
        
        i1.usar();
        System.out.println("Has usado 1 vez tu item ahora tienes " + i1.getCantidad());
    }
    
}
