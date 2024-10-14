/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conector {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    public Conector(){
        conn = null;
        try {
            Class.forName(driver);
            conn =DriverManager.getConnection(url,user,password);
            if(conn != null ){
                System.out.println("Conexion establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error al conectar"+e);
        }
    }
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn=null;
        
            if(conn==null){
                System.out.println("Conexion terminada....");
            }
    }
}
