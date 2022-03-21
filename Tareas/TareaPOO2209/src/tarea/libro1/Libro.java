
package tarea.libro1;

import java.awt.Color;


public class Libro {
    
    //Atributos
    
    private String titulo;
    private String autorJefe;
    private String editorialjose;
    private int numeroDePaginas;
    private Color color;

    public Libro() {
    }

    public Libro(String titulo, String autor, String editorial, int numeroDePaginas, Color color) {
        this.titulo = titulo;
        this.autorJefe = autor;
        this.editorialjose = editorial;
        this.numeroDePaginas = numeroDePaginas;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autorJefe;
    }

    public void setAutor(String autor) {
        this.autorJefe = autor;
    }

    public String getEditorial() {
        return editorialjose;
    }

    public void setEditorial(String editorial) {
        this.editorialjose = editorial;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autorJefe + ", editorial=" + editorialjose + ", numeroDePaginas=" + numeroDePaginas + ", color=" + color + '}';
    }

    
    
    
    
    
    
}
