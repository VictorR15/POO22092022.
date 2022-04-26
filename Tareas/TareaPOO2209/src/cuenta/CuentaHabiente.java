package cuenta;

public class CuentaHabiente {

    //Atributos
    int idCliente;
    String nombre;
    float balance;  //(donde balance es el dinero que tiene ahorrado)

    public CuentaHabiente() {
    }

    public CuentaHabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero(float monto){
        
        balance -= monto;
    }
    
    public String evaluarNivelCliente(){
        
        return this.balance > 50000.00f?"Cliente Premium":"Cliente Regular";
                
    }

}
