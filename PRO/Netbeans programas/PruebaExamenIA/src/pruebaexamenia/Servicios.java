/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaexamenia;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author migue
 */
public class Servicios {

    /**
     * 1. Lista por consola los datos de los Libros cuyo título sea
     * alfabéticamente mayor a un título dado.
     *
     * @param mat La lista completa del catálogo de la biblioteca (puede
     * contener cualquier Material).
     * @param tituloDado El título de referencia que servirá para comparar
     * alfabéticamente.
     */
    public void listadoLibrosTituloMayorDado(ArrayList<Material> mat, String tituloDado) {
        // Variables de la función: un iterador para recorrer la lista y una variable temporal 'm'
        Iterator<Material> itr = mat.iterator();
        Material m;

        // Bucle while: recorre la lista completa mientras sigan quedando materiales sin revisar
        while (itr.hasNext()) {
            m = itr.next();

            // Condición if: comprueba dos cosas a la vez de forma óptima. 
            // Primero, si el material es un Libro (polimorfismo). 
            // Segundo, si su título es alfabéticamente mayor al tituloDado (> 0).
            if (m instanceof Libro && m.getTitulo().compareTo(tituloDado) > 0) {

                // Realizamos el casting para tratar el material como Libro
                Libro l = (Libro) m;

                // Imprimimos por pantalla los datos solicitados
                System.out.println(m.getTitulo() + ", " + m.getAnioPublicacion() + ", " + l.getAutor());
            }
        }
    }

    /**
     * 2. Devuelve los Libros que tengan estrictamente más páginas que un número
     * dado.
     *
     * @param mat La lista completa del catálogo de la biblioteca.
     * @param paginasDado El número de páginas que sirve como límite para
     * filtrar.
     * @return Un ArrayList que contiene únicamente los Libros que superan ese
     * número de páginas.
     */
    public ArrayList<Libro> librosMayoresNumeroPaginasDado(ArrayList<Material> mat, int paginasDado) {
        // Variable para almacenar la nueva lista de libros que cumplen la condición
        ArrayList<Libro> librosFiltrados = new ArrayList<>();

        // Variables para iterar y almacenar temporalmente cada material
        Iterator<Material> itr = mat.iterator();
        Material m;

        // Bucle while: iteramos sobre todo el catálogo de la biblioteca
        while (itr.hasNext()) {
            m = itr.next();

            // Condición if: filtramos para asegurarnos de que el material actual es un Libro
            if (m instanceof Libro) {
                // Casting a Libro para poder acceder a sus métodos específicos
                Libro l = (Libro) m;

                // Condición if: comprobamos si el libro supera las páginas dadas
                if (l.getNumeroPaginas() > paginasDado) {
                    // Si cumple la regla, lo añadimos a nuestra lista de resultados
                    librosFiltrados.add(l);
                }
            }
        }

        // Devolvemos la lista llena con los libros filtrados
        return librosFiltrados;
    }

    /**
     * 3. Devuelve aquellas Revistas que hayan sido publicadas en un año
     * superior a un año dado.
     *
     * @param mat La lista completa del catálogo de la biblioteca.
     * @param anioDado El año de publicación que sirve como límite de corte.
     * @return Un ArrayList que contiene únicamente las Revistas publicadas
     * después de dicho año.
     */
    public ArrayList<Revista> revistasAnioSuperiorDado(ArrayList<Material> mat, int anioDado) {
        // Variable donde guardaremos y acumularemos las revistas que cumplan la regla
        ArrayList<Revista> revistasFiltradas = new ArrayList<>();

        // Iterador y variable de apoyo para recorrer el catálogo
        Iterator<Material> itr = mat.iterator();
        Material m;

        // Bucle while: analiza todos los materiales de la colección uno a uno
        while (itr.hasNext()) {
            m = itr.next();

            // Condición if: comprobamos mediante polimorfismo si el objeto es una Revista
            if (m instanceof Revista) {
                // Realizamos el casting a Revista
                Revista r = (Revista) m;

                // Condición if: verificamos si el año de la revista es posterior al año dado
                if (r.getAnioPublicacion() > anioDado) {
                    // La revista cumple la condición, así que la guardamos
                    revistasFiltradas.add(r);
                }
            }
        }

        // Finaliza el bucle y devolvemos la lista con las revistas encontradas
        return revistasFiltradas;
    }
}
}
