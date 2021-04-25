/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Domenic
 */
public class HeartTest {
    
    public HeartTest() {
    }
    

    /**
     * Test of toString method, of class Heart.
     */
    //good test
    @Test
    public void testToStringGood() {
        System.out.println("Heart toString- Good");
        Heart instance = new Heart (7,"Seven");
        String expResult = "Seven of Hearts";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    //bad Test
    @Test
    public void testToStringBad() {
        System.out.println("Heart toString- Bad");
        Heart instance = new Heart (0,"");
        String expResult = " of Hearts";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    //boundry test
    @Test
    public void testToStringBoundry() {
        System.out.println("Heart toString- Boundry");
        Heart instance = new Heart (10,"Ten");
        String expResult = "Ten of Hearts";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
