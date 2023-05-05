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
public class CazadorTest {
    
    public CazadorTest() {
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
     * Test of clonar method, of class Cazador.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Cazador instance = null;
        Personaje expResult = null;
        Personaje result = instance.clonar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoDanio method, of class Cazador.
     */
    @Test
    public void testCalculoDanio() {
        System.out.println("calculoDanio");
        Cazador instance = null;
        int expResult = 0;
        int result = instance.calculoDanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoDefensa method, of class Cazador.
     */
    @Test
    public void testCalculoDefensa() {
        System.out.println("calculoDefensa");
        Cazador instance = null;
        int expResult = 0;
        int result = instance.calculoDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoluntad method, of class Cazador.
     */
    @Test
    public void testSetVoluntad() {
        System.out.println("setVoluntad");
        int voluntad = 0;
        Cazador instance = null;
        instance.setVoluntad(voluntad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVoluntad method, of class Cazador.
     */
    @Test
    public void testGetVoluntad() {
        System.out.println("getVoluntad");
        Cazador instance = null;
        int expResult = 0;
        int result = instance.getVoluntad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
