/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

/**
 *
 * @author 1894461
 */
public class Customer extends Person {
    String type; 
    Order order;
    //constructor
   public Customer(String type, Order order, double p_p_id, String p_name, String p_email, Double p_contact){
        super(p_p_id, p_name, p_email, p_contact);
        this.type = type;
    }

   
    //getter
    public String getc_type(){
        return this.type;
    }
    //setter
    public void c_setter(String c_type){
        this.type=c_type;
    }
    //display
    public void c_Display(){
        System.out.println("type:"+ type);
    }
}
