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
public class SplayTreeSetTest {
    
    public SplayTreeSetTest() {
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
     * Test of add method, of class SplayTreeSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = new Word ("Buki","sustantivo");
        SplayTreeSet instance = new SplayTreeSet();
        instance.add(wordObject);
        Word expResult = instance.get(wordObject);
        assertEquals(expResult, wordObject);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of get method, of class SplayTreeSet.
     */
    @Test
    public void testGet() {
        System.out.println("add");
        Word wordObject = new Word ("Buki","sustantivo");
        SplayTreeSet instance = new SplayTreeSet();
        instance.add(wordObject);
        Word expResult = instance.get(wordObject);
        assertEquals(expResult, wordObject);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
