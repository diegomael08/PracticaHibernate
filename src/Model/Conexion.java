
package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


public class Conexion {
   private final String base ="practicahibernate";
    private final String user ="root";
    private final String password="";
    private final String url="jdbc:mysql://localhost:8080"+base;
    private Connection con=null;
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(this.url,this.user,this.password);
        }catch(SQLException e ){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return con;
    } 
}
