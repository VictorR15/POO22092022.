
package libro;


public class Editorial {

    private String nombreEmpresa;
    private int librosImpresos;

    public Editorial() {
    }

    public Editorial(String nombreEmpresa, int librosImpresos) {
        this.nombreEmpresa = nombreEmpresa;
        this.librosImpresos = librosImpresos;
    }

    public int getLibrosImpresos() {
        return librosImpresos;
    }

    public void setLibrosImpresos(int librosImpresos) {
        this.librosImpresos = librosImpresos;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEmpresa=" + nombreEmpresa + ", librosImpresos=" + librosImpresos + '}';
    }
    
    
}
