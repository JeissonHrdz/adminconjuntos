package Model.VO;

import java.sql.Date;

public class PagoVO {

    int pagoID;
    float valor;
    int propiedadID;
    Date fecha;
    String estado;
    int tipoPagoID;
    int personaID;

    public PagoVO(int pagoID, float valor, int propiedadID, Date fecha, String estado, int tipoPagoID, int personaID) {
        this.pagoID = pagoID;
        this.valor = valor;
        this.propiedadID = propiedadID;
        this.fecha = fecha;
        this.estado = estado;
        this.tipoPagoID = tipoPagoID;
        this.personaID = personaID;
    }
    
    

    public int getPagoID() {
        return pagoID;
    }

    public void setPagoID(int pagoID) {
        this.pagoID = pagoID;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getPropiedadID() {
        return propiedadID;
    }

    public void setPropiedadID(int propiedadID) {
        this.propiedadID = propiedadID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTipoPagoID() {
        return tipoPagoID;
    }

    public void setTipoPagoID(int tipoPagoID) {
        this.tipoPagoID = tipoPagoID;
    }

    public int getPersonaID() {
        return personaID;
    }

    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }
    
    

}