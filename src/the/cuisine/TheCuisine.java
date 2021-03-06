/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author 1894420
 */
public class TheCuisine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Constructor of Category class
              
        //date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MMM-dd");  
        LocalDateTime now = LocalDateTime.now(); 
        String date=dtf.format(now);
            
        System.out.println("-----------Category----------");
        Category c=new Category(date,"meal","Indian");
        c.C_Display();
       
        //Constructor of Item class
        System.out.println("-----------Item----------");
         Item i=new Item(date,"Samosa", 1.45, 2);
        i.I_Display();
        
         // Constructor of menu class
         System.out.println("-----------Menu----------");
        Date tempdate1=new Date(322019);
        Date tempdate2=new Date(1722019);
        Date tempdate3 = new Date(1012019);
        Menu m=new Menu(date,"chinese","starter",tempdate1,tempdate2);
        m.m_display();
        
        // Constructor of restaurant class
         System.out.println("-----------Restaurant----------");
        Restaurant r=new Restaurant(date,438-888-9999,"The Cusine","312,Avenue Hope","cuisinetaste@gmail.com","www.theCuisine.com");
        r.r_Display();
         
         // Constructor of Person class
        
         System.out.println("-----------Person----------");
        Person p=new Person(date," ","abc ","abc@gmail.com",1234567.0);
        p.P_Display();
        
         // Constructor of Employee class
        System.out.println("-----------Employee----------");
        Employee e = new Employee(date,"John","cena", "cfg@gmail.com",43278,4563.12);
        e.E_display();
        
        //customer construcotr 
       System.out.println("-----------Customer----------");
        Customer cust = new Customer(date,"Indian","Sachin","Tendulkar","ab@gmail.com",784235.5);
        cust.c_Display();
        
        // Order Constrctor
        System.out.println("-----------Order----------");
        Order od = new Order(date,tempdate3,2.0,15);
        od.o_Display();
                
    }
    
}
