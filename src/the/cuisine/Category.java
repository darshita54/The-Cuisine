/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

/**
 *
 * @author 1894420
 */
public class Category {
    
  int c_id;
  String c_Name,c_Type;
  Menu menu;
    
   
    Category(int C_Id, String C_Name, String C_Type)
   {
       this.c_id=C_Id;
       this.c_Name=C_Name;
       this.c_Type=C_Type;
   }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public void setName(String Name) {
        this.c_Name = Name;
    }

    public void setType(String Type) {
        this.c_Type = Type;
    }

    public double getC_id() {
        return c_id;
    }

    public String getName() {
        return c_Name;
    }

    public String getType() {
        return c_Type;
    }
   
   public void C_Display()
   {
       System.out.println("Category Id :"+c_id);
       System.out.println("Category Name :"+c_Name);
       System.out.println("Category Type :"+c_Type);
   }
}
