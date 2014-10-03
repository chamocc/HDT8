/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ed. Chamo
 */
public class SimpleSetTest {
    
    public SimpleSetTest() {
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

    /**
     * Test of get method, of class SimpleSet.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = new Word("Buki", "sustantivo");
        SimpleSet instance = new SimpleSet();
        instance.add(word);
        Word expResult = new Word ("Buki", "sustantivo");
        Word result = instance.get(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class SimpleSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = new Word ("Buki","sustantivo");
        SimpleSet instance = new SimpleSet();
        instance.add(wordObject);
        Word expResult = instance.get(wordObject);
        assertEquals(expResult, wordObject);
        
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
