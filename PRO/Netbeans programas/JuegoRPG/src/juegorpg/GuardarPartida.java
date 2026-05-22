/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegorpg;

/**
 *
 * @author daw1-25
 */
// 1. IMPORTAMOS LAS HERRAMIENTAS
// Necesitamos importar FileWriter (el bolígrafo) y la Excepción específica de archivos
import java.io.FileWriter;
import java.io.IOException;

public class GuardarPartida {

    public static void main(String[] args) {

        // Datos de nuestro personaje que ahora mismo están en la memoria RAM
        String nombreJugador = "Héroe Máquina";
        int oro = 1500;

        System.out.println("Guardando la partida...");

        // 2. LA ARMADURA (Es obligatoria al tocar archivos)
        try {
            // PASO 1: ABRIR LA TUBERÍA (Coger el bolígrafo)
            // Le decimos cómo se va a llamar el archivo. Si no existe, lo crea.
            FileWriter escritor = new FileWriter("partida_guardada.txt");

            // PASO 2: ESCRIBIR EN EL CUADERNO
            // Usamos .write() para mandar texto. 
            // El "\n" sirve para pulsar la tecla "Enter" (salto de línea) en el archivo.
            escritor.write("--- DATOS DEL JUGADOR ---\n");
            escritor.write("Nombre: " + nombreJugador + "\n");
            escritor.write("Oro acumulado: " + oro + "\n");
            escritor.write("-------------------------\n");

            // PASO 3: ¡CERRAR LA TUBERÍA! (Imprescindible)
            // Si no pones esta línea, el archivo se queda vacío porque no "guarda" los cambios.
            escritor.close();

            // Si el código llega aquí sin explotar, es que todo ha ido bien
            System.out.println("¡Partida guardada con éxito!");

        } catch (IOException e) {
            // Si el disco duro está lleno o hay un error raro, el programa no explota, cae aquí
            System.out.println("❌ Error catastrófico al intentar guardar el archivo.");
        }
    }
}
