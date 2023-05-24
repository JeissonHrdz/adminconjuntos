
package Model.VO;


public class ResidenteVO  extends PersonaVO{
    
    int propiedadId;

    public ResidenteVO(
            int personaID, 
            String numeroDocumento, 
            String primerNombre, 
            String segundoNombre, 
            String primerApellido, 
            String segundoApellido,
            String password,
            int conjuntoID
           ) {        
        super(personaID, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido,password,conjuntoID);

    }

   
}
