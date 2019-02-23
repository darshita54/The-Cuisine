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
        System.out.println("-----------Category----------");
        Category c=new Category(1,"meal","Indian");
        c.C_Display();
       
        //Constructor of Item class
        System.out.println("-----------Item----------");
         Item i=new Item(2,"Samosa", 1.45, 2);
        i.I_Display();
        
         // Constructor of menu class
         System.out.println("-----------Menu----------");
        Date tempdate1=new Date(322019);
        Date tempdate2=new Date(1722019);
        Date tempdate3 = new Date(1012019);
        Menu m=new Menu(1,"chinese","starter",tempdate1,tempdate2);
        m.m_display();
        
        // Constructor of restaurant class
         System.out.println("-----------Restaurant----------");
        Restaurant r=new Restaurant(2,438-888-9999,"The Cusine","312,Avenue Hope","cuisinetaste@gmail.com","www.theCuisine.com");
        r.r_Display();
         
         // Constructor of Person class
        Person p=new Person(1.0,"liliy","abc","abc@gmail.com",1234567.0);
        p.P_Display();
        
         // Constructor of Employee class
        System.out.println("-----------Employee----------");
        Employee e = new Employee(34,"John","cena", "cfg@gmail.com",43278,4563.12);
        e.E_display();
        
        //customer construcotr 
       System.out.println("-----------Customer----------");
        Customer cust = new Customer("Indian",456,"Sachin","Tendulkar","ab@gmail.com",784235.5);
        cust.c_Display();
        
        // Order Constrctor
        System.out.println("-----------Order----------");
        Order od = new Order(12,tempdate3,2.0,15);
        od.o_Display();
        
        
      /*  // logic for id
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MMM-dd");  
        LocalDateTime now = LocalDateTime.now();  
       //  System.out.println(dtf.format(now));
        String fname=p.fname;
        String lname=p.lname;
        char first=fname.charAt(0);
        char last=lname.charAt(0);
        if("".equals(first))
        {
            first='X';
        }
       if("".equals(last))
        {
            last='X';
        }
       String id=dtf.format(now)+"-"+first+last;
       System.out.println("id:"+id);
             */
      
         
    }
    
}
