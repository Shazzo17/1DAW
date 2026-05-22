/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4array;

/**
 *
 * @author daw1-25
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dame el primer numero");
        Scanner entry = new Scanner(System.in);
        int[] data=new int[4];
        int index=0;
        while (index<=3) {
        data[index] = entry.nextInt();
        System.out.println("El numero " + data[index] + " esta en la posicion " + index);
        index++;
        System.out.println("Dame el otro numero hasta el 4");
        }
        entry.close();
    }
}
