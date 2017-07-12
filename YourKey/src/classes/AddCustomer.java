/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.*;
public class AddCustomer {
    
    public void Add(String cus_name,String NIC,String contactNO,String address)
    {
        Connection con=DBconnection.connect();
        PreparedStatement add=null;
        try
        {
            String addRecord="INSERT INTO customer(FullName,NIC,ContactNO,Address) Values('"+cus_name+"','"+NIC+"','"+contactNO+"','"+address+"')";
        
            add=con.prepareStatement(addRecord);
            
            add.execute();
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
