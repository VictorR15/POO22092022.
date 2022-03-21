package tareapoo2209;

import entretenimiento.Biblioteca;
import entretenimiento.Blockbuster;

public class TareaPOO2209 {
    
    public static void main(String[] args) {

        /*Libro miLibro1 = new Libro("Quiubole", "Jordi Rosado", "My House", 200, Color.orange);
        System.out.println(miLibro1);
        
        Libro libro2 = new Libro("Don Quijote", "De la Mancha", "Porrua", 250, Color.white);
        System.out.println(libro2);*/
        
        //LIBRO
        
        Biblioteca entre1 = new Biblioteca();
        entre1.setTipoDeEntretenimiento("Libro");
        entre1.getAutor().setNombre("Octavio Paz");
        entre1.getAutor().setEdad(84);
        entre1.getEditorial().setNombreEmpresa("Fundacion Octavio Paz");
        entre1.getEditorial().setLibrosImpresos(8);
        
        
        System.out.println(entre1);
        
        //PELICULA
        
        Blockbuster entre2 = new Blockbuster();
        entre2.setTipodeEntre("Pelicula");
        entre2.getActor().setNombreAc("Jose");
        entre2.getActor().setEdadAc(30);
        entre2.getDirector().setNombre("Pepito");
        entre2.getDirector().setEdad(50);
        entre2.getProductora().setNombreDeProductora("El milaneso");
        entre2.getProductora().setDueñoDeProductora("Papi AMLO");
        System.out.println(entre2);
        
        
        
        
    }
    
}
