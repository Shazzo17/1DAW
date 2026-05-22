/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacion;

/**
 *
 * @author daw1-25
 */
import java.util.Scanner;
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Cuantos numeros quieres meter");
    Scanner entry=new Scanner (System.in);
    int result=1;
    int index=0;
    int long_array = entry.nextInt();
    int[] array = new int[long_array];
    
    while (index < long_array) {
    System.out.println("Mete un numero");
    array[index] = entry.nextInt();
    System.out.println("El numero " + array[index] + " esta en la posicion " + index);
    System.out.println(result + "*" + array[index] + "=" + (result=result * array[index]));
    index++;
    }
    
  }
    
}
