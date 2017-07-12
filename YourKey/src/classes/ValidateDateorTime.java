
package classes;

import java.text.*;
import java.time.format.*;
import java.util.*;

public class ValidateDateorTime
{
    
    boolean valid=true;
    
    Date ordered_date;
    Date return_date;
    
    Date ordered_time;
    Date return_time;
    Date ordered_date_by_time;
    
    
    public static Date ConvertStringtoDate(String year,String month,String day)
    {
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
    
        String date = year+"/"+month+"/"+day;
    
        Date convertedDate = null;
         
        try  
        {   
            convertedDate = formatter.parse(date);
        }                    
                           
        catch (ParseException e) 
        {                     
            System.out.println(e);
        }           
    
    return convertedDate;
}
    
    public static Date convertStringtoTime(String year,String month,String day,String hours,String minutes)
    {
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        
        String time=year+"/"+month+"/"+day+" "+hours+":"+minutes;
        
        Date convertedTime=null;
        
        try 
        {
            convertedTime=formatter.parse(time);
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return convertedTime;
    }
    
    public void setDates(Date start_date,Date end_date)
    {
        ordered_date=start_date;
        return_date=end_date;
        
    }
    
    public void setTimes(Date start_time,Date end_time)
    {
        ordered_time=start_time;
        return_time=end_time;
    }
    
    public boolean validateDates()
    {
        Date currentDate= new Date();
        
        
        if (ordered_date.after(return_date))
        {
            
            return false;
        }           
                      
        else if (ordered_date.before(currentDate))
        {               
             
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
    
    public boolean validateTime()
    {
        Date currentDate= new Date();
        
        if (ordered_time.before(currentDate))
        {
            valid=false;
            return false;
        }
       
        else if (ordered_time.after(return_time))
        {
            valid=false;
            return false;
        }
   
        else
        {
           return true; 
        }
         
    }
    }
    

