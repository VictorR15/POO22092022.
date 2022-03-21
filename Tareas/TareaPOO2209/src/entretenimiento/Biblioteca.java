package entretenimiento;

import libro.Autor;
import libro.Editorial;
import pelicula.Actor;
import pelicula.Director;
import pelicula.Productara;


public class Biblioteca {

     private String tipoDeEntretenimiento;
     private Autor autor;
     private Editorial editorial;
     private Actor actor;
     private Director direccion;
     private Productara produccion;

    public Biblioteca() {
    
        autor = new Autor();
        editorial = new Editorial();
        actor = new Actor();
        direccion = new Director();
        produccion = new Productara();
        
    }

    public Biblioteca(String tipoDeEntretenimiento, Autor autor, Editorial Editorial, Actor actor, Director direccion, Productara produccion) {
        this.tipoDeEntretenimiento = tipoDeEntretenimiento;
        this.autor = autor;
        this.editorial = Editorial;
        this.actor = actor;
        this.direccion = direccion;
        this.produccion = produccion;
    }

    public String getTipoDeEntretenimiento() {
        return tipoDeEntretenimiento;
    }

    public void setTipoDeEntretenimiento(String tipoDeEntretenimiento) {
        this.tipoDeEntretenimiento = tipoDeEntretenimiento;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getDitorial() {
        return editorial;
    }

    public void setDitorial(Editorial ditorial) {
        this.editorial = ditorial;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDireccion() {
        return direccion;
    }

    public void setDireccion(Director direccion) {
        this.direccion = direccion;
    }

    public Productara getProduccion() {
        return produccion;
    }

    public void setProduccion(Productara produccion) {
        this.produccion = produccion;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "tipoDeEntretenimiento=" + tipoDeEntretenimiento + ", autor=" + autor + ", ditorial=" + editorial + ", actor=" + actor + ", direccion=" + direccion + ", produccion=" + produccion + '}';
    }

    
     public void vender(){
         
         System.out.println(this.tipoDeEntretenimiento + "Fue vendido");
     }
     

    
    

}
