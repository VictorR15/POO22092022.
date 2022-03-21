
package pelicula;


public class Productara {
    
    private String nombreDeProductora;
    private String dueñoDeProductora;
    
    public Productara() {
    }

    public Productara(String nombreDeProductora, String dueñoDeProductora) {
        this.nombreDeProductora = nombreDeProductora;
        this.dueñoDeProductora = dueñoDeProductora;
    }

    public String getDueñoDeProductora() {
        return dueñoDeProductora;
    }

    public void setDueñoDeProductora(String dueñoDeProductora) {
        this.dueñoDeProductora = dueñoDeProductora;
    }

    public String getNombreDeProductora() {
        return nombreDeProductora;
    }

    public void setNombreDeProductora(String nombreDeProductora) {
        this.nombreDeProductora = nombreDeProductora;
    }

    @Override
    public String toString() {
        return "Productara{" + "nombreDeProductora=" + nombreDeProductora + ", due\u00f1oDeProductora=" + dueñoDeProductora + '}';
    }
    
    public void grabando(){
        
        System.out.println(this.nombreDeProductora + "Esta grabando");
        
    }
    
}
