/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesoresnoencontradosenbd;

/**
 *
 * @author daw1-25
 */
public class TablaDiccionario {

    private String palabra;
    private String concepto1;
    private String concepto2;
    private String concepto3;

    public TablaDiccionario(String palabra, String concepto1, String concepto2, String concepto3) {
        this.palabra = palabra;
        this.concepto1 = concepto1;
        this.concepto2 = concepto2;
        this.concepto3 = concepto3;
    }

    public TablaDiccionario() {
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getConcepto1() {
        return concepto1;
    }

    public void setConcepto1(String concepto1) {
        this.concepto1 = concepto1;
    }

    public String getConcepto2() {
        return concepto2;
    }

    public void setConcepto2(String concepto2) {
        this.concepto2 = concepto2;
    }

    public String getConcepto3() {
        return concepto3;
    }

    public void setConcepto3(String concepto3) {
        this.concepto3 = concepto3;
    }

    @Override
    public String toString() {
        return "TablaDiccionario{" + "palabra=" + palabra + ", concepto1=" + concepto1 + ", concepto2=" + concepto2 + ", concepto3=" + concepto3 + '}';
    }

}
