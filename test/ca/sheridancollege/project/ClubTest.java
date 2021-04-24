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
public class ClubTest {
    
    public ClubTest() {
    }
    

    /**
     * Test of toString method, of class Club.
     */
    //Good Test
    @Test
    public void testToStringGood() {
        System.out.println("toString Good Test");
        Club instance = new Club(3,"Three");
        //expected result for the test
        String expResult = "Three of Clubs";
        String result = instance.toString();
        //check if the test has passed
        assertEquals(expResult, result);
    }
    //Bad Test
    @Test
    public void testToStringBad() {
        System.out.println("toString Bad Test");
        Club instance = new Club(11,"Eleven");
        //expected result for the test
        String expResult = "Eleven of Clubs";
        String result = instance.toString();
        //check if the test has passed
        assertEquals(expResult, result);
    }
    
    //boundry Test
    @Test
    public void testToStringBoundry() {
        System.out.println("toString Boundry Test");
        Club instance = new Club(10,"Ten");
        //expected result for the test
        String expResult = "Ten of Clubs";
        String result = instance.toString();
        //check if the test has passed
        assertEquals(expResult, result);
    }
}
