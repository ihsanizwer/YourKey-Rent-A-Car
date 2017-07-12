
package classes;

import java.sql.*;
import java.util.*;
import java.text.*;
public class Add_Order 
{
    
    Connection con1=null;
    
    int carID;
    int cusID;
    int OrderID;
    
    double amount_per_hour;
    double overdue_rate;
    double refundable_deposit;
    double amount;
    double final_amount;
    String start_date;
    String end_date;
    
    
    public boolean CheckCustomer(String cus_name)
    {
        int cusID=0;
        
        try
        {
            Connection con=DBconnection.connect();
            
            Statement checkCusID=con.createStatement();
      
            String checkCusId="SELECT CustomerID from customer where FullName='"+cus_name+"'";
            
            ResultSet find=checkCusID.executeQuery(checkCusId);
            
            while (find.next())
            {
                cusID=find.getInt("CustomerID");
            }
            
            if (cusID!=0)
            {
                return true;
            }
            
           
            
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean checkCar(String make,String model)
    {
        boolean available=true;
        
        try
        {
            Connection conx=DBconnection.connect();
            
            Statement checkCarID=conx.createStatement();
      
            String checkCarId="SELECT Taken from car where Make='"+make+"' and Model='"+model+"'";
            
            ResultSet find=checkCarID.executeQuery(checkCarId);
            
            while (find.next())
            {
                available=find.getBoolean("Taken");
            }
            
            }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
       return available; 
    }
            
    public void RetrievePrice(String model,String make)
    {
        Connection con1=DBconnection.connect();
        
        try
        {
            Statement get_price=con1.createStatement();
            
            String RetrieveCarID=("SELECT CarID from car where model=('"+model+"') AND make=('"+make+"')");
            
           
            
            ResultSet selectCarID=get_price.executeQuery(RetrieveCarID);
            
            while (selectCarID.next())
            {
                carID=selectCarID.getInt("CarID");
                
            }
            
            String RetrievePrice=("SELECT * from price where CarID=('"+carID+"')");
            
            ResultSet selectPrice=get_price.executeQuery(RetrievePrice);
            
            while (selectPrice.next())
            {
                amount_per_hour=selectPrice.getDouble("AmountPerHour");
                System.out.println(amount_per_hour);
                overdue_rate=selectPrice.getDouble("Overdue");
                System.out.println(overdue_rate);
                refundable_deposit=selectPrice.getDouble("Refundable");
                System.out.println(refundable_deposit);
            }
            
        }    
              
        catch(Exception e)
        {     
            System.out.println(e);         
        }
    }
    
    public void CalculateAmount(String day,String startHours,String startMinutes,String endHours,String endMinutes)
    {
        double NoOfHours;
         
        double startHour=Double.parseDouble(startHours);
        double startMinute=Double.parseDouble(startMinutes);
       
         
        double endHour=Double.parseDouble(endHours);
        double endMinute=Double.parseDouble(endMinutes);
         
        start_date=day+" "+startHours+":"+startMinutes;
        end_date=day+" "+endHours+":"+endMinutes;
         
         
        if ((startMinute==30.0 & endMinute==30.0) | (startMinute==0.0 & endMinute==0.0)) 
        {
            NoOfHours=endHour-startHour;
            amount=NoOfHours*amount_per_hour;
            System.out.println(amount);
        }
         
        else
        {
            if (startMinutes.equals("30"))
            {
                NoOfHours=(startHour-endHour)-1;
                 
                amount=NoOfHours*amount_per_hour+amount_per_hour/2;
                 
            }
             
            else
            {
                NoOfHours=startHour-endHour;
                 
                amount=NoOfHours*amount_per_hour+amount_per_hour/2;
            }
        }
         
        final_amount=amount+refundable_deposit;
        System.out.println("f"+final_amount);
    }
    
    
    public void CalculateAmount(String start_year,String start_month,String start_day,String end_year,String end_month,String end_day)
    {
        start_date=start_year+"/"+start_month+"/"+start_day;
        end_date=end_year+"/"+end_month+"/"+end_day;
        double rate_per_day=amount_per_hour*20.0;
        
        double RentedDays;
        double NoOfMonths;
        double MonthstoDays;
        double NoOfYears;
        
        
        double startYear=Double.parseDouble(start_year);
        Double startMonth=Double.parseDouble(start_month);
        Double startDay=Double.parseDouble(start_day);
        
        Double endYear=Double.parseDouble(end_year);
        Double endMonth=Double.parseDouble(end_month);
        Double endDay=Double.parseDouble(end_day);
        
        if ((startYear==endYear) & (startMonth==endMonth))
        {
            RentedDays=endDay-startDay;
        }
        
        else if (startYear==endYear)
        {
            NoOfMonths=endMonth-startMonth;
            
            MonthstoDays=NoOfMonths*30+endDay;
            
            RentedDays=MonthstoDays-startDay;
        }
        
        else
        {
            NoOfYears=endYear-startYear;
            
            NoOfMonths=NoOfYears*12+endMonth;
            
            MonthstoDays=NoOfMonths*30+endDay;
            
            RentedDays=MonthstoDays-startDay;
        }
        
        amount=RentedDays*rate_per_day;
        
        final_amount=amount+refundable_deposit;
    }
     
    public void insertFinalValues()
    {
        Connection con2=DBconnection.connect();
        PreparedStatement addFinalAmount;
        
        java.util.Date currentDate;
        currentDate = new java.util.Date();
        
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String OrderedDate = formatter.format(currentDate);
        
        
         try
        {
            String InsertFinalValues="INSERT INTO carorder(OrderedDateOrTime,DeliveredDateOrTime,ReturnDateOrTime,FinalAmount) values('"+OrderedDate+"','"+start_date+"','"+end_date+"',"+final_amount+")";
            addFinalAmount=con2.prepareStatement(InsertFinalValues);
            addFinalAmount.execute();
        }
         
        catch(Exception e)
        {
            System.out.println(e);
        }
         
         
    }
    
    public void AddRentRecord(String Cus_name)
    {
        Connection con3=DBconnection.connect();
        
        try
        {
            Statement getCus_ID=con3.createStatement();
            PreparedStatement addRecord=null;
        
            String findID="SELECT CustomerID from customer where FullName='"+Cus_name+"'";
            
            ResultSet getID=getCus_ID.executeQuery(findID);
            
            while (getID.next())
            {
               cusID=getID.getInt("CustomerID");
            }
            
            String findOrder="SELECT OrderID from carorder";
            
            ResultSet getOrder=getCus_ID.executeQuery(findOrder);
            
            while (getOrder.next())
            {
                OrderID=getOrder.getInt("OrderID");
            }
            
            String addRent="INSERT INTO rent VALUES ("+cusID+","+carID+","+OrderID+")";
            
            addRecord=con3.prepareStatement(addRent);
            
            addRecord.execute();
        }
            catch(Exception e)
            {
                System.out.println(e);
            }
                    
        }
        
    }
    
    

