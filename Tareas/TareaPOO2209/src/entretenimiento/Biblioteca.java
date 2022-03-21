package entretenimiento;

import libro.Autor;
import libro.Editorial;



public class Biblioteca {

      private String tipoDeEntretenimiento;
      private Autor autor;
     private Editorial editorial;

    public Biblioteca() {
    
        autor = new Autor();
        editorial = new Editorial();
        
    }

    public Biblioteca(String tipoDeEntretenimiento, Autor autor, Editorial editorial) {
        this.tipoDeEntretenimiento = tipoDeEntretenimiento;
        this.autor = autor;
        this.editorial = editorial;
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

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "tipoDeEntretenimiento=" + tipoDeEntretenimiento + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
     

    public void vender(){
         
         System.out.println(this.tipoDeEntretenimiento + "Fue vendido");
     }
    

}
