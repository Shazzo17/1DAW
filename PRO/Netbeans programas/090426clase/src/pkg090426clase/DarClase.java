/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg090426clase;

/**
 *
 * @author daw1-25
 */
public class DarClase {

    private String nombreClase;
    private String dniAlumno;
    private String dniProfesor;

    public DarClase(String nombreClase, String dniAlumno, String dniProfesor) {
        this.nombreClase = nombreClase;
        this.dniAlumno = dniAlumno;
        this.dniProfesor = dniProfesor;
    }

    public DarClase() {
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public String getDniProfesor() {
        return dniProfesor;
    }

    public void setDniProfesor(String dniProfesor) {
        this.dniProfesor = dniProfesor;
    }

    @Override
    public String toString() {
        return "DarClase{" + "nombreClase=" + nombreClase + ", dniAlumno=" + dniAlumno + ", dniProfesor=" + dniProfesor + '}';
    }

}
