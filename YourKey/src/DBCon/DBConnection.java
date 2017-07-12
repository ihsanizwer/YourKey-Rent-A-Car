/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCon;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed Ihsan Izwer
 */
public class DBConnection {
    
    public DBConnection(String query, int type){
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carr?autoReconnect=true&useSSL=false", "root", "");
            Statement s1 = con.createStatement();
            if(type==1){
                this.rs = s1.executeQuery(query);
            }else{
                s1.executeUpdate(query);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public DBConnection(){
    
    }
    
    private ResultSet rs = null;
    Connection con = null;
    
    public boolean isValidLogin(String user, String pass){
        
        
        Connection con = null;
        String ps ="";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carr?autoReconnect=true&useSSL=false", "root", "");            
            Statement stat = con.createStatement();           
            String query = "SELECT password FROM users WHERE username LIKE '"+user+"'" ;           
            ResultSet p = stat.executeQuery(query);                                    
            while(p.next()){
               ps = p.getNString("password");
            }
            con.close();
            if(ps.equals(pass) && (!pass.equals(""))){
                return true;
            }
            else{
                return false;
            }
            
        }catch(Exception e){        
            System.out.println(" Exception caught"+ e);         
        }
        return false;
        }
    
        public String getUser(String username){
            Connection con = null;
            String per = null;
            try{
                
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carr?autoReconnect=true&useSSL=false", "root", "");
            Statement stat = con.createStatement();
            String query = "SELECT permissions FROM users WHERE username LIKE '"+username+"'" ;
            ResultSet p = stat.executeQuery(query);
            while(p.next()){
                per = p.getNString("permissions");
            }
            if(!(per.equals("") || per.equals(null))){
                return per;
            }
            con.close();
            }catch(Exception e){
                System.out.println("Exception caught in method 2" + e);
            }
            
            return "";
        }
        
        public boolean addUser(String username, String password, String name, String permissions){
            Connection con = null;
            String per = null;
            try{
                
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carr?autoReconnect=true&useSSL=false", "root", "");
            Statement stat = con.createStatement();
            String query = "INSERT INTO users VALUES('"+username+"','"+password+"','"+name+"','"+permissions+"');" ;
            stat.executeUpdate(query);
            con.close();
            return true;
     
           }catch(Exception e){
           
           JOptionPane.showMessageDialog(null, "Couldn't Add user because "+e.getMessage());
        }
        return false;
        }

    public ResultSet getRS() {
        return rs;
    }
        
    public void closeCon(){
        try {
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    }

