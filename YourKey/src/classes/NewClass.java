/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
public class NewClass {
    
    public static void main(String args[])
    {
       
        /**Date x=ValidateDateorTime.ConvertStringtoDate("2016", "11", "08");
        
        Date y=ValidateDateorTime.ConvertStringtoDate("2016", "11", "09");
        
        ValidateDateorTime z=new ValidateDateorTime();
        
        z.setTimes(x, y);
        
        boolean o=z.validateTime();
        
        System.out.println(o);*/
        
        Add_Order s=new Add_Order();
       
        /**s.RetrievePrice("CR-Z", "Honda");
        s.AddRentRecord("fsfsf");*/
        
       String str="2017/01/01";
       
       
       
       System.out.println(str.length());
       
       
        
      
        /**Connection con=DBconnection.connect();
        int lastid=0;
        
        try 
        {
        
        String sql=("SELECT max(CarID) FROM car");
        
        Statement st=con.createStatement();

        ResultSet rs=st.executeQuery(sql);
        
        //while (rs.next())
        //{
            lastid= rs.getInt("CarID");
        //}
} 
catch (Exception e) {
 
           System.out.println(e);
    
    }

 System.out.println(lastid);
        
        /**Date currentDate= new java.util.Date();
        java.util.Date convertedDateTime=null;
        
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
         
        try
        {
            convertedDateTime=formatter.parse("2011/11/07");
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
       if (currentDate.after(convertedDateTime))
       {
           String x="2011/11/07 14:30";
           System.out.println("yes");
           System.out.println(x.substring(11,13));**/
       }
                
    }
    
    

        

