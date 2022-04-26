
package cuenta;


public class PruebaEjemplo {
    
    public static void main(String[] args) {
        
        CuentaHabiente [] lista = new CuentaHabiente [5];
        
        lista [0] = new CuentaHabiente (12345, "Jose", 25000.00f);
        lista [1] = new CuentaHabiente (54321, "Miguel", 51000.00f);
        lista [2] = new CuentaHabiente (57890, "Delta", 80000.00f);
        lista [3] = new CuentaHabiente (19876, "SkyShock", 10000.00f);
        lista [4] = new CuentaHabiente (24682, "MymAlkapone", 1000000.00f);
        
        
        for (CuentaHabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.evaluarNivelCliente());
        }
        
        
    }
}
