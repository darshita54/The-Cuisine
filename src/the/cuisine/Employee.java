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
public class Employee extends Person {
    double salary;
    Order order;
// Constructor

    public Employee(double p_p_id, String p_name, String p_email, double p_contact,double salary) {
        super(p_p_id, p_name, p_email, p_contact);
        this.salary=salary;
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
        System.out.println("Salary is  :"+salary);
    }
}
