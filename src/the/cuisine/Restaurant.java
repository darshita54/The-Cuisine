/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

/**
 *
 * @author 1894434
 */
public class Restaurant {
    
    int r_id,contact;
    String name,address,email,website;
    
    //constructor
    public Restaurant(int id,int r_contact,String r_name,String r_address,String r_email,String r_website)
    {
     this.r_id=id;
     this.contact=r_contact;
     this.name=r_name;
     this.address=r_address;
     this.email=r_email;
     this.website=r_website;
    }
}
