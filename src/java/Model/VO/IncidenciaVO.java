
package Model.VO;


public class IncidenciaVO {
    
    int incidenciaID;
    int personaID;
    String descripccion;
    String fecha;
    String estado;
    int conjuntoID;

    public IncidenciaVO(int incidenciaID, int personaID, String descripccion, String fecha, String estado, int conjuntoID) {
        this.incidenciaID = incidenciaID;
        this.personaID = personaID;
        this.descripccion = descripccion;
        this.fecha = fecha;
        this.estado = estado;
        this.conjuntoID = conjuntoID;
    }

    public int getIncidenciaID() {
        return incidenciaID;
    }

    public void setIncidenciaID(int incidenciaID) {
        this.incidenciaID = incidenciaID;
    }

    public int getPersonaID() {
        return personaID;
    }

    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getConjuntoID() {
        return conjuntoID;
    }

    public void setConjuntoID(int conjuntoID) {
        this.conjuntoID = conjuntoID;
    }
    
    
    
    
    
    
}
