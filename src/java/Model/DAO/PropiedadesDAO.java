package Model.DAO;

import Controller.ConexionBD;
import Model.VO.PropiedadVO;
import Model.VO.PropiedadesVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PropiedadesDAO {

    /**
     * Este método registra las propiedades de un propietario
     *
     * @param propiedades
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public boolean nuevaPropiedades(PropiedadesVO propiedades) throws SQLException {
        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        String sql = "INSERT INTO propiedades "
                + "(personaID, "
                + "propiedadID,"
                + "residenteID)"
                + " values (?,?,?)";  // creamos la consulta en un string

        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql);// creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setInt(1, propiedades.getPersonaID());
        ppst.setInt(2, propiedades.getPropiedadID());
        ppst.setInt(3, propiedades.getResidenteID());

        if (!ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
            estado = true;
        }
        con.close();// cerramos la conexion

        return estado; // retornamos el estado 

    }

    /**
     * Este método retrona las propiedades de una persona de una persona especifica
     *
     * @param personaID
     *
     * @return array list con la informacion 
     * @throws java.sql.SQLException
     */
    public ArrayList<PropiedadesVO> obtenerInformacionPropiedad(int personaID) throws SQLException {
        ArrayList<PropiedadesVO> propiedad = new ArrayList<>(); // arraylist donde guardamos el id
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT * FROM propiedades WHERE personaID = ?"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion
        pst.setInt(1, personaID);
        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        while (rs.next()) {
          propiedad.add(new PropiedadesVO(
                  rs.getInt("personaID"), 
                  rs.getInt("propiedadID"),  
                  rs.getInt("residenteID")));

        }
        con.close(); // cerramos la conexion
        return propiedad; // retornamos el propiedadID obtenido
    }
    
        /**
     * Este método retrona las propiedades de una persona de una persona por idpropiedad
     *
     * @param propiedadID
     *
     * @return arraylist con la informacion
     * @throws java.sql.SQLException
     */
    public ArrayList<PropiedadesVO> obtenerInformacionPropiedadIdPropiedad(int propiedadID) throws SQLException {
        ArrayList<PropiedadesVO> propiedad = new ArrayList<>(); // arraylist donde guardamos el id
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT * FROM propiedades WHERE propiedadID = ?"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion
        pst.setInt(1, propiedadID);
        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        while (rs.next()) {
          propiedad.add(new PropiedadesVO(
                  rs.getInt("personaID"), 
                  rs.getInt("propiedadID"),  
                  rs.getInt("residenteID")));

        }
        con.close(); // cerramos la conexion
        return propiedad; // retornamos el propiedadID obtenido
    }

}
