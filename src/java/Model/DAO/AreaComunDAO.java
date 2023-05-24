
package Model.DAO;

import Controller.ConexionBD;
import Model.VO.AreaComunVO;
import Model.VO.TipoPagoVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AreaComunDAO {

     /**
     * Este método devuelve las areas comunes que estan en la BD
     *
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public ArrayList<AreaComunVO> obtenerAreas() throws SQLException {
        ArrayList<AreaComunVO> acvos = new ArrayList<>();// creamos un arraulist para guardar los datos
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT  *  FROM areacomun"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion

        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        AreaComunVO acvo ;
        while (rs.next()) {
            acvo = new AreaComunVO(rs.getInt("areaComunID"), rs.getString("nombre"));

            acvos.add(acvo);
        }
        con.close(); // cerramos la conexion
        return acvos; // retornamos el arraylist con los datos
    }
  
    
}
