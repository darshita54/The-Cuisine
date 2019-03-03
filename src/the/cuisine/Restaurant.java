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
public final class Restaurant {
    
    int contact;
    String r_id;
    String name,address,email,website;
    
    //constructor
    public Restaurant(String id,int r_contact,String r_name,String r_address,String r_email,String r_website)
    {
     
     this.contact=r_contact;
     this.name=r_name;
     this.address=r_address;
     this.email=r_email;
     this.website=r_website;
     r_id=createID(id,name,address);
    }

   public static String createID(String id,String name,String address)
    {
      char first=name.charAt(0);
        char last=address.charAt(0);
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
    
    
    //getter method
    public String getR_ID()
    {
     return this.r_id;
    }
    public int getContact()
    {
     return this.contact;
    }
    public String getName()
    {
     return this.name;
    }
    public String getAddress()
    {
     return this.address;
    }
    public String getEmail()
    {
     return this.email;
    }
    public String getWebsite()
    {
     return this.website;
    }
    
    //setter method
    public void r_Setter(String id,int r_contact,String r_name,String r_address,String r_email,String r_website)
    {
     this.r_id=id;
     this.contact=r_contact;
     this.name=r_name;
     this.address=r_address;
     this.email=r_email;
     this.website=r_website;
    }
    
    //id for restaurant
    
    
    
    //display method
    public void r_Display()
    {
     System.out.println("Restaurant id: "+r_id);
     System.out.println("Restaurant contact Number: "+contact);
     System.out.println("Restaurant name: "+name);
     System.out.println("Restaurant address: "+address);
     System.out.println("Restaurant email: "+email);
     System.out.println("Restaurant website: "+website);
    }
}

