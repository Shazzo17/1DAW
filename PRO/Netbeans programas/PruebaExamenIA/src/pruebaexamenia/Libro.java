/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaexamenia;

/**
 *
 * @author migue
 */
public class Libro extends Material {

    private int numeroPaginas;
    private String autor;

    public Libro(String titulo, int anioPublicacion, int numeroPaginas, String autor) {
        super(titulo, anioPublicacion); // Llama al constructor del padre
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
