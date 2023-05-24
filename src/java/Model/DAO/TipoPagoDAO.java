package Model.DAO;

import Controller.ConexionBD;
import Model.VO.TipoPagoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoPagoDAO {

    /**
     * Este método devuelve los tipos de pago en un arraylist
     *
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public ArrayList<TipoPagoVO> obtenerTipoPago() throws SQLException {
        ArrayList<TipoPagoVO> tipoPagoVOs = new ArrayList<>();// creamos un arraulist para guardar los datos
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT  *  FROM tipopago"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion

        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 
        TipoPagoVO tipoPagoVO;
        while (rs.next()) {
            tipoPagoVO = new TipoPagoVO(rs.getInt("tipoPagoID"), rs.getString("nombre"));

            tipoPagoVOs.add(tipoPagoVO);
        }
        con.close(); // cerramos la conexion
        return tipoPagoVOs; // retornamos el arraylist con los datos
    }

}
