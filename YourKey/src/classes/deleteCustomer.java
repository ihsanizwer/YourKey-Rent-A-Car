/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class deleteCustomer {
    Connection con=DBconnection.connect();
    public boolean search(String cus_name)
    {
        int CarID;
        try
        {
            Statement search=con.createStatement();
        
            String checkRecord="SELECT CustomerID from customer where FullName='"+cus_name+"'";
        
            ResultSet checkCarID=search.executeQuery(checkRecord);
            
            while (checkCarID.next())
            {
                CarID=checkCarID.getInt("CustomerID");
                return true;
            }
        
        
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }
    public void delete(String cus_name)
    {
        
        
        PreparedStatement delete=null;
        
        try
        {
            String Delete="DELETE FROM customer where FullName='"+cus_name+"'";
            
            delete=con.prepareStatement(Delete);
            
            delete.execute();
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
