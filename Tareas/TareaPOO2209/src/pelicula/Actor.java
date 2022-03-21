
package pelicula;


public class Actor {
    
     private String nombreAc;
      private int edadAc;

    public Actor() {
    }

    public Actor(String nombreAc, int edadAc) {
        this.nombreAc = nombreAc;
        this.edadAc = edadAc;
    }

    public int getEdadAc() {
        return edadAc;
    }

    public void setEdadAc(int edadAc) {
        this.edadAc = edadAc;
    }

    public String getNombreAc() {
        return nombreAc;
    }

    public void setNombreAc(String nombreAc) {
        this.nombreAc = nombreAc;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombreAc=" + nombreAc + ", edadAc=" + edadAc + '}';
    }
      
      public void actuar(){
        
        System.out.println(this.nombreAc + "Esta actuando");
        
    }

    
    
    
    
}
