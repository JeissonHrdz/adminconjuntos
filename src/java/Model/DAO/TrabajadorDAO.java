package Model.DAO;

import Controller.ConexionBD;
import Model.VO.PersonaVO;
import Model.VO.TrabajadorVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class TrabajadorDAO {

    public boolean nuevoTrabajador(TrabajadorVO trabjador) throws SQLException {
        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado

        PersonaDAO personaDAO = new PersonaDAO();
        if (personaDAO.nuevaPersona(
                new PersonaVO(
                        0,
                        trabjador.getNumeroDocumento(),
                        trabjador.getPrimerNombre(),
                        trabjador.getSegundoNombre(),
                        trabjador.getPrimerApellido(),
                        trabjador.getSegundoApellido(),
                        trabjador.getPassword(),
                        trabjador.getConjuntoID()))) {

            String sql = "INSERT INTO trabajador "
                    + "(personaID,cargo,horasTrabajo,sueldo) values ((SELECT max(personaID) FROM persona), ?,?,?)";  // creamos la consulta en un string

            PreparedStatement ppst = con.ConexionBD().prepareStatement(sql);// creacion el preparedStatemtend desde el objeto conexion 
            // ingresamos los parametros que se van a ingresar 
            ppst.setString(1, trabjador.getCargo());
            ppst.setFloat(2, trabjador.getHorasTrabajo());
            ppst.setString(3, trabjador.getSueldo());
            
            if (ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
                estado = true;
            }
            con.close();// cerramos la conexion
        }
        return estado; // retornamos el estado 
    }
    
    public boolean verificarTrabajador(int PersonaID) throws SQLException {

        boolean estado = false;  // creamos una variable int para guardar el id
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT  personaID FROM trabajador WHERE personaID = ?;"; // creamos la consulta en un string
        pst = con.prepararSql(sql);
        pst.setInt(1, PersonaID); // creacion el preparedStatemtend desde el objeto conexion

        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        while (rs.next()) {
            if (!Objects.isNull(rs.getInt("personaID"))) {
                estado = true;
            }
            // guardamos el resultado obtenido
        }
        con.close(); // cerramos la conexion
        return estado; // retornamos el conjuntoID obtenido

    }
    
    public TrabajadorVO obtenerDatosTrabajador(int PersonaID) throws SQLException {
        TrabajadorVO trabajador  =null;
        boolean estado = false;  // creamos una variable int para guardar el id
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT  * FROM trabajador WHERE personaID = ?;"; // creamos la consulta en un string
        pst = con.prepararSql(sql);
        pst.setInt(1, PersonaID); // creacion el preparedStatemtend desde el objeto conexion
        PersonaDAO perDao = new PersonaDAO();
        PersonaVO persona = perDao.obtenerInformacionPersona(PersonaID);
        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        while (rs.next()) {
            trabajador = new TrabajadorVO(
                    persona.getPersonaID(), 
                    persona.getNumeroDocumento(),
                    persona.getPrimerNombre(), 
                    persona.getSegundoNombre(), 
                    persona.getPrimerApellido(), 
                    persona.getSegundoApellido(), 
                    "", 
                    0, 
                    rs.getString("cargo"), 
                    rs.getFloat("horasTrabajo"), 
                    rs.getString("sueldo") 
                    );
            // guardamos el resultado obtenido
        }
        con.close(); // cerramos la conexion
        return trabajador; // retornamos el conjuntoID obtenido

    }

}
