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
    
   String c_id;
  String c_Name,c_Type;
  Menu menu;
  
   
    Category(String C_Id, String C_Name, String C_Type)
   {
      
       this.c_Name=C_Name.toUpperCase();
       this.c_Type=C_Type.toUpperCase();
       c_id=createID(C_Id);
   }
    public String createID(String id)
    {
      char first=c_Name.charAt(0);
        char last=c_Type.charAt(0);
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

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public void setName(String Name) {
        this.c_Name = Name;
    }

    public void setType(String Type) {
        this.c_Type = Type;
    }

    public String getC_id() {
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
