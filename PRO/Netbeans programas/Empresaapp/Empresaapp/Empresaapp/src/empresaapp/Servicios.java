/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaapp;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mesteso
 */
public class Servicios {

    /**
     * 1. Dada la aplicación de Empresa. Se pide realizar una función que me
     * liste los salarios del personal fijo cuyos dnis sean mayores a uno dado.
     *
     * * @param per La lista completa del personal de la empresa.
     * @param dniDado El DNI de referencia con el que vamos a comparar.
     */
    public void listarPersonalFijoDniMayorDado(ArrayList<Personal> per, String dniDado) {
        // Creamos un iterador para recorrer la lista de personal uno a uno
        Iterator<Personal> itr = per.iterator();
        // Variable para guardar temporalmente al trabajador que sacamos de la lista
        Personal p;

        // Bucle que gira mientras queden trabajadores en la lista
        while (itr.hasNext()) {
            p = itr.next();

            // Comprobamos si el trabajador es fijo Y si su DNI es alfabéticamente mayor al dado
            if (p instanceof Personal_fijo && p.getDni().compareTo(dniDado) > 0) {
                // Casting: tratamos a p como personal fijo para poder calcular su salario
                Personal_fijo pe = (Personal_fijo) p;

                // Imprimimos los datos que pide el enunciado
                System.out.println(p.getDni() + ", " + p.getNombre() + ", " + p.getApellido() + ", " + pe.calcular_salario());
            }
        }
    }

    /**
     * 3. Dada la aplicación de Empresa. Se pide realizar una función, que
     * devuelva aquel personal a comisión que tiene una cantidad de clientes
     * superior a un valor dado.
     *
     * * @param per La lista completa del personal de la empresa.
     * @param numClientesDado La cantidad mínima de clientes que deben superar.
     * @return Un ArrayList que contiene solo a los trabajadores que cumplen la
     * condición.
     */
    public ArrayList<Personal> personalComisionClientesMayorDado(ArrayList<Personal> per, int numClientesDado) {

        // Creamos una lista vacía para ir guardando a los trabajadores que cumplan la regla
        ArrayList<Personal> personalFiltrado = new ArrayList<>();

        // Creamos el iterador para recorrer la lista original
        Iterator<Personal> itr = per.iterator();
        // Variable temporal para guardar al trabajador actual
        Personal p;

        // Bucle que recorre a todos los empleados
        while (itr.hasNext()) {
            p = itr.next();

            // Comprobamos si el trabajador pertenece a la clase de personal a comisión
            if (p instanceof Personal_comision) {
                // Hacemos casting para acceder a los datos exclusivos de los comisionistas
                Personal_comision pc = (Personal_comision) p;

                // Comparamos si su número de clientes es estrictamente mayor al dado
                // (CORREGIDO: Usamos el getter de número de clientes, no el monto)
                if (pc.getNumeroclientes() > numClientesDado) {

                    // Si cumple, lo añadimos a nuestra lista de resultados
                    personalFiltrado.add(p);
                }
            }
        }

        // Devolvemos la lista llena con los empleados filtrados
        return personalFiltrado;
    }
}
}
