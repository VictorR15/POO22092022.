
package libro;


public class Autor {
    
    private String nombreAu;
    private int edadAu;

    public Autor() {
    }

    public Autor(String nombre, int edad) {
        this.nombreAu = nombre;
        this.edadAu = edad;
    }

    public int getEdad() {
        return edadAu;
    }

    public void setEdad(int edad) {
        this.edadAu = edad;
    }

    public String getNombre() {
        return nombreAu;
    }

    public void setNombre(String nombre) {
        this.nombreAu = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombreAu + ", edad=" + edadAu + '}';
    }
    
    public void escribir(){
        
        System.out.println(this.nombreAu + "Esta escribiendo");
        
    }
   
}
