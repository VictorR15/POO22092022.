
package javabasico2209;

import java.util.ArrayList;
import javax.swing.text.StyledEditorKit;


public class Alumno {
    
    private String numeorCuenta;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numeorCuenta, int semestre, float promedio) {
        this.numeorCuenta = numeorCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeorCuenta() {
        return numeorCuenta;
    }

    public void setNumeorCuenta(String numeorCuenta) {
        this.numeorCuenta = numeorCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeorCuenta=" + numeorCuenta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    public void estudiar (int minutos){
        System.out.println("Estudiando..."+minutos + "minutos");
    }
    public String evaluarDesempenio(){
        return this.promedio > 8.0f?"Sobresaliente":"Regular";
    }
    
    ArrayList<Alumno> grupo2209 = new ArrayList<Alumno>();
    
    
    
       
}
