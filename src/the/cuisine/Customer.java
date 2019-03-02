/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

import java.util.Date;

/**
 *
 * @author 1894461
 */
public class Customer extends Person {
    String c_id;
    String type; 
    Order order;
    //constructor
   public Customer(String type, String id, String p_lname, String p_fname, String p_email, Double p_contact){
        super(id, p_lname, p_fname, p_email, p_contact);
        this.type = type;
        this.c_id=createID(id);
        
    }

   public String createID(String id)
    {
      char first=' ';
        char last=' ';
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
            
    //getter
    public String getc_type (){
        return this.type;
    }
    //setter
    public void c_setter(String c_type){
        this.type=c_type;
    }
    //display
    public void c_Display(){
         System.out.println("persone id:"+c_id);
        System.out.println("type:"+ type);
    }
}
