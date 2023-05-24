
package Model.VO;


public class PropiedadesVO {
    
    int personaID;
    int propiedadID;
    int residenteID;

    public PropiedadesVO(int personaID, int propiedadID, int residenteID) {
        this.personaID = personaID;
        this.propiedadID = propiedadID;
        this.residenteID = residenteID;
    }

    public int getPersonaID() {
        return personaID;
    }

    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }

    public int getPropiedadID() {
        return propiedadID;
    }

    public void setPropiedadID(int propiedadID) {
        this.propiedadID = propiedadID;
    }

    public int getResidenteID() {
        return residenteID;
    }

    public void setResidenteID(int residenteID) {
        this.residenteID = residenteID;
    }
    
    
}
