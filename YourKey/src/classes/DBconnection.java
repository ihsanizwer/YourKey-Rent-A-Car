
package classes;

/**
 *
 * @author Kashif Roshen
 */
import java.sql.*;

public class DBconnection {
    
    public static Connection connect()
    {
        Connection con=null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carr?autoReconnect=true&useSSL=false", "root", "");
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
    
    
}
