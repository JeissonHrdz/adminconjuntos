package Model.DAO;

import Controller.ConexionBD;
import Model.VO.AdministradorVO;
import Model.VO.PersonaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class AdministradorDAO {

    public boolean nuevaPersona(AdministradorVO administrador) throws SQLException {
        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado

        PersonaDAO personaDAO = new PersonaDAO();
        if (personaDAO.nuevaPersona(
                new PersonaVO(
                        0,
                        administrador.getNumeroDocumento(),
                        administrador.getPrimerNombre(),
                        administrador.getSegundoNombre(),
                        administrador.getPrimerApellido(),
                        administrador.getSegundoApellido(),
                        administrador.getPassword(),
                        administrador.getConjuntoID()))) {
            
            String sql = "INSERT INTO administrador "
                    + "(personaID) values ((SELECT max(personaID) FROM persona))";  // creamos la consulta en un string

            PreparedStatement ppst = con.ConexionBD().prepareStatement(sql);// creacion el preparedStatemtend desde el objeto conexion 
            // ingresamos los parametros que se van a ingresar 

            if (ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
                estado = true;
            }
            con.close();// cerramos la conexion

        }

        return estado; // retornamos el estado 

    }
    
    public boolean verificarAdministrador(int PersonaID) throws SQLException{
        
         boolean estado = false;  // creamos una variable int para guardar el id
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT  personaID FROM Administrador WHERE personaID = ?;"; // creamos la consulta en un string
        pst = con.prepararSql(sql);
        pst.setInt(1, PersonaID); // creacion el preparedStatemtend desde el objeto conexion

        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        while (rs.next()) {
          if(!Objects.isNull(rs.getInt("personaID"))){
              estado = true;
          }
          // guardamos el resultado obtenido
        }
        con.close(); // cerramos la conexion
        return estado; // retornamos el conjuntoID obtenido
    
    
    }

}
