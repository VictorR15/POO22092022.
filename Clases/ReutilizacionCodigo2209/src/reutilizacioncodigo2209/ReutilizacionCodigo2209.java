
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.poliformismo.Animal;
import ico.fes.herencia.poliformismo.Perro;
import javax.swing.JFrame;


public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre = new String("José José");
        System.out.println( nombre );
        System.out.println( nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        
        //Crear una ventana 
        
        /*JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);*/
        
        Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
        miCompu.getCpu().setMarca("AMD");
        System.out.println( miCompu );
        
        //ejercicio establecer un mouse     Marca: logitech     Tipo: optico
        miCompu.setRaton(new Mouse("Logitech", "Optico"));
        System.out.println( miCompu );
        
        var compu2 = new Computadora("Apple", "MaBook Pro", new Monitor("Toshiba",14.3f), new Mouse("Acteck","Optico"), new Teclado("Apple",101), new Procesador("M1",3.4f));
        
        System.out.println( compu2 );
        
        //Ejercicio     Mouse: Apple    Tipo: touch
        
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        System.out.println( compu2 );
        
        //Para cambiar los valonres en compocicion se necesita usar .get y despues .set como esta en el ejemplo de arriba
        
        System.out.println("-----------------------------------------------");
        
        Alumno alu1 = new Alumno();
        alu1.setNombre("José");
        System.out.println(alu1);
        
        Alumno alu2 = new Alumno("23156132","ICO","Jose Perez",19);
        System.out.println(alu2);
               
        alu1.setNumeroCuenta("45242245");
        System.out.println(alu1);
        
        //Para cambiar los valoren en herencia se necesita usar solo .set como en el ejemplo de arriba
        
        
        System.out.println("------------------ Composicion y herenecia en la misma clase---------------");
        
        Servidor server = new Servidor();
        System.out.println(server);
        
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        
        server.setMarca("HP");
        System.out.println(server);
        
        server.setRaton(new Mouse("LG", "Optico"));
        System.out.println(server);
        
        server.getRaton().setMarca("Logitech");
        System.out.println(server);
        
        
        System.out.println("----------Ejemplo polimorfismo------------");
        Perro dog = new Perro("Bulldog", "5 estrellas", 4);
        Animal animal1 = new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();
        
        
        
    }
    
    
}
