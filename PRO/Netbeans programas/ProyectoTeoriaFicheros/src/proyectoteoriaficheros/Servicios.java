/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoteoriaficheros;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author DAW1-25
 */
public class Servicios {
    // Dado un fichero de Personas, realizar una funcion que me devuelva, aquella persona mas vieja.

    public Personas personaMasVieja(BufferedReader bf) {
        String[] ar;
        String linea;
        int mayor = 0;
        int edadActual = 0;
        Personas personaMayor = null;
        try {
            while ((linea = bf.readLine()) != null) {
                ar = linea.split(",");
                edadActual = Integer.parseInt(ar[3]);
                if (edadActual > mayor) {
                    mayor = edadActual;
                    personaMayor = new Personas(ar[0], ar[1], ar[2], edadActual);
                }

            }
        } catch (Exception e) {
            System.out.println("Ha habido un error de procesamiento,intentalo de nuevo.");
        }
        return personaMayor;
    }

    /**
     * Dado un fichero de Personas, se pide realizar una función que me ordene
     * las personas por la edad. Los atributos de las Personas, son las
     * definidas en la clase Personas. Almacenar el fichero en un arraylist y
     * ahí ordenarlo.
     */
    public TreeSet ordenarPersonasPorEdad(BufferedReader bf) {
        TreeSet<Personas> listaPersonas = new TreeSet<>(Comparator.comparing(Personas::getEdad));
        String[] ar;
        String linea;
        int edadActual;
        Personas crearPersona;
        try {
            while ((linea = bf.readLine()) != null) {
                ar = linea.split(",");
                edadActual = Integer.parseInt(ar[3]);
                crearPersona = new Personas(ar[0], ar[1], ar[2], edadActual);
                listaPersonas.add(crearPersona);
            }
        } catch (Exception e) {
        }
        return listaPersonas;
    }

    /**
     * Quiero que dado un fichero de personas realizar una funcion que me
     * devuelva todas aquellas personas que estan en lineas, o en filas impares.
     * Devuelve un treeset y el campo de comparacion son los apellidos.
     */
    public TreeSet<Personas> personasEnFilasImpares(BufferedReader bf) {
        TreeSet<Personas> listaPersonasFiltradas = new TreeSet<>(Comparator.comparing(Personas::getApellido));
        String[] ar;
        String linea;
        int filaActual = 0;
        Personas crearPersona;
        try {
            while ((linea = bf.readLine()) != null) {
                filaActual++;
                if (filaActual % 2 != 0) {
                    ar = linea.split(",");
                    crearPersona = new Personas(ar[0], ar[1], ar[2], Integer.parseInt(ar[3]));
                    listaPersonasFiltradas.add(crearPersona);
                }
            }
        } catch (Exception e) {
        }
        return listaPersonasFiltradas;
    }

    /**
     * Dadas las personas que hay,quiero que me devuelvas las personas cuyo
     * nombre sea compuesto.
     */
    public ArrayList<Personas> personasConNombreCompuesto(BufferedReader bf) {
        ArrayList<Personas> listaPersonasFiltradas = new ArrayList<>();
        String[] ar;
        String linea;
        Personas crearPersona;
        try {
            while ((linea = bf.readLine()) != null) {
                ar = linea.split(",");
                if (ar[1].contains(" ")) {
                    crearPersona = new Personas(ar[0], ar[1], ar[2], Integer.parseInt(ar[3]));
                    listaPersonasFiltradas.add(crearPersona);
                }
            }
        } catch (Exception e) {
        }
        return listaPersonasFiltradas;
    }

    /**
     * Hacer que este problema devuelva otro fichero
     *
     * @param bf
     * @return
     */
    public TreeSet ordenarPersonasPorEdad2(BufferedReader bf) {
        TreeSet<Personas> listaPersonas = new TreeSet<>(Comparator.comparing(Personas::getEdad));
        String[] ar;
        String linea;
        int edadActual;
        Personas crearPersona;
        try {
            while ((linea = bf.readLine()) != null) {
                ar = linea.split(",");
                edadActual = Integer.parseInt(ar[3]);
                crearPersona = new Personas(ar[0], ar[1], ar[2], edadActual);
                listaPersonas.add(crearPersona);
            }
        } catch (Exception e) {
        }
        return listaPersonas;
    }

}
