
package Model.VO;

public class ConjuntoVO {
    
    int conjuntoID;
    String nombre;
    String direccion;

    public ConjuntoVO(int conjuntoID, String nombre, String direccion) {
        this.conjuntoID = conjuntoID;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getConjuntoID() {
        return conjuntoID;
    }

    public void setConjuntoID(int conjuntoID) {
        this.conjuntoID = conjuntoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
