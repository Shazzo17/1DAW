/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegorpg;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class JuegoRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int monedas;
        boolean numeroValido = false;
        Scanner entrada = new Scanner(System.in);
        while (!numeroValido) {
            try {
                System.out.println("Cuantas monedas de oro quieres donar al creador del juego");
                monedas = entrada.nextInt();

                System.out.println("Gracias por donar " + monedas + " monedas");
                numeroValido = true;

            } catch (Exception e) {
                System.out.println("Debes introducir un numero valido");
                entrada.nextLine();
            }
        }
    }

}
