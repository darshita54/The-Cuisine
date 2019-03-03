/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import the.cuisine.Person;

/**
 *
 * @author 1894434
 */
public class MenuJUnitTest {
    
    public MenuJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void testMenuID()
    {
     System.out.println("Test for Menu ID");
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MMM-dd");  
        LocalDateTime now = LocalDateTime.now(); 
        String date=dtf.format(now);
        String fname="C";
        String lname="S";
        String expectedResult="19-Mar-03-CS";
        String result=Person.createPersonID(date,fname,lname);
        
         assertEquals(expectedResult, result);
        
        
     
    }
}
