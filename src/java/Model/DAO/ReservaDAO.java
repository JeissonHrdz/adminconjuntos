package Model.DAO;

import Controller.ConexionBD;
import Model.VO.ConjuntoVO;
import Model.VO.ReservaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservaDAO {

    /**
     * Este método registra una nueva reserva
     *
     * @param reserva
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public boolean nuevaReserva(ReservaVO reserva) throws SQLException {

        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion   
        String sql = "INSERT INTO reserva (areacomunID, personaID, fecha, hora) values (?,?,?,?)"; // creamos la consulta en un string
        PreparedStatement ppst = con.ConexionBD().prepareStatement(sql); // creacion el preparedStatemtend desde el objeto conexion 
        // ingresamos los parametros que se van a ingresar 
        ppst.setInt(1, reserva.getAreaComunID());
        ppst.setInt(2, reserva.getPersonaID());
        ppst.setString(3, reserva.getFecha());
        ppst.setString(4, reserva.getHora());

        if (!ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
            estado = true;
        }
        con.close(); // cerramos la conexion 

        return estado; // retornamos el estado 

    }

    /**
     * Este método verifica si se puede reservar un areacomun
     *
     * @param areacomunID
     * @param fecha
     * @param hora
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public Boolean verificarDispnibilidadReserva(int areacomunID, String fecha, String hora) throws SQLException {

        boolean estado = false; // creamos una variable boolean 
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT reservaID  FROM reserva WHERE fecha = ? and hora = ? and areacomunID = ?"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion
        pst.setString(1, fecha);
        pst.setString(2, hora + ":00");
        pst.setInt(3, areacomunID);
        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 

        if (!rs.next()) {
            estado = true;
        }

        con.close(); // cerramos la conexion
        return estado; // retornamos el conjuntoID obtenido
    }

    /**
     * Este método obtiene la reservas hechas por un residente
     *
     * @param personaID
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public ArrayList<ReservaVO> obtenerReservas(int personaID) throws SQLException {

        ArrayList<ReservaVO> reservas = new ArrayList<>();
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT * FROM reserva WHERE personaID = ?"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion
        pst.setInt(1, personaID);

        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 

        while (rs.next()) {
            ReservaVO resvo = new ReservaVO(
                    rs.getInt("reservaID"),
                    rs.getInt("areacomunID"),
                    rs.getInt("personaID"),
                    rs.getString("fecha"),
                    rs.getString("hora"));
            reservas.add(resvo);
        }

        con.close(); // cerramos la conexion
        return reservas; // retornamos el conjuntoID obtenido
    }
    
    /**
     * Este método obtiene la reservas del conjunto
     *
 
     * @return true si la operacion fue exitosa, si no false.
     * @throws java.sql.SQLException
     */
    public ArrayList<ReservaVO> obtenerReservasPorConjunto() throws SQLException {

        ArrayList<ReservaVO> reservas = new ArrayList<>();
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
        con.ConexionBD(); // iniciamos la conexion 
        String sql = "SELECT * FROM reserva"; // creamos la consulta en un string
        pst = con.prepararSql(sql); // creacion el preparedStatemtend desde el objeto conexion
    ;

        ResultSet rs = pst.executeQuery(); // ejecutamos la peticion select 

        while (rs.next()) {
            ReservaVO resvo = new ReservaVO(
                    rs.getInt("reservaID"),
                    rs.getInt("areacomunID"),
                    rs.getInt("personaID"),
                    rs.getString("fecha"),
                    rs.getString("hora"));
            reservas.add(resvo);
        }

        con.close(); // cerramos la conexion
        return reservas; // retornamos el conjuntoID obtenido
    }

}
