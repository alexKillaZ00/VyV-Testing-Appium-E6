package BaseDeDatos;

import com.mysql.jdbc.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    //Variables necesarias para hacer la conexion
    
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static final String BD = "sistemadnj" ;
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD;
            
    public static Connection conexion;
    
    public Conexion(){
        //...
        } //Cierra metodo constructor
    
    public static Connection iniciar(){
        Conexion.conexion = null;
        
        try {
            
            //indicamos que existe un driver para coenxtar con la BD
            Class.forName("com.mysql.jdbc.Driver");
            
            Conexion.conexion = (Connection) DriverManager.getConnection( 
                    Conexion.URL,
                    Conexion.USUARIO,
                    Conexion.PASSWORD
            );
            
                System.out.println("Conectado a la base de datos");
        
        } catch (ClassNotFoundException | SQLException es) {
            
            System.out.println("Error");
            System.err.println("Error: " + es.getMessage());
        }
        
        return Conexion.conexion;
    }// Cierra metodo iniciar
    
    
    public static boolean cerrar(){
    
        try {
            
            if (Conexion.conexion != null) {
                
                Conexion.conexion.close();
                
                Conexion.conexion = null;
                 
            }
            
            System.out.println("Conexion cerrada");
            
            return true;
            
        } catch (SQLException | NullPointerException e) {
            System.err.println("Error al cerrar la conexion" + e.getMessage());
            return false;
        }
    
    }//metodo Cerrar
    
}//Cierra clase
