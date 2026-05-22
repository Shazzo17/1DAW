/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg090426clase;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author daw1-25
 */
public class Servicios {

    //Función que me dado un determinado alumno,me devuelva los profesores que tiene asociados ese alumno.
    public ArrayList<Profesores> profesoresAlumnoDado(Alumnos a, ArrayList<DarClase> dc, ArrayList<Profesores> pro) {
        ArrayList<Profesores> profesoresDelAlumno = new ArrayList<>(); // profesoresDelAlumno genera un ArrayList de profesores que cumple las exigencias de la funcion.
        Iterator<DarClase> itr = dc.iterator(); // irr genera un iterador para recorer la lista de Dar clase.
        Iterator<Profesores> itr2; // itr2 genera un iterador para recorer la lista de Profesores. 
        DarClase d; // d me fija cada uno de los elementos que estan en la lista de Dar Clase.
        Profesores p; // p me fija cada uno de los elementos que estan en la lista de Profesores.
        while (itr.hasNext()) {
            d = itr.next();
            if (a.getDni().compareTo(d.getDniAlumno()) == 0) {
                itr2 = pro.iterator();
                while (itr2.hasNext()) {
                    p = itr2.next();
                    if (d.getDniProfesor().compareTo(p.getDni()) == 0) {
                        profesoresDelAlumno.add(p);
                    }
                }
            }
        }
        return profesoresDelAlumno;
    }

    //Dado un profesor díganme la cantidad de alumnos que tiene asignados este profesor.
    public int numeroAlumnosProfesorDadoBien(Profesores p, ArrayList<DarClase> dc) {
        int numeroAlumnos = 0;
        Iterator<DarClase> itr = dc.iterator();
        DarClase d;
        while (itr.hasNext()) {
            d = itr.next();
            if (p.getDni().compareTo(d.getDniProfesor()) == 0) {
                numeroAlumnos++;
            }
        }
        return numeroAlumnos;
    }

    public int numeroAlumnosProfesorDado(Profesores p, ArrayList<DarClase> dc, ArrayList<Alumnos> al) {
        int numeroAlumnos = 0;
        Iterator<DarClase> itr = dc.iterator();
        Iterator<Alumnos> itr2;
        DarClase d;
        Alumnos a;
        while (itr.hasNext()) {
            d = itr.next();
            if (p.getDni().compareTo(d.getDniProfesor()) == 0) {
                itr2 = al.iterator();
                while (itr2.hasNext()) {
                    a = itr2.next();
                    if (a.getDni().compareTo(d.getDniAlumno()) == 0) {
                        numeroAlumnos++;
                    }
                }
            }
        }
        return numeroAlumnos;
    }

    //Realizar una función que me devuelva aquellos profesores que no tienen asignados ningún alumno.
    public ArrayList<Profesores> profesoresSinAlumnos(ArrayList<DarClase> arrayListDarClase, ArrayList<Profesores> arrayListProfesores) {
        ArrayList<Profesores> profesoresFiltrados = new ArrayList<>();
        Iterator<DarClase> iteradorDarClase = arrayListDarClase.iterator();
        Iterator<Profesores> iteradorProfesores = arrayListProfesores.iterator();
        DarClase fijarDarClase;
        Profesores fijarProfesores;
        while (iteradorProfesores.hasNext()) {
            fijarProfesores = iteradorProfesores.next();
            fijarDarClase = iteradorDarClase.next();
            while (iteradorDarClase.hasNext() && fijarDarClase.getDniProfesor().compareTo(fijarProfesores.getDni()) != 0) {
                fijarDarClase = iteradorDarClase.next();
            }
            if (!iteradorDarClase.hasNext()) {
                profesoresFiltrados.add(fijarProfesores);
            }
        }
        return profesoresFiltrados;
    }

    public ArrayList<Profesores> profesoresSinAlumnosBien(ArrayList<DarClase> listaDarClase, ArrayList<Profesores> listaProfesores) {
        ArrayList<Profesores> listaProfesoresFiltrados = new ArrayList<>();
        Iterator<DarClase> iteradorDarClase;
        Iterator<Profesores> iteradorProfesores = listaProfesores.iterator();
        DarClase fijarDarClase;
        Profesores fijarProfesores;
        boolean tieneAlumnos;
        while (iteradorProfesores.hasNext()) {
            fijarProfesores = iteradorProfesores.next();
            tieneAlumnos = false;
            iteradorDarClase = listaDarClase.iterator();
            while (iteradorDarClase.hasNext() && !tieneAlumnos) {
                fijarDarClase = iteradorDarClase.next();
                if (fijarDarClase.getDniProfesor().compareTo(fijarProfesores.getDni()) == 0) {
                    tieneAlumnos = true;
                }
            }
            if (!tieneAlumnos) {
                listaProfesoresFiltrados.add(fijarProfesores);
            }
        }
        return listaProfesoresFiltrados;
    }

    /**
     * Reto 1:
     *
     * Realizar una función que determine si un alumno en concreto recibe clases
     * de un profesor en concreto.
     */
    public boolean seConocen(Alumnos alumnoDado, Profesores profesorDado, ArrayList<DarClase> listaDarClase) {
        boolean coinciden = false;
        Iterator<DarClase> iteradorDarClase = listaDarClase.iterator();
        DarClase fijarDarClase;
        while (iteradorDarClase.hasNext() && !coinciden) {
            fijarDarClase = iteradorDarClase.next();
            if (alumnoDado.getDni().compareTo(fijarDarClase.getDniAlumno()) == 0 && profesorDado.getDni().compareTo(fijarDarClase.getDniProfesor()) == 0) {
                coinciden = true;
            }
        }
        return coinciden;
    }

    /**
     * Reto 2:
     *
     * Realizar una función que determine qué alumnos de la academia no están
     * matriculados en ninguna clase.
     */
    public ArrayList<Alumnos> alumnosSinClase(ArrayList<DarClase> listaDarClase, ArrayList<Alumnos> listaAlumnos) {
        boolean encontrado;
        ArrayList<Alumnos> alumnosFiltrados = new ArrayList<>();
        Iterator<DarClase> iteradorDarClase;
        Iterator<Alumnos> iteradorAlumnos = listaAlumnos.iterator();
        DarClase fijarDarClase;
        Alumnos fijarAlumnos;
        while (iteradorAlumnos.hasNext()) {
            encontrado = false;
            fijarAlumnos = iteradorAlumnos.next();
            iteradorDarClase = listaDarClase.iterator();
            while (iteradorDarClase.hasNext() && !encontrado) {
                fijarDarClase = iteradorDarClase.next();
                if (fijarAlumnos.getDni().compareTo(fijarDarClase.getDniAlumno()) == 0) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                alumnosFiltrados.add(fijarAlumnos);
            }
        }
        return alumnosFiltrados;
    }

    /**
     * Reto 3:
     *
     * Realizar una función que determine y devuelva cuál es el profesor que
     * tiene la mayor cantidad de alumnos totales asignados en la academia.
     */
    public Profesores profesorConMasAlumnos(ArrayList<Profesores> listaProfesores, ArrayList<DarClase> listaDarClase) {
        int cantidadMaxima = 0;
        int cantidadAlumnos;
        Iterator<DarClase> iteradorDarClase;
        Iterator<Profesores> iteradorProfesores = listaProfesores.iterator();
        DarClase fijarDarClase;
        Profesores fijarProfesor, profesorFiltrado = null;
        while (iteradorProfesores.hasNext()) {
            cantidadAlumnos = 0;
            fijarProfesor = iteradorProfesores.next();
            iteradorDarClase = listaDarClase.iterator();
            while (iteradorDarClase.hasNext()) {
                fijarDarClase = iteradorDarClase.next();
                if (fijarProfesor.getDni().compareTo(fijarDarClase.getDniProfesor()) == 0) {
                    cantidadAlumnos++;
                }
            }
            if (cantidadMaxima < cantidadAlumnos) {
                cantidadMaxima = cantidadAlumnos;
                profesorFiltrado = fijarProfesor;
            }
        }
        return profesorFiltrado;
    }
}
