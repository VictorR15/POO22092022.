
package pelicula;


public class Actor {
    
    private String nombreAc;
    private String edadAc;

    public Actor() {
    }

    public Actor(String nombre, String edad) {
        this.nombreAc = nombre;
        this.edadAc = edad;
    }

    public String getEdad() {
        return edadAc;
    }

    public void setEdad(String edad) {
        this.edadAc = edad;
    }

    public String getNombre() {
        return nombreAc;
    }

    public void setNombre(String nombre) {
        this.nombreAc = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombreAc + ", edad=" + edadAc + '}';
    }
    
    
    
}
