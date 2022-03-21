
package pelicula;


public class Director {
    
    private String nombreDi;
    private int edadDi;

    public Director() {
    }

    public Director(String nombre, int edad) {
        this.nombreDi = nombre;
        this.edadDi = edad;
    }

    public int getEdad() {
        return edadDi;
    }

    public void setEdad(int edad) {
        this.edadDi = edad;
    }

    public String getNombre() {
        return nombreDi;
    }

    public void setNombre(String nombre) {
        this.nombreDi = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombreDi + ", edad=" + edadDi + '}';
    }
    
    
    
}
