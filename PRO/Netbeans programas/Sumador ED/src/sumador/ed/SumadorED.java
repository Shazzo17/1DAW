/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumador.ed;

/**
 *
 * @author daw1-25
 */
import java.util.Scanner;
public class SumadorED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce el primer numero");
        Scanner entry = new Scanner(System.in);
        int number1;
        int number2;
        int result;
        number1 = entry.nextInt();
        System.out.println("Introduce el segundo numero");
        number2 = entry.nextInt();
        result = number1 + number2;
        System.out.println("El resultado es " + result);
        entry.close();
    }
    
}