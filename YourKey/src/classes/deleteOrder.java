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


public class deleteOrder {
    
    public void delete(String cus_name,String model,String make)
    {
        int CusId=0;
        int cId=0;
        int Oid=0;
        try
        {
            Connection con=DBconnection.connect();
            
            Statement find=con.createStatement();
            Statement find1=con.createStatement();
             Statement find2=con.createStatement();
            PreparedStatement delete=null;
            
            String getCusID="SELECT CustomerID from customer where FullName='"+cus_name+"'";
            
            ResultSet findCusID=find.executeQuery(getCusID);
            
            while (findCusID.next())
            {
                CusId=findCusID.getInt("CustomerID");
            }
            String getCarID="SELECT carID from car where model='"+model+"' AND make='"+make+"'";
            
            ResultSet findCarID=find1.executeQuery(getCarID);
            
            while (findCarID.next())
            {
                cId=findCusID.getInt("CarID");
            }
            
            String getOID="SELECT OrderID from rent where CustomerID="+CusId+" AND CarID="+cId+"";
            
            ResultSet findOrder=find2.executeQuery(getOID);
            
            while (findOrder.next())
            {
                Oid=findOrder.getInt("OrderId");
            }
            
            String Delete="DELETE FROM carorder WHERE OrderID="+Oid+"";
            
            delete=con.prepareStatement(Delete);
            
            delete.executeQuery();
            
            
            
            
        }
        
        catch(Exception e)
        {
            
        }
    }
    
}
