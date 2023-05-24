package Model.DAO;

import Controller.ConexionBD;
import Model.VO.PersonaVO;
import Model.VO.PropiedadVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PropiedadDAO {

    /**
     * Este método registra una nueva propiedad
     *
     * @param propiedad
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public boolean nuevaPropiedad(PropiedadVO propiedad) throws SQLException {
        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        String sql = "INSERT INTO propiedad "
                + "(numero, "
                + "tipo,"
                + "fechaConstruccion,"
                + "tamaño,"
                + "conjuntoID) values (?,?,?,?,?)";  // creamos la consulta en un string

        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql);// creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setString(1, propiedad.getNumero());
        ppst.setString(2, propiedad.getTipo());
        ppst.setString(3, String.valueOf(propiedad.getFechaConstuccion()));
        ppst.setString(4, propiedad.getTamaño());
        ppst.setInt(5, propiedad.getConjuntoID());

        if (!ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
            estado = true;
        }
        con.close();// cerramos la conexion

        return estado; // retornamos el estado 

    }

    public int obtenerIdUltimoRegistro() throws SQLException {
        int conjuntoID = 0; // creamos una variable int para guardar el id
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT  max(propiedadID) as propiedadId FROM propiedad"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion

        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        while (rs.next()) {

            conjuntoID = rs.getInt("propiedadId"); // guardamos el resultado obtenido
        }
        con.close(); // cerramos la conexion
        return conjuntoID; // retornamos el conjuntoID obtenido
    }

    public PropiedadVO obtenerInformacionPropiedad(int propiedadID) throws SQLException {
        PropiedadVO propiedad = null; // creamos un ibjeto propiedad
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT * FROM propiedad WHERE propiedadID = ?"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion
        pst.setInt(1, propiedadID);
        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        while (rs.next()) {

            propiedad = new PropiedadVO(
                    rs.getInt("propiedadID"), 
                    rs.getString("numero"), 
                    rs.getString("tipo"), 
                    rs.getString("fechaConstruccion"), 
                    rs.getString("tamaño"), 
                    rs.getInt("conjuntoID"));
        }
        con.close(); // cerramos la conexion
        return propiedad; // retornamos el conjuntoID obtenido
    }
    
    
    
    public ArrayList<PropiedadVO> obtenerPropiedades(int conjuntoID) throws SQLException {
       ArrayList<PropiedadVO> propiedad = new ArrayList<>(); // creamos un arraylist de  propiedadVO
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT * FROM propiedad WHERE conjuntoID = ?"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion
        pst.setInt(1, conjuntoID);
        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        while (rs.next()) {

            propiedad.add(new PropiedadVO(
                    rs.getInt("propiedadID"), 
                    rs.getString("numero"), 
                    rs.getString("tipo"), 
                    rs.getString("fechaConstruccion"), 
                    rs.getString("tamaño"), 
                    rs.getInt("conjuntoID")));
        }
        con.close(); // cerramos la conexion
        return propiedad; // retornamos el conjuntoID obtenido
    }
    
 
         

}
