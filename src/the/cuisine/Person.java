/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author 1895268
 */
public class Person {
    
    double p_id;
    String fname;
    String lname;
   // Date date;
    String email;
    double contact;
    
    //Constructor
    public Person(double p_p_id, String p_lname, String p_fname, String p_email,Double p_contact)
    {
        
     this.p_id= p_p_id;
     this.lname = p_lname;
     this.fname=p_fname;
     this.email = p_email;
     this.contact = p_contact; 
    }
    
    //setter
    public void setp_id(double p_id){
        this.p_id = p_id;
    }
    
    public void setName(String name){
        this.fname = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public void setContact(double contact){
        this.contact = contact;
    }
    
    //getter
    
    public double getp_id(){
        return p_id;
    }
    
    public String getName(){
        return fname;
    }
    
    public String email(){
        return email;
    }
    
    public double contact(){
        return contact;
    }
    
    /**
     * Function to Display 
     */
    public void P_Display()
   {
       System.out.println("Person Id :"+p_id);
       System.out.println("Person Name :"+fname);
       System.out.println("Person Contact Number :"+ contact);
       System.out.println("Person email :"+ email);
   }
}
