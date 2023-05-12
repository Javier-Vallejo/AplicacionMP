/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juana
 */
public class FortalezaTest {
    
    public FortalezaTest() {
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
     * Test of Fortalecer method, of class Fortaleza.
     */
    @Test
    public void testFortalecer() {
        System.out.println("Fortalecer");
        Fortaleza instance = new Fortaleza("EstarCachas", 2);
        int expResult = 2;
        int result = instance.Fortalecer();
        assertEquals(expResult, result);
    }
    
}
