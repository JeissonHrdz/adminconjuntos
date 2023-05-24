
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;


public class ConexionBD {    

    
     private static String Server = "jdbc:mysql://localhost:3306/adminconjuntos?characterEncoding=UTF8";
    private static String user = "root";
    private static String pass = "";
    private static String driver = "com.mysql.jdbc.Driver";
    private static Connection conexion;
    public Statement estado;

    public Connection ConexionBD(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(Server,user,pass);
            estado = conexion.createStatement();    
    

        }catch (SQLException ex){
            System.out.println("1");
            System.out.println(ex.getMessage());

        }
        catch (ClassNotFoundException ex2) {
            System.out.println("2");
            System.out.println(ex2.getMessage());
            System.out.println(Arrays.toString(ex2.getStackTrace()));

        }

        return conexion;

    }

    public void close(){
        try {
            conexion.close();
        }catch (SQLException ex){
            ex.getMessage();
        }


    }
    
    public PreparedStatement prepararSql(String sql) throws SQLException{
      return ConexionBD().prepareStatement(sql);
    }

    public boolean ingresarDatos(String sql){
            boolean estado1 = false;
        try {
            estado.executeUpdate(sql); 
            System.out.println(sql);
                estado1 = true;

        }catch (SQLException ex){
            System.out.println("Error al ingresar: "+ex.getMessage());
        }

        return estado1;
    }

    public ResultSet obtenerDatos(String sql){
        ResultSet rs = null;
        try{
        rs =  estado.executeQuery(sql);
    }catch (SQLException ex){
        ex.getMessage();

    }
        return rs;
    }
    
 

    
}
