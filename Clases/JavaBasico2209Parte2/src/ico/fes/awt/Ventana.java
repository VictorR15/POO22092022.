package ico.fes.awt;

import java.awt.Frame;
import java.awt.HeadlessException;

public class Ventana extends Frame {

    private String titulo;

    public Ventana() throws HeadlessException {
    }

    public Ventana(String titulo) throws HeadlessException {
        super(titulo);
        this.setSize(400, 600);
        this.setVisible(true);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Ventana{" + "titulo=" + titulo + '}';
    }

    
    
    
    
}
