
package javabasico2209;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Javabasico2209 {

   
    public static void main(String[] args) {
        
        int edad = 20;
        System.out.println("Edad = "+edad);
        Integer edad2 = new Integer(22);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println("---------------------");
        
        //Consvertir String a entero.
        
        String cadena = "99";
        int altura = Integer.parseInt(cadena);
        altura += 1;
        System.out.println("Altura = " + altura);
        
        System.out.println("--------------------");
        
        Arbol tree1 = new Arbol(2.4f,15);
        System.out.println(tree1);
        
        System.out.println("Tronco de un arbol = "+Arbol.tronco);
        Arbol.generararOxigeno();
        
        /*Un atributo de clase o un metodo de clase (miembro) son indentificadores 
        que almacenan un valor constante o un comportamiento constante igual para 
        todos los objetos de la misma. Al ser constrantes no es necesario crear 
        una instancia (objetos).*/
        
        //JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        
        
        // aqui nos quedamos la clase anterior
        
        // OPERADOR TERNARIO
        
        int edad3 = 15;
        
        String resultado = "";
        
        if (edad3 < 18 ){
            resultado ="Menor de edad";
        }
        else{
            resultado = "Mayot de edad, ten un tequila para la garganta";
        }
        
        System.out.println(resultado);
        
        int edad4=24;
        String res = "";
        res = edad4 <18? "Menor de edad" : "Mayor de edad, tequila";
        System.out.println(res);
        
        //por ultima la version mas corta
        
        int edad5=19;
        System.out.println(edad5 < 18? "Menor de edad 5" : "Ya el tequila");
        
        int val3 = 1;
        
        int val4 = 0;
        val4 = val3 << 2;
        System.out.println(val4);
        
        System.out.println("----------------ARREGLOS--------------");
        int[] edades;
        
        edades = new int[5];
        System.out.println(edades);
        
        edades[0]=10;
        System.out.println("La primer edad es: "+edades [0]);
        
        int [] estaturas = new int [5];
        
        int [] pesos = {86,99,56,76,77};
        System.out.println(pesos [0]);
        System.out.println(pesos [1]);
        System.out.println(pesos [2]);
        System.out.println(pesos [3]);
        System.out.println(pesos [4]);
        
        //Imprime lo mismo pero con menos lineas de codigo 
        
        System.out.println("--------CON FOR-------");
        
        for (int i =0;i<pesos.length;i++){
            System.out.println(pesos[i]);
        }
        System.out.println("---------------");
        for (int i = pesos.length-1;i >=0;i--){
            System.out.println(pesos[i]);
        }
        
        System.out.println("Arreglo de alumnos");
        Alumno [] lista = new Alumno [5];
        lista [0] = new Alumno ("99999",2,9.0f);
        lista [1] = new Alumno ("77777",2,7.0f);
        lista [2] = new Alumno ("55555",2,7.0f);
        lista [3] = new Alumno ("88888",2,8.0f);
        lista [4] = new Alumno ("66666",2,6.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
            
        }
        
        System.out.println("Con for each....");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());
            
        }
        
        
        ArrayList<Alumno> grupo2209 = new ArrayList<Alumno>();
        
        grupo2209.add(new Alumno("99999", 2, 9.0f));
        grupo2209.add(new Alumno("88888", 2, 8.0f));
        grupo2209.add(new Alumno("77777", 2, 7.0f));
        grupo2209.add(new Alumno("66666", 2, 6.0f));
        grupo2209.add(new Alumno("55555", 2, 5.0f));
        
        for (Alumno alumno : grupo2209) {
            
            System.out.println(alumno); 
            
        }
        
        System.out.println("----------");
        
        grupo2209.add(2, new Alumno("81111", 3, 9.9f));
        
        for (Alumno alumno : grupo2209) {
            
            System.out.println(alumno);
            
        }
        
        
        Alumno tmp = grupo2209.get(3);
        System.out.println("Alumno en index = 1"+tmp);
        
        System.out.println("Eliminar el index 3");
        Alumno tmp2 = grupo2209.remove(3);
        System.out.println("Elemento sacado = "+tmp2);
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        
        System.out.println("Reemplazar el i-esimo elemento");
        Alumno tmp3 = grupo2209.set(0, new Alumno("44444", 4, 4.0f));
        System.out.println("El sacado es = "+tmp3);
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        //Excepciones
        //trycatch + TAB
        
        try {
            System.out.println("Excepciones");
        System.out.println(grupo2209.get(20));
        } catch (Exception e) {
            System.out.println("Error revisa los indices");
        }
        
        System.out.println("Fin del programa");
        
        
        
        
        
        
    }

    
}
