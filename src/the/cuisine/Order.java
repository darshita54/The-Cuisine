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
public class Order {
    int id;
    Date date;
    Double quantity;
    int totalAmount;
    Customer customer;
    

  //constructor
  public Order(int o_id,Date o_date,Double o_quantity,int o_totalAmount){
  this.id =o_id;
  this.date =o_date;
  this.quantity =o_quantity;
  this.totalAmount =o_totalAmount;
}

// getter
   public int getid(){
   return this.id;
}   
   public Date getdate(){
   return this.date;
   }
   public Double getquantity(){
   return this.quantity;
   }
   public int gettotalAmount(){
   return this.totalAmount;
   }
   //setter
   
   public void o_setter(int o_id,Date o_date,Double o_quantity,int o_totalAmount){
       this.id = o_id;
       this.date = o_date;
       this.quantity = o_quantity;
       this.totalAmount = o_totalAmount;
       
   }
   //display
   public void o_Display(){
       System.out.println("ORDER id :"+ id);
       System.out.println("ORDER date :"+ date);
       System.out.println("ORDER quantity :"+ quantity);
       System.out.println("ORDER totalAmount :"+ totalAmount);
   }
   
   }
