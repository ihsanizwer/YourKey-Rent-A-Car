
package classes;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
public class Accept_return 
{
    
    Connection con2=null;
    int CustomerID;
    int CarID;
    int orderID;
    double FinalAmount;
    double overdue_rate;
    double overdue_amount;
    double refund;
    java.util.Date currentDate;
    String return_date_time;
    java.util.Date convertedDateTime;
   
    
    public void getRentAndCarID(String customerName)
    {
       con2=DBconnection.connect();
       
       
       
       try
       {
           Statement getRentId;
           getRentId=con2.createStatement();
           
           String getCustomerId=("SELECT CustomerID from customer where FullName='"+customerName+"'");
           
           ResultSet selectCustomerId=getRentId.executeQuery(getCustomerId);
           
           while (selectCustomerId.next())
           {
               CustomerID=selectCustomerId.getInt("CustomerID");
           }
           
            String getOrderID=("SELECT OrderID from rent where CustomerID='"+CustomerID+"'");
           
           ResultSet selectOrderID=getRentId.executeQuery(getOrderID);
           
           while (selectOrderID.next())
           {
               orderID=selectOrderID.getInt("OrderID");
             
           }
           String getCarID=("SELECT CarID from rent where OrderID='"+orderID+"'");
           
           ResultSet selectCarID=getRentId.executeQuery(getCarID);
           
           while (selectCarID.next())
           {
               CarID=selectCarID.getInt("CarID");
             
           }
           
           
           
       }
       
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
    
    public void setPrices()
    {
        try
        {
            Statement getPrices;
        
            getPrices=con2.createStatement();
        
            String getAmount=("SELECT FinalAmount,ReturnDateOrTime from carorder where OrderID='"+orderID+"'");
        
            ResultSet selectAmount=getPrices.executeQuery(getAmount);
        
                while (selectAmount.next())
                {   
                    FinalAmount=selectAmount.getDouble("FinalAmount");
                    return_date_time=selectAmount.getString("ReturnDateOrTime");
                }
        
            String getOverdueRate=("SELECT Overdue,Refundable from price where CarID='"+CarID+"'");
            
            ResultSet getOverdue=getPrices.executeQuery(getOverdueRate);
            
                while (getOverdue.next())
                {
                    overdue_rate=getOverdue.getDouble("Overdue");
                    refund=getOverdue.getDouble("Refundable");
                }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    
    public boolean checkforOverdue()
    {
        currentDate= new java.util.Date();
        convertedDateTime=null;
        
        if (return_date_time.length()==10)
        {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
         
            try
            {
                convertedDateTime=formatter.parse(return_date_time);
            }
        
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        else
        {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm");
         
            try
            {
                convertedDateTime=formatter.parse(return_date_time);
            }
        
            catch(Exception e)
            {
                System.out.println(e);
            }  
        }
        
            
       return currentDate.after(convertedDateTime);
         
    }     
         
    public double calculateOverdue()
    {
        double overdue_rate_per_day=overdue_rate*20;
        
        if (return_date_time.length()==10)
        {
           
           DateFormat df2=new SimpleDateFormat("YYYY");
           DateFormat df1=new SimpleDateFormat("DD");
           
           String totalDaysPassed=df1.format(currentDate);
           
           String totalDaysPayedFor=df1.format(convertedDateTime);
           
           int TDP=Integer.parseInt(totalDaysPassed);
           
           int TDPF=Integer.parseInt(totalDaysPayedFor);
           
           String currentYear=df2.format(currentDate);
           
           String orderedYear=return_date_time.substring(0,4);
           
                if (currentYear.equals("orderedYear"))
                {
                    overdue_amount=(TDP-TDPF)*overdue_rate_per_day;
           
                    return overdue_amount;
                }
           
                else
                {
                    int CY=Integer.parseInt(currentYear);
               
                    int RY=Integer.parseInt(orderedYear);
               
                    int passedYears=CY-RY;
               
                    int passedDays=((passedYears*365)+TDP)-TDPF;
               
                    overdue_amount=passedDays*overdue_rate_per_day;
               
                    return overdue_amount;
           }
        }
        
        else
        {
                 DateFormat df3=new SimpleDateFormat("hh");
                 String hoursPassed=df3.format(currentDate);
                 
                 String hoursPayed=df3.format(convertedDateTime);
                 
                 int Hpassed=(Integer.parseInt(hoursPassed));
                 
                 int Hpayed=Integer.parseInt(hoursPayed);
                 
                 int ExtraHoursRented=Hpassed-Hpayed;
                 
                 overdue_amount=ExtraHoursRented*overdue_rate;
                 
                 return overdue_amount;
            }
            
            
        }
    
    public double setFinalAmount()
    {
        return FinalAmount+overdue_amount;
    }
    
    public double refund(String damaged_compensation)
    {
        float damaged=Float.parseFloat(damaged_compensation);
        
        return refund-damaged;
    }
       
     public void InsertPayment(int payment)
    {
        try
        {
        Connection con4=DBconnection.connect();
        
        String InsertPayment="UPDATE carorder payment="+payment+" where OrderID="+orderID+"";
        
        PreparedStatement insert=null;
        
        insert=con4.prepareStatement(InsertPayment);
        
        insert.execute();
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
    }  
    }   
           
           
           
       
       
    
    

