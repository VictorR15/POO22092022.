
package ico.fes.modelo;

import ico.fes.db.PersonaDAO;
import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.sqlite.SQLiteException;


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
        
        //simular una consulta a una bd
        PersonaDAO pdao=new PersonaDAO();
        
        try {
            datos=pdao.obtenerTodo();
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void agreagarPersona(Persona P){
        //Insert a BD...
        PersonaDAO pdao = new PersonaDAO();
        datos.add(P);
        try {
            pdao.insertar(P);
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
