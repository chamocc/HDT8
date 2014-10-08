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
public class TreeMapSetTest {
    
    public TreeMapSetTest() {
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
     * Test of add method, of class TreeMapSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = new Word ("Buki","sustantivo");
        TreeMapSet instance = new TreeMapSet();
        instance.add(wordObject);
        Word expResult = instance.get(wordObject);
        assertEquals(expResult, wordObject);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of get method, of class HashMapSet.
     */
    @Test
    public void testGet() {
        System.out.println("add");
        Word wordObject = new Word ("Buki","sustantivo");
        TreeMapSet instance = new TreeMapSet();
        instance.add(wordObject);
        Word expResult = instance.get(wordObject);
        assertEquals(expResult, wordObject);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
