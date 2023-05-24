
package Model.DAO;

import Controller.ConexionBD;
import Model.VO.AreaComunVO;
import Model.VO.IncidenciaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class IncidenciaDAO {    
    
    /**
     * Este método registra una nueva incidencia en la BD
     *
     * @param incidencia
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public boolean nuevaIncidencia(IncidenciaVO incidencia) throws SQLException {

        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion   
        String sql = "INSERT INTO incidencia (personaID,descripcion, estado,conjuntoID) values (?,?,?,?)"; // creamos la consulta en un string
        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql); // creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setInt(1, incidencia.getPersonaID());
        ppst.setString(2, incidencia.getDescripccion());
        ppst.setString(3, incidencia.getEstado());
         ppst.setInt(4, incidencia.getConjuntoID());

        if (!ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
            estado = true;
        }
        con.close(); // cerramos la conexion 
        return estado; // retornamos el estado 
    }
    
        /**
     * Este método devuelve las incidencias de una persona que estan en la BD
     *
     * @param personaID
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public ArrayList<IncidenciaVO> obtenerIncidencias(int personaID) throws SQLException {
        ArrayList<IncidenciaVO> incidenciaVOs = new ArrayList<>();// creamos un arraulist para guardar los datos
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT  *  FROM incidencia WHERE personaID = ?"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion
        pst.setInt(1, personaID);
        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        IncidenciaVO incidenciaVO ;
        while (rs.next()) {
            incidenciaVO = new IncidenciaVO(
                    rs.getInt("incidenciaID"), 
                    rs.getInt("personaID"), 
                    rs.getString("descripcion"), 
                    rs.getString("fecha"), 
                    rs.getString("estado"),
                    rs.getInt("conjuntoID"));

         incidenciaVOs.add(incidenciaVO);
        }
        con.close(); // cerramos la conexion
        return incidenciaVOs; // retornamos el arraylist con los datos
    }
    
           /**
     * Este método devuelve las incidencias de una persona que estan en la BD
     *
     * @param conjuntoID
     *
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public ArrayList<IncidenciaVO> obtenerIncidenciasCompletas(int conjuntoID) throws SQLException {
        ArrayList<IncidenciaVO> incidenciaVOs = new ArrayList<>();// creamos un arraulist para guardar los datos
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT  *  FROM incidencia  WHERE conjuntoID = ?"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion
        pst.setInt(1, conjuntoID);
        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        IncidenciaVO incidenciaVO ;
        while (rs.next()) {
            incidenciaVO = new IncidenciaVO(
                    rs.getInt("incidenciaID"), 
                    rs.getInt("personaID"), 
                    rs.getString("descripcion"), 
                    rs.getString("fecha"), 
                    rs.getString("estado"),
              rs.getInt("conjuntoID"));

         incidenciaVOs.add(incidenciaVO);
        }
        con.close(); // cerramos la conexion
        return incidenciaVOs; // retornamos el arraylist con los datos
    }
    
    
    
    /**
     * Este método cambia el estado de la incidencia
     *
     * @param incidenciaID
     * @param estado
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public boolean cambiarEstadoIncidencia(int incidenciaID, String estado) throws SQLException {

        boolean es = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion   
        String sql = "UPDATE incidencia SET estado = ? WHERE incidenciaID = ?"; // creamos la consulta en un string
        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql); // creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setString(1, estado);
        ppst.setInt(2, incidenciaID);   

        if (!ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
            es = true;
        }
        con.close(); // cerramos la conexion 
        return es; // retornamos el estado 
    }
    
    
}
