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
    
   static String p_id;
   static String fname;
   static String lname;
    static char last;
   // Date date;
    String email;
    double contact;
    
    //Constructor
    public Person(String id, String p_lname, String p_fname, String p_email,Double p_contact)
    {
        
    
     this.lname = p_lname.toUpperCase();
     this.fname=p_fname.toUpperCase();
     this.email = p_email;
     this.contact = p_contact;      
      p_id=createPersonID(id);
    }
    
    public static String createPersonID(String id)
    {
      char first;
       first = fname.charAt(0);
        last=lname.charAt(0);
        if(first==' ')
        {
            first='X';
        }
       if(last==' ')
        {
            last='X';
        }
      String id1=id+"-"+first+last;
       return id1;
    }

    //setter
    public void setp_id(String p_id){
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
    
    public String getp_id(){
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
