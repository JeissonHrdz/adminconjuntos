/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Controller.ConexionBD;
import Model.VO.PagoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NITRO
 */
public class PagoDAO {

    /**
     * Este método registra un nuevo pago
     *
     * @param pago
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public boolean nuevoPago(PagoVO pago) throws SQLException {
        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion   
        String sql = "INSERT INTO pago (valor, fecha, estado, tipoPagoID, personaID) values (?,?,?,?,?)"; // creamos la consulta en un string
        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql); // creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setFloat(1, pago.getValor());
        ppst.setDate(2, pago.getFecha());
        ppst.setString(3, pago.getEstado());
        ppst.setInt(4, pago.getTipoPagoID());
        ppst.setInt(4, pago.getPersonaID());

        if (!ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
            estado = true;
        }
        con.close(); // cerramos la conexion 

        return estado; // retornamos el estado 

    }

    /**
     * Este método que guarda la realizaciond de un pago
     *
     * @param pagoID
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public boolean realizarPago(int pagoID) throws SQLException {
        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion   
        String sql = "UPDATE pago SET estado = 'PAGADO' WHERE pagoID = ?"; // creamos la consulta en un string
        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql); // creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setInt(1, pagoID);

        if (!ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
            estado = true;
        }
        con.close(); // cerramos la conexion 

        return estado; // retornamos el estado 

    }

    /**
     * Este método obtiene los pagos de la bd tanto pendientes como pagados
     *
     * @param tipoPagoID
     * @param personaID
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public ArrayList<PagoVO> obtenerPagos(int tipoPagoID, int personaID) throws SQLException {
        ArrayList<PagoVO> pagos = new ArrayList<>(); // creamos array list de pagos
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion   
        String sql = "SELECT * FROM pago WHERE tipoPagoID = ? and personaID = ?"; // creamos la consulta en un string
        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql); // creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setInt(1, tipoPagoID);
        ppst.setInt(2, personaID);

        ResultSet rs = ppst.executeQuery();
        PagoVO pago;
        while (rs.next()){
            pago = new PagoVO(
                    rs.getInt("pagoID"), 
                    rs.getFloat("valor"), 
                    rs.getInt("propiedadID"),
                    rs.getDate("fecha"), 
                    rs.getString("estado"), 
                    rs.getInt("tipoPagoID"), 
                    rs.getInt("personaID"));
            pagos.add(pago);
        }
        con.close(); // cerramos la conexion 

        return pagos; // retornamos el estado 

    }

}
