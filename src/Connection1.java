import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Connection1 {
    static Connection con;
    public static Connection createConnection(){
    
      try {
            Class.forName("com.mysql.jdbc.Driver");
      }  
      catch (ClassNotFoundException ex) {
      Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
      }
        try {
            //con = DriverManager.getConnection(string)
             con =  DriverManager.getConnection("jdbc:mysql://localhost/feeosh", "root", "");
        } 
        catch(SQLException ex) {
        Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
      
    }
    
    
}
