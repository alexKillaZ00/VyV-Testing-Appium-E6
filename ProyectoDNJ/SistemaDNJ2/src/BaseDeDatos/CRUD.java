package BaseDeDatos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CRUD {
    Statement statement = null;
    PreparedStatement pst;
    int filaAfectada;       
    ResultSet rst;
    
    public CRUD (Connection conexion){
    
         
        this.statement = null; 
        this.pst = null;
        this.rst = null;
        this.filaAfectada = Integer.MAX_VALUE;

    
    }//Cierra llave constructor

    
    public boolean insertar(String sql){
    
        try {
            
            this.pst = (PreparedStatement) Conexion.conexion .prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            this.filaAfectada = pst.executeUpdate();
            System.out.println("Insertado correctamente....");
            return true; 
            
        } catch (SQLException e) {
            
            System.err.println("Error al insertar: " + e.getMessage());
            return false;
        }
    
    }//Cierra llave insertar
    
    
    public ResultSet seleccionar(String sql){
    
        try {
            //preparando la conexion
            this.statement = Conexion.conexion.createStatement();
            
            //ejecutamos el sql y obtenemos resultaado
            return this.statement.executeQuery(sql);
            
        } catch (SQLException | ClassCastException e) {
            System.err.println("Error al seleccionar" + e.getMessage());
            return null;
        
        }
        
    }//Cierra seleccionar
    
    
    public boolean actualizar(String sql){
    
        try {
            this.pst = (PreparedStatement) Conexion.conexion.prepareStatement(sql);
            this.filaAfectada = pst.executeUpdate();
            System.out.println("actualizado correctamente");
            return true;
        } catch (Exception e) {
            System.err.println("Error al actualizar" + e.getMessage());
            return false;
        }
    }//Cierra Actualizar
    
    
    public boolean eliminar(String sql){
    
        try {
            this.statement = Conexion.conexion.createStatement();
            this.statement.executeUpdate(sql);
            System.out.println("Eliminado correctamente");
            return true;
        } catch (SQLException e) {
            System.err.println("Error al Elimininar" + e.getMessage());
            return false;
        }
    }//Cierra Actualizar
    
    public ResultSet validar(String sql){
    
        try {
            //preparando la conexion
            this.statement = Conexion.conexion.createStatement();
            
            //ejecutamos el sql y obtenemos resultaado
            return this.statement.executeQuery(sql);
            
        } catch (SQLException | ClassCastException e) {
            System.err.println("Error al validar" + e.getMessage());
            return null;
        
        }
        
    }
    
}
