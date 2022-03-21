package entretenimiento;

import libro.Autor;
import libro.Editorial;
import pelicula.Actor;
import pelicula.Director;
import pelicula.Productara;


public class Biblioteca {

    private Autor nombreAutor;
    private Editorial nombreEmpresa;
    private Actor nombreActor;
    private Director direccion;
    private Productara produccion;

    public Biblioteca() {
    
        nombreAutor = new Autor();
        nombreEmpresa = new Editorial();
        nombreActor = new Actor();
        direccion = new Director();
        produccion = new Productara();
        
    }

    public Biblioteca(Autor nombre, Editorial nombreEmpresa, Actor nombreActor, Director direccion, Productara produccion) {
        this.nombreAutor = nombre;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreActor = nombreActor;
        this.direccion = direccion;
        this.produccion = produccion;
    }

    public Productara getProduccion() {
        return produccion;
    }

    public void setProduccion(Productara produccion) {
        this.produccion = produccion;
    }

    public Autor getNombre() {
        return nombreAutor;
    }

    public void setNombre(Autor nombre) {
        this.nombreAutor = nombre;
    }

    public Editorial getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(Editorial nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Actor getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(Actor nombreActor) {
        this.nombreActor = nombreActor;
    }

    public Director getDireccion() {
        return direccion;
    }

    public void setDireccion(Director direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombreAutor + ", nombreEmpresa=" + nombreEmpresa + ", nombreActor=" + nombreActor + ", direccion=" + direccion + ", produccion=" + produccion + '}';
    }

    
    
    

    
    
    

}
