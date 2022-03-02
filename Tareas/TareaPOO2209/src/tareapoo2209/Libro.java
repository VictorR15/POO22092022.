
package tareapoo2209;

import java.awt.Color;


public class Libro {
    
    //Atributos
    
    private String titulo;
    private String autor;
    private String editorial;
    private int numeroDePaginas;
    private Color color;

    public Libro() {
    }

    public Libro(String titulo, String autor, String editorial, int numeroDePaginas, Color color) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
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
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", numeroDePaginas=" + numeroDePaginas + ", color=" + color + '}';
    }

    
    
    
    
    
    
}
