
package carrental;

import java.sql.*;
import java.sql.Connection;
import java.util.Arrays;

public class DB_Con {

    public static Connection connect()
            
    {
      Connection conn=null;
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/carr?autoReconnect=true&useSSL=false", "root", "");
          
          if (conn!=null)
          {
              System.out.println("Successfull");
          }
      }
      
      catch(Exception e)
      {
          System.out.println("Fail");
          System.out.println(e.getMessage());
      }
     return conn;
}
    
}
