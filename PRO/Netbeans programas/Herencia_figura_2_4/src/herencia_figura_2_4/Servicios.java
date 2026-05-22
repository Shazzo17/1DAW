/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_figura_2_4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mesteso
 */
public class Servicios {

    /**
     * 2. (3 puntos) De la aplicación de Herencia de la figura 2.4 (subida a la
     * plataforma). Se Pide Realizar una función, que dada una nota, me devuelva
     * los alumnos (nombre y apellidos) que tienen una nota media superior a la
     * dada.
     *
     * * @param al La lista completa de alumnos que vamos a evaluar.
     * @param notaDada La nota media de corte que el alumno debe superar.
     * @return Un ArrayList que contiene únicamente a los alumnos filtrados que
     * tienen una media mayor a la dada.
     */
    public ArrayList<Alumnos> alumnosMayorMediaDada(ArrayList<Personas> per, int notaDada) {

        // Variable para almacenar la nueva lista de alumnos que sí cumplen la condición
        ArrayList<Alumnos> alumnosFiltrados = new ArrayList<>();

        // Iterador para poder recorrer la lista original de alumnos uno por uno
        Iterator<Personas> itr = per.iterator();

        // Variable temporal para guardar el alumno actual que estamos analizando en cada vuelta
        Personas p;

        // Bucle while que se repite mientras sigan quedando alumnos por revisar en la lista
        while (itr.hasNext()) {
            p = itr.next();

            if (p instanceof Alumnos) {
                Alumnos a = (Alumnos) p;
                // Calculamos la media sumando las 4 asignaturas y dividiendo entre 4.
                // Si el resultado es estrictamente mayor que la notaDada, entra en el bloque.
                if ((a.no.getFisica() + a.no.getGeografia() + a.no.getLengua() + a.no.getMatematicas()) / 4 > notaDada) {

                    // El alumno cumple la condición, así que lo guardamos en nuestra lista de resultados
                    alumnosFiltrados.add(a);
                }
            }
        }

        // Una vez revisados todos, devolvemos la lista llena con los aprobados
        return alumnosFiltrados;
    }
}
