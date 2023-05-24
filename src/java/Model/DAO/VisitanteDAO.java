package Model.DAO;

import Controller.ConexionBD;

import Model.VO.VisitanteVO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VisitanteDAO {

    public boolean nuevoVisitante(VisitanteVO visitante) throws SQLException {
        boolean estado = false; // creamos un boolean estado
        ConexionBD con = new ConexionBD();// creamos el objeto de conexion 
        PreparedStatement pst; // cramos el objeto de un Statment preparado
  
        {

            String sql = "INSERT INTO visitante "
                    + "(numeroDocumento,nombre,motivoIngreso,conjuntoID)"
                    + "values (?,?,?,?)";  // creamos la consulta en un string

            PreparedStatement ppst = con.ConexionBD().prepareStatement(sql);// creacion el preparedStatemtend desde el objeto conexion 
            // ingresamos los parametros que se van a ingresar 
            ppst.setString(1, visitante.getNumeroDocumento());
            ppst.setString(2, visitante.getNombre());         
            ppst.setString(3, visitante.getMotivoIngreso());
            ppst.setInt(4, visitante.getConjuntoID());

            if (ppst.execute()) { // ejecutatos el statement el cual nos arrojara un boolean true si fue exitoso
                estado = true;
            }
            con.close();// cerramos la conexion

        }

        return estado; // retornamos el estado 

    }

}
