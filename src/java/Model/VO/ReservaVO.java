
package Model.VO;

import java.sql.Date;
import java.sql.Time;


public class ReservaVO {
    
    int reservaID;
    int areaComunID;
    int personaID;
    String fecha;
    String hora;

    public ReservaVO(int reservaID, int areaComunID, int personaID, String fecha, String hora) {
        this.reservaID = reservaID;
        this.areaComunID = areaComunID;
        this.personaID = personaID;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }
    
    
    
    

    public int getAreaComunID() {
        return areaComunID;
    }

    public void setAreaComunID(int areaComunID) {
        this.areaComunID = areaComunID;
    }

    public int getPersonaID() {
        return personaID;
    }

    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
}
