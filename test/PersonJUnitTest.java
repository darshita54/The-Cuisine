/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
public class PersonJUnitTest {
    
    public PersonJUnitTest() {
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
    public void testPersonID()
    {
     System.out.println("Test for person ID");
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MMM-dd");  
        LocalDateTime now = LocalDateTime.now(); 
        String date=dtf.format(now);
        String fname="S";
        String lname="X";
        String expectedResult="19-Mar-03-SX";
        String result=Person.createPersonID(date,fname,lname);
        
         assertEquals(expectedResult, result);
        
        
     
    }
}
