/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

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
        
        Category c=new Category(1,"meal","Indian");
        c.C_Display();
        
        
        
        
        
        
        // Constructor of menu class
        Date tempdate1=new Date(322019);
        Date tempdate2=new Date(1722019);
        Menu m=new Menu(1,"chinese","starter",tempdate1,tempdate2);
        m.m_display();
        
        // Constructor of restaurant class
        Restaurant r=new Restaurant(2,438-888-9999,"The Cusine","312,Avenue Hope","cuisinetaste@gmail.com","www.theCuisine.com");
        r.r_Display();
                
    }
    
}
