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
    //constructor
    public void Customer(String c_type){
        this.type=c_type;
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
