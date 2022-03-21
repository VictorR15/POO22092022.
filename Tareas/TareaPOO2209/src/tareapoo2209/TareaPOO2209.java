package tareapoo2209;

import entretenimiento.Biblioteca;

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
        entre1.getDitorial().setLibrosImpresos(8);
        entre1.getDitorial().setNombreEmpresa("Fundacion Octavio Paz");
        
        System.out.println(entre1);
        
        //PELICULA
        
        Biblioteca entre2 = new Biblioteca();
        entre2.setTipoDeEntretenimiento("Pelicula");
        entre2.getActor().setNombreAc("Jose");
        entre2.getActor().setEdadAc(30);
        entre2.getDireccion().setNombre("Pepe");
        entre2.getDireccion().setEdad(50);
        entre2.getProduccion().setNombreDeProductora("Aztelevi");
        entre2.getProduccion().setDueñoDeProductora("Papi AMLO");
        System.out.println(entre2);
        
        
        
    }
    
}
