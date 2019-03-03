/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

import java.util.Date;

/**
 *
 * @author 1895268
 */
public class Employee extends Person {
    String e_id;
    double salary;
    Order order;
    String fname;
// Constructor

    public Employee(String id, String p_lname, String p_fname, String p_email, double p_contact,double salary) {
        super(id, p_lname, p_fname,  p_email, p_contact);
        this.salary=salary;
   
        e_id=createID(id," "," ");
    }
    
   public static  String createID(String id,String Fname,String Lname)
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
    
// setter
    public void setSalary(double salary){
        this.salary = salary;
    }
    
//getter
    public double getSalary(){
        return salary;   
    }
    
// Functiopn to display 
    public void E_display(){
        System.out.println("Employee id:"+e_id);
        System.out.println("Salary is  :"+salary);
        
    }
}
