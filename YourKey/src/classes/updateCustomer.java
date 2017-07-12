/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.sql.*;
public class updateCustomer {
    
    Connection con=DBconnection.connect();
    PreparedStatement update=null;
    int ID;
    
    public boolean checkRecord(String cus_name)
    {
        int ID=0;
        
        try
        {
        Statement selectID=con.createStatement();
        
        String getID="Select CustomerID from customer where FullName='"+cus_name+"'";
        
        ResultSet findID=selectID.executeQuery(getID);
        
        while(findID.next())
        {
            ID=findID.getInt("CustomerID");
        }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        if (ID!=0)
        {
            return true;
        }
        
        return false;
    }
    public void update(String cus_name,String cno,String adrss)
    {
        try
        {
            
        Statement getID=con.createStatement();
        String getCus_Id="Select CustomerID from customer where FullName='"+cus_name+"'";
        
        update=con.prepareStatement(getCus_Id);
        
        ResultSet findID=getID.executeQuery(getCus_Id);
        
        while (findID.next())
        {
            ID=findID.getInt("CustomerID");
        }
        
        String updateValues="UPDATE customer SET ContactNO='"+cno+"',address='"+adrss+"' where CustomerID='"+ID+"'";
        
        update=con.prepareStatement(updateValues);
        
        update.execute();

        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
