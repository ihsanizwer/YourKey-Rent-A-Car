/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import DBCon.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Ihsan Izwer
 */
public class ValidateMe {
    
    public ValidateMe(String username, String password, String name, String permissions){
        if(isValidUsername(username) & isValidName(name) & isValidPassword(password) & isValidPermission(permissions)){
            this.adduser = true;
        }
        
    }
    
    public ValidateMe(){
    
    }
    
    private boolean adduser = false;
    DBConnection db = null;
    
    public boolean isExistingUsername(String username){
        String un = "";
        db = new DBConnection("SELECT username FROM users WHERE username LIKE '"+username+"'", 1);
        ResultSet rs = db.getRS();
        
        try{
            while(rs.next()){
                un = rs.getNString("username");
            }
            db.closeCon();
        }catch(SQLException e){
            System.out.println("Exception caught "+e);
        }
        if(un.equals(username)){
            return true;
        }else{
            return false;
        }
    }
    public boolean isValidUsername(String username){
        if(username.equals("") | username.equals(null)){
            JOptionPane.showMessageDialog(null, "Cannot have username field empty!");
            return false;
        }
        
        for(int i =0;i<username.length();i++){
            if(Character.isWhitespace(username.charAt(i)) | !(Character.isAlphabetic(username.charAt(i)) | Character.isDigit(username.charAt(i)))){
                JOptionPane.showMessageDialog(null, "You cannot have space characters or special characters in the username!");
                return false;
            }
        }
        if(isExistingUsername(username)){
            JOptionPane.showMessageDialog(null, "The username you entered already exists. Please enter another one.");
            return false;
        }else{
            if(username.length()<5){
                JOptionPane.showMessageDialog(null, "Username cannot be less than 5 characters");
                return false;
            }else  if(username.length()>20){
                JOptionPane.showMessageDialog(null, "Username should be 20 characters at most!");
                return false;
            }
            else{
            return true;
            }
        }
    }
    public boolean isValidPassword(String password){
        if(password.length()<8){
            JOptionPane.showMessageDialog(null, "Password should be at least 8 characters");
            return false;
        }else if(password.length()>36){
            JOptionPane.showMessageDialog(null, "Password should be at most 36 characters");
            return false;
        }else{
            return true;
        }
    }
    
    public boolean isValidName(String name){
        if(name.equals("") | name.equals(null)){
            JOptionPane.showMessageDialog(null, "Cannot have name feild empty!");
            return false;
        }
        for(int i = 0; i<name.length();i++){
            if(!(Character.isAlphabetic(name.charAt(i)) | Character.isSpaceChar(name.charAt(i)) | name.charAt(i)=='.')){
                JOptionPane.showMessageDialog(null, "Name can contain only alphabetic characters, space characters or '.'");
                return false;
            }
        }
        if(name.length()<2 | name.length()>36){
            JOptionPane.showMessageDialog(null, "Name should be at least 2 characters and at mmost 36 characters long.");
            return false;
        }else{
            return true;
        }
    }
    
    public boolean isValidPermission(String permissions){
        if(permissions.equals("") | permissions.equals(null)){
            JOptionPane.showMessageDialog(null, "Cannot have permissionsAA feild empty!");
            return false;
        }
        
        if(!(permissions.equals("admin") | permissions.equals("receptionist") | permissions.equals("manager"))){
            JOptionPane.showMessageDialog(null, "The permission feild should contain only one of 'admin', 'manager' or 'receptionist'");
            return false;
        }else{
            return true;
        }
    }

    public boolean isValidAdduser() {
        return adduser;
    }
    
    public boolean isValidNoSeats(String str){
        if(!(str.length()==0)){
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i)))
                return false;
        }
        int num = Integer.parseInt(str);
        if(num>12){
            JOptionPane.showMessageDialog(null, "The maximum number of seats is 12");
            return false;
        }else{
            return true;
        }
        
        }else{
            return false;
        }
    }
    
}
