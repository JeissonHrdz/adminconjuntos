
package Model.VO;

import java.util.Date;


public class PropiedadVO {
    
    int propiedadID;
    String numero;
    String tipo;
    String fechaConstuccion;
    String tamaño;
    int conjuntoID;

    public PropiedadVO(int propiedadID, String numero, String tipo, String fechaConstuccion, String tamaño, int conjuntoID) {
        this.propiedadID = propiedadID;
        this.numero = numero;
        this.tipo = tipo;
        this.fechaConstuccion = fechaConstuccion;
        this.tamaño = tamaño;
        this.conjuntoID = conjuntoID;
    }

    public int getPropiedadID() {
        return propiedadID;
    }

    public void setPropiedadID(int propiedadID) {
        this.propiedadID = propiedadID;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaConstuccion() {
        return fechaConstuccion;
    }

    public void setFechaConstuccion(String fechaConstuccion) {
        this.fechaConstuccion = fechaConstuccion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getConjuntoID() {
        return conjuntoID;
    }

    public void setConjuntoID(int conjuntoID) {
        this.conjuntoID = conjuntoID;
    }
    
    
    
}
