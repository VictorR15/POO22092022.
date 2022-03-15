
package ico.fes.componentes;


public class Teclado {
    
    private String marca;
    private int numeroDeTeclas;

    public Teclado() {
    }

    public Teclado(String marca, int numeroDeTeclas) {
        this.marca = marca;
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroDeTeclas=" + numeroDeTeclas + '}';
    }
    
    
}
