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
public class SpadeTest {
    
    public SpadeTest() {
    }
    

    /**
     * Test of toString method, of class Spade.
     */
    //good test
    @Test
    public void testToStringGood() {
        System.out.println("Spade- toString Good Test");
        Spade instance = new Spade (6,"Six");
        String expResult = "Six of Spades";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    //bad test
    @Test
    public void testToStringBad() {
        System.out.println("Spade- toString Bad Test");
        Spade instance = new Spade (0,"");
        String expResult = " of Spades";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    @Test
     public void testToStringBoundry() {
        System.out.println("Spade- toString Boundry Test");
        Spade instance = new Spade (10,"Ten");
        String expResult = "Ten of Spades";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
