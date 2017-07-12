/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.*;
public class DisplayOrder {
    
    Connection con2=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public ResultSet tableload(String tablename){
        con2=DBconnection.connect();
        String getOrderEntries;
        try
        {
        
            if (tablename.equals("order"))
            {
                getOrderEntries="SELECT * FROM carorder";
            }
            
            else
            {
                getOrderEntries="SELECT * FROM "+tablename;
            }
            
            ps=con2.prepareStatement(getOrderEntries);
            
            rs=ps.executeQuery();
        
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
       return rs;        
    }
    
}
