/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaapp;

/**
 *
 * @author migue
 */
public class Serviciosexamenmio2ev {

    //EJERCICIO 1 MAL
    // ERROR 1: Faltan los comentarios JavaDoc de lo que entra y lo que sale.
    // ERROR 2: No pasaste el DNI por el paréntesis (parámetro de entrada).
    public void listarSalariosFijosDniMayor(ArrayList<Empleado> emp) {

        // Variables locales
        String dniDado; // ERROR 3: Al no pasarlo por el paréntesis, lo creaste aquí vacío.
        Iterator<Empleado> it = emp.iterator();
        Empleado e;

        // Bucle para recorrer los empleados
        while (it.hasNext()) {
            e = it.next();

            // Comprobamos si es fijo
            if (e instanceof Empleadofijo) {
                Empleadofijo ef = (Empleadofijo) e;

                // ERROR 4: Comparaste Strings con el símbolo mayor que (>).
                if (ef.getDni() > dniDado) {
                    System.out.println(ef.getDni() + " " + ef.getNombre() + " " + ef.getApellido() + " " + ef.getSueldofijo());
                }
            }
        }
    }

    //EJERCICIO 1 BIEN
    /**
     * Muestra por pantalla los datos de los empleados fijos cuyo DNI sea mayor
     * a uno dado.
     *
     * @param emp La lista completa de empleados de la empresa.
     * @param dniDado El DNI de referencia con el que vamos a comparar.
     * @return No devuelve nada (void), imprime los resultados directamente por
     * consola.
     */
    public void listarSalariosFijosDniMayor(ArrayList<Empleado> emp, String dniDado) {

        // Iterador para recorrer la lista de empleados uno a uno
        Iterator<Empleado> it = emp.iterator();
        Empleado e;
        // Bucle que se ejecuta mientras queden empleados en la lista sin revisar
        while (it.hasNext()) {
            e = it.next();

            // Filtramos solo los empleados que tengan un contrato fijo
            if (e instanceof Empleadofijo) {
                // Hacemos el casting para poder acceder a los datos del empleado fijo
                Empleadofijo ef = (Empleadofijo) e;

                // Comparamos los Strings. Si compareTo da un número mayor que 0, 
                // significa que el DNI del empleado es mayor que el dniDado.
                if (ef.getDni().compareTo(dniDado) > 0) {
                    System.out.println(ef.getDni() + " " + ef.getNombre() + " " + ef.getApellido() + " " + ef.getSueldofijo());
                }
            }
        }
    }

    //EJERCICIO 2 MAL
    // ERROR 1: De nuevo, devolviste un solo Alumno.
    // ERROR 2: No pediste la nota por parámetro.
    public Alumno alumnosNotaSuperior(ArrayList<Persona> personas) {

        double notaDada; // ERROR 3: Variable declarada pero sin valor.

        Iterator<Persona> it = personas.iterator();

        Persona p;

        while (it.hasNext()) {
            p = it.next();

            if (p instanceof Alumno) {
                Alumno a = (Alumno) p;

                // ERROR 4: Aquí Java te daba el error "variable might not have been initialized"
                if (a.getNotaMedia() > notaDada) {
                    return a; // ERROR 5: Devolviste un solo alumno.
                }
            }
        }
        return null;
    }

    //EJERCICIO 2 BIEN
    /**
     * Filtra una lista de personas y devuelve aquellos alumnos que superen una
     * nota dada.
     *
     * @param personas La lista completa de personas (puede contener alumnos,
     * profesores, etc).
     * @param notaDada La nota de corte mínima que deben superar.
     * @return Un ArrayList con las personas (alumnos) que cumplen la condición.
     */
    public ArrayList<Persona> alumnosNotaSuperior(ArrayList<Persona> personas, double notaDada) {

        // 1. CREAMOS LA RED: Una lista vacía para ir guardando a los que aprueben
        ArrayList<Persona> alumnosAprobados = new ArrayList<>();

        // Iterador para recorrer la lista original que nos han pasado
        Iterator<Persona> it = personas.iterator();

        Personas p;
        // Bucle para analizar a todas las personas una a una
        while (it.hasNext()) {
            p = it.next();

            // Filtramos para asegurarnos de que la persona es realmente un Alumno
            if (p instanceof Alumno) {
                // Casting: tratamos a la persona como un Alumno para ver sus notas
                Alumno a = (Alumno) p;

                // Comparamos si su nota media es mayor estricta que la nota de corte
                if (a.getNotaMedia() > notaDada) {
                    // EN LUGAR DE HACER RETURN, LO METEMOS EN NUESTRA NUEVA LISTA
                    alumnosAprobados.add(a);
                }
            }
        }

        // Al terminar TODO el bucle, devolvemos la lista con los que hemos recolectado
        return alumnosAprobados;
    }

    //EJERCICIO 3 MAL
    // ERROR 1: No pusiste comentario de lo que entra ni de lo que sale.
    // ERROR 2: No devolviste una lista de empleados, devolviste solo uno (o nada).
    // ERROR 3: No pediste la cantidad por parámetro.
    public Empleado personalComisionMasClientes(ArrayList<Empleado> emp) {

        int cantidadDada; // ERROR 4: Variable sin inicializar
        Iterator<Empleado> it = emp.iterator();

        while (it.hasNext()) {
            Empleado e = it.next();

            if (e instanceof Empleadocomision) {
                Empleadocomision ec = (Empleadocomision) e;

                // ERROR 5: El mismo error por no pedir el parámetro en el paréntesis
                if (ec.getNumeroclientes() > cantidadDada) {
                    return e; // ERROR 6: Aquí solo devuelves al PRIMER empleado que encuentras y el método se apaga.
                }
            }
        }
        return null;
    }

    /**
     * Busca y devuelve una lista con el personal a comisión que supera una
     * cantidad de clientes dada.
     *
     * @param emp La lista original que contiene a todos los empleados de la
     * empresa.
     * @param cantidadDada El número de clientes que sirve como barrera para
     * filtrar.
     * @return Un ArrayList que contiene únicamente a los empleados que cumplen
     * la condición.
     */
    public ArrayList<Empleado> personalComisionMasClientes(ArrayList<Empleado> emp, int cantidadDada) {

        // 1. LA CAJA VACÍA: Creamos una nueva lista para ir acumulando los resultados
        ArrayList<Empleado> empleadosFiltrados = new ArrayList<>();

        // Iterador para recorrer la lista principal de empleados uno por uno
        Iterator<Empleado> it = emp.iterator();

        // Bucle que gira mientras sigan quedando empleados sin revisar en la lista original
        while (it.hasNext()) {
            Empleado e = it.next();

            // Filtramos primero para asegurarnos de que es un empleado a comisión
            if (e instanceof Empleadocomision) {
                // Casting: tratamos al empleado genérico como uno de comisión para ver sus clientes
                Empleadocomision ec = (Empleadocomision) e;

                // Comparamos si sus clientes superan el número que nos han pasado por parámetro
                if (ec.getNumeroclientes() > cantidadDada) {

                    // ACUMULAMOS: En vez de hacer un return y cortar el programa, lo guardamos en nuestra caja
                    empleadosFiltrados.add(ec);
                }
            }
        }

        // Cuando el bucle termina y hemos revisado a todos, devolvemos la caja con los resultados
        return empleadosFiltrados;
    }
}
