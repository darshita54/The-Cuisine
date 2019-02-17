/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

/**
 *
 * @author 1895268
 */
public class Person {
    
    double p_id;
    String name;
    String email;
    double contact;
    
    //Constructor
    public void Person(double p_p_id, String p_name, String p_email,Double p_contact)
    {
     this.p_id= p_p_id;
     this.name = p_name;
     this.email = p_email;
     this.contact = p_contact; 
    }
    
    //setter
    public void setp_id(double p_id){
        this.p_id = p_id;
    }
    
    public void setName(String name){
        this.name = name;
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
        return name;
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
       System.out.println("Category Id :"+p_id);
       System.out.println("Category Name :"+name);
       System.out.println("Category Contact Number :"+ contact);
       System.out.println("Category email :"+ email);
   }
}
