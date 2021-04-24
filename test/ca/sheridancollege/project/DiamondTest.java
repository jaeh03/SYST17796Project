/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Domenic
 */
public class DiamondTest {
    
    public DiamondTest() {
    }
    
    /**
     * Test of toString method, of class Diamond.
     */
    //good test
    @Test
    public void testToStringGood() {
        System.out.println("Diamond toString- Good Test");
        Diamond instance = new Diamond (1,"One");
        String expResult = "One of Diamonds";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
        @Test
    public void testToStringBad() {
        System.out.println("Diamond toString- Bad Test");
        Diamond instance = new Diamond (0,"");
        String expResult = " of Diamonds";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
        @Test
    public void testToStringBoundry() {
        System.out.println("Diamond toString- Boundry Test");
        Diamond instance = new Diamond (10,"Ten");
        String expResult = "Ten of Diamonds";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
