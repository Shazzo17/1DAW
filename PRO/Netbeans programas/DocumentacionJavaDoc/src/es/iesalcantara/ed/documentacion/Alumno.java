/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesalcantara.ed.documentacion;

/**
 * Un programa simple con el que puedes saber el nombre, la nota y si un alumno esta aprobado o no.
 * @author daw1-25
 * @version 1.0
 */
public class Alumno {
    private String nombre;
    private double nota;
    
        /**
         * Un constructor con el nombre y la nota del alumno.
         * @param nombre El nombre del alumno.
         * @param nota La nota del alumno.
         */
        public Alumno(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
            }
        
        /**
         * Devuelve el nombre del alumno.
         * @return El nombre del alumno.
         */
        public String obtenerNombre() {
            return nombre;
            }

        /**
         * Devuelve la nota del alumno.
         * @return La nota del alumno.
         */
        public double obtenerNota() {
            return nota;
            }
        
        /**
         * Comprueba si el alumno esta aprobado.
         * Se considera aprobado con una notia igual o superior a 5.
         * @return true si la nota es >=5, false si no.
         */
        public boolean estaAprobado() { 
            return nota >= 5;
            }
}

