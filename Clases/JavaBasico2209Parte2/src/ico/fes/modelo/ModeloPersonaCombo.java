
package ico.fes.modelo;

import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;


public class ModeloPersonaCombo implements ComboBoxModel<Persona>{
    
    private ArrayList<Persona> datos;
    private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    
    
    @Override
    public void setSelectedItem(Object o) {
        this.selected = (Persona)o;
        
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
    
    public void consultarBaseDatos(){
        
        //simular una consulta a un base de datos 
        datos = new ArrayList<Persona>();
        //conecion a bd
        //consulta sql
        datos.add(new Persona("Jose", 19));
        datos.add(new Persona("Maria", 21));
        datos.add(new Persona("Jesus", 33));
        datos.add(new Persona("Diana", 22));
    }
    
    
}
