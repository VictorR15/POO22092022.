
package conceptosbasicos;

import Ico.fes.Alumno;
import Ico.fes.Automivil;
import Ico.fes.Persona;
import Ico.fes.Silla;
import java.awt.Color;


public class ConceptosBasicos {

    
    public static void main(String[] args) {
        
        System.out.println("Hola de nuevo");
        
        Silla s1 = new Silla();
        System.out.println(s1);  //Por defecto se invoca toString()
        System.out.println(s1.toString());
        
        
        Automivil miBocho = new Automivil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
        
        Automivil miMustang = new Automivil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);
    
        Automivil miAkura = new Automivil("Akura", "NSX", 2013, Color.GRAY);
        System.out.println(miAkura);
        
        Persona per1 = new Persona();
        //per1.edad=20; no se permite por seguridad
        per1.setEdad(22);
        System.out.println(per1);
        
        Alumno al = new Alumno();
        al.setNombre("Jose");
        al.setNumeroCuenta("31901160-1");
        System.out.println(al);
    }
    
}
