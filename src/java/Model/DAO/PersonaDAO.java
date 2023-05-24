/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Controller.ConexionBD;
import Model.VO.PersonaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonaDAO {

    /**
     * Este método registra una nueva persona en la BD
     *
     * @param persona
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public boolean nuevaPersona(PersonaVO persona) throws SQLException {
        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        String sql = "INSERT INTO persona "
                + "(numeroDocumento, "
                + "primerNombre,"
                + "segundoNombre,"
                + "primerApellido,"
                + "segundoApellido,"
                + "password,"
                + "conjuntoID) values (?,?,?,?,?,?,?)";  // creamos la consulta en un string

        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql);// creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setString(1, persona.getNumeroDocumento());
        ppst.setString(2, persona.getPrimerNombre());
        ppst.setString(3, persona.getSegundoNombre());
        ppst.setString(4, persona.getPrimerApellido());
        ppst.setString(5, persona.getSegundoApellido());
        ppst.setString(6, persona.getPassword());
        ppst.setInt(7, persona.getConjuntoID());

        if (!ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
            estado = true;
        }
        con.close();// cerramos la conexion

        return estado; // retornamos el estado 

    }

      /**
     * Este método verifica si el usuario existe al momento de iniciar sesion
     *
     * @param numeroDocumento
     * @param password
     * @return retorna un int con el ID de la persona
     * @throws java.sql.SQLException
     */
    public int incioSesion( String numeroDocumento, String password) throws SQLException {
        int personaID = 0; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        con.ConexionBD();
        String sql = " SELECT personaID FROM persona WHERE persona.numeroDocumento = ? AND persona.password = ? ;";
        PreparedStatement ppst = con.prepararSql(sql); // cramos el objeto de un Statment preparado
        ppst.setString(1,numeroDocumento);
        ppst.setString(2, password);
        
        ResultSet rs = ppst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("personaID"));
            personaID = rs.getInt("personaID");
        }
          con.close();// cerramos la conexion
        return personaID;

    }
    
     /**
     * Este busca el ID de una persona mediane el numero de documento
     *
     * @param numeroDocumento
     * @return retorna un int con el ID de la persona
     * @throws java.sql.SQLException
     */
    public int buscarIdPorNumeroDocumento( String numeroDocumento) throws SQLException {
        int personaID = 0; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        con.ConexionBD();
        String sql = " SELECT personaID FROM persona WHERE persona.numeroDocumento = ?  ;";
        PreparedStatement ppst = con.prepararSql(sql); // cramos el objeto de un Statment preparado
        ppst.setString(1,numeroDocumento);     
        
        ResultSet rs = ppst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("personaID"));
            personaID = rs.getInt("personaID");
        }
          con.close();// cerramos la conexion
        return personaID;
    }
    
    /**
    
    /**
     * Este método obtiene le id del conjunto de una persona 
     *
     * @param personaID
     * @return retorna un int con el ID del conjunto
     * @throws java.sql.SQLException
     */
    public int obtenerConjuntoIdPersona(int personaID) throws SQLException {
        int conjuntoID = 0;
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        con.ConexionBD();
        String sql = " SELECT conjuntoID FROM persona WHERE personaID = ? ;";
        PreparedStatement ppst = con.prepararSql(sql); // cramos el objeto de un Statment preparado
        ppst.setInt(1,personaID);        
        ResultSet rs = ppst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("conjuntoID"));
            conjuntoID = rs.getInt("conjuntoID");
        }
          con.close();// cerramos la conexion
        return conjuntoID;
    }
    
     /**
     * Este método obtiene la informacion de una persona
     *
     * @param personaID
     * @return retorna un int con el ID del conjunto
     * @throws java.sql.SQLException
     */
    public PersonaVO obtenerInformacionPersona(int personaID) throws SQLException {
     
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        con.ConexionBD();
        String sql = " SELECT * FROM persona WHERE personaID = ? ;";
        PreparedStatement ppst = con.prepararSql(sql); // cramos el objeto de un Statment preparado
        ppst.setInt(1,personaID);        
        ResultSet rs = ppst.executeQuery();
        PersonaVO persona = null;
        while (rs.next()) {
           persona = new PersonaVO(
                   rs.getInt("personaID"), 
                   rs.getString("numeroDocumento"), 
                   rs.getString("primerNombre"), 
                   rs.getString("segundoNombre"), 
                   rs.getString("primerApellido"), 
                   rs.getString("segundoApellido"), 
                   "", 
                   rs.getInt("conjuntoID"));
        }
          con.close();// cerramos la conexion
        return persona;
    }
    
    

}
