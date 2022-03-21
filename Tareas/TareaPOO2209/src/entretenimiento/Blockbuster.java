
package entretenimiento;

import pelicula.Actor;
import pelicula.Director;
import pelicula.Productara;


public class Blockbuster {
    
    private String tipodeEntre;
    private Actor actor;
    private Director director;
    private Productara productora;

    public Blockbuster() {
    
        actor = new Actor();
        director = new Director();
        productora = new Productara();
        
    }

    public Blockbuster(String tipodeEntre, Actor actor, Director director, Productara productora) {
        this.tipodeEntre = tipodeEntre;
        this.actor = actor;
        this.director = director;
        this.productora = productora;
    }

    public Productara getProductora() {
        return productora;
    }

    public void setProductora(Productara productora) {
        this.productora = productora;
    }

    public String getTipodeEntre() {
        return tipodeEntre;
    }

    public void setTipodeEntre(String tipodeEntre) {
        this.tipodeEntre = tipodeEntre;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "tipodeEntre=" + tipodeEntre + ", actor=" + actor + ", director=" + director + ", productora=" + productora + '}';
    }
    
    
    
}
