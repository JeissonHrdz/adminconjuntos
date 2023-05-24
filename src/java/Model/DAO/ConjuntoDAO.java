package Model.DAO;

import Controller.ConexionBD;
import Model.VO.ConjuntoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConjuntoDAO {

    /**
     * Este método registra un nuevo conjunto en la BD
     *
     * @param conjunto
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public boolean nuevoConjunto(ConjuntoVO conjunto) throws SQLException {
        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion   
        String sql = "INSERT INTO conjunto (nombre, direccion) values (?,?)"; // creamos la consulta en un string
        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql); // creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setString(1, conjunto.getNombre());
        ppst.setString(2, conjunto.getDireccion());

        if (!ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
            estado = true;
        }
        con.close(); // cerramos la conexion 

        return estado; // retornamos el estado 

    }

    /**
     * Este método obtiene ID del ultimo registro en la tabla de conjuntos
     *
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public int obtenerIdUltimoRegistro() throws SQLException {
        int conjuntoID = 0; // creamos una variable int para guardar el id
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT  max(conjuntoID) as conjuntoId FROM conjunto"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion

        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        while (rs.next()) {
          
            conjuntoID = rs.getInt("conjuntoId"); // guardamos el resultado obtenido
        }
        con.close(); // cerramos la conexion
        return conjuntoID; // retornamos el conjuntoID obtenido
    }
    
    
     
    
}
