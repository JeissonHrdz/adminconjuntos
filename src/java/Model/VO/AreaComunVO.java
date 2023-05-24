
package Model.VO;


public class AreaComunVO {
    
    int areaComunID;
    String nombre;

    public AreaComunVO(int areaComunID, String nombre) {
        this.areaComunID = areaComunID;
        this.nombre = nombre;
    }

    public int getAreaComunID() {
        return areaComunID;
    }

    public void setAreaComunID(int areaComunID) {
        this.areaComunID = areaComunID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
