
package Model.VO;

public class TipoPagoVO {
    
    int tipoPagoID;
    String nombre;

    public TipoPagoVO(int tipoPagoID, String nombre) {
        this.tipoPagoID = tipoPagoID;
        this.nombre = nombre;
    }

    public int getTipoPagoID() {
        return tipoPagoID;
    }

    public void setTipoPagoID(int tipoPagoID) {
        this.tipoPagoID = tipoPagoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
