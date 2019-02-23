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
public final class Item {
    String i_id;
    double i_Price,i_Quantity;
    String i_Name;
   Category category;
   Order order;
    Item(String I_id,String I_Name,double I_Price,double I_Quantity) 
    {
        
        this.i_Name=I_Name;
        this.i_Price=I_Price;
        this.i_Quantity=I_Quantity;
        i_id=createID(I_id);
    }
  public String createID(String id)
    {
      char first=i_Name.charAt(0);
        char last=" ".charAt(0);
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
    public void setI_id(String i_id) {
        this.i_id = i_id;
    }

    public void setI_Name(String i_Name) {
        this.i_Name = i_Name;
    }

    public void setI_Price(double i_Price) {
        this.i_Price = i_Price;
    }

    public void setI_Quantity(double i_Quantity) {
        this.i_Quantity = i_Quantity;
    }

    /**
     *
     * @return
     */
    public String getI_id() {
        return i_id;
    }

    public String getI_Name() {
        return i_Name;
    }

    public double getI_Price() {
        return i_Price;
    }

    public double getI_Quantity() {
        return i_Quantity;
    }
        public void I_Display()
        {
            System.out.println("Item id ="+i_id);
            System.out.println("Item Name="+i_Name);
            System.out.println("Item Price="+i_Price);
            System.out.println("Item Quantity="+i_Quantity);
        }
  
}
