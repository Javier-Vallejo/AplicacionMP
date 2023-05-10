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
public class DebilidadTest {
    
    public DebilidadTest() {
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
     * Test of debilitar method, of class Debilidad.
     */
    @Test
    public void testDebilitar() {
        System.out.println("debilitar");
        Debilidad instance = new Debilidad("debilidad1", 10);
        int expResult = 10;
        int result = instance.debilitar();
        assertEquals(expResult, result);
    }
    
}
