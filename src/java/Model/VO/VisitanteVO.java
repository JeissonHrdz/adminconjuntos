
package Model.VO;

import java.sql.Time;
import java.util.Date;


public class VisitanteVO {
    
    int visitanteID;
    String numeroDocumento;
    String nombre;
    String fechaIngreso;   
    String motivoIngreso;
    int conjuntoID;

    public VisitanteVO(int visitanteID, String numeroDocumento, String nombre, String fechaIngreso, String motivoIngreso, int conjuntoID) {
        this.visitanteID = visitanteID;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso; 
        this.motivoIngreso = motivoIngreso;
        this.conjuntoID = conjuntoID;
    }

    public int getVisitanteID() {
        return visitanteID;
    }

    public void setVisitanteID(int visitanteID) {
        this.visitanteID = visitanteID;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

 

    public String getMotivoIngreso() {
        return motivoIngreso;
    }

    public void setMotivoIngreso(String motivoIngreso) {
        this.motivoIngreso = motivoIngreso;
    }

    public int getConjuntoID() {
        return conjuntoID;
    }

    public void setConjuntoID(int conjuntoID) {
        this.conjuntoID = conjuntoID;
    }
    
    

 
            
   
    
    
    
}
