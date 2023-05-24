
package Model.VO;


public class TrabajadorVO extends PersonaVO{
    
    String cargo;
    float horasTrabajo;
    String sueldo;

    public TrabajadorVO(
            int personaID, 
            String numeroDocumento, 
            String primerNombre, 
            String segundoNombre, 
            String primerApellido, 
            String segundoApellido,
            String password,
            int conjuntoID,
            String cargo,
            float horasTrabajo,
            String sueldo) {
        
        super(personaID, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido,password,conjuntoID);
        
        this.cargo = cargo;
        this.horasTrabajo =horasTrabajo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(float horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
