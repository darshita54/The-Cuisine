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
    
    double c_id;
    String Name,Type;
    
   public void C_category(double C_Id, String C_Name, String C_Type)
   {
       this.c_id=C_Id;
       this.Name=C_Name;
       this.Type=C_Type;
   }

    public void setC_id(double c_id) {
        this.c_id = c_id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public double getC_id() {
        return c_id;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }
   
   public void C_Display()
   {
       System.out.println("Category Id :"+c_id);
       System.out.println("Category Name :"+Name);
       System.out.println("Category Type :"+Type);
   }
}
