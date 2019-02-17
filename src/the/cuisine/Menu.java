/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.cuisine;

import java.util.Date;

/**
 *
 * @author 1894434
 */
public class Menu {
    
    int m_id;
    String type,category;
    Date startDate,endDate;
    
    //constructor 
    public Menu(int id,String m_type,String m_category,Date s_date,Date e_date)
    {
      this.m_id=id;
      this.type=m_type;
      this.category=m_category;
      this.startDate=s_date;
      this.endDate=e_date;
    }
    
    //getter method
    public int getID()
    {
      return this.m_id;
    }
    
    
}
