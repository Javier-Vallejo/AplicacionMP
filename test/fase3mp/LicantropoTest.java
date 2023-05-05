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
public class LicantropoTest {
    
    public LicantropoTest() {
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
     * Test of getRabia method, of class Licantropo.
     */
    @Test
    public void testGetRabia() {
        System.out.println("getRabia");
        Licantropo instance = null;
        int expResult = 0;
        int result = instance.getRabia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRabia method, of class Licantropo.
     */
    @Test
    public void testSetRabia() {
        System.out.println("setRabia");
        int rabia = 0;
        Licantropo instance = null;
        instance.setRabia(rabia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarPropiedadesEspecificas method, of class Licantropo.
     */
    @Test
    public void testRellenarPropiedadesEspecificas() {
        System.out.println("rellenarPropiedadesEspecificas");
        Licantropo instance = null;
        instance.rellenarPropiedadesEspecificas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clonar method, of class Licantropo.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Licantropo instance = null;
        Personaje expResult = null;
        Personaje result = instance.clonar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoDanio method, of class Licantropo.
     */
    @Test
    public void testCalculoDanio() {
        System.out.println("calculoDanio");
        Licantropo instance = null;
        int expResult = 0;
        int result = instance.calculoDanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoDefensa method, of class Licantropo.
     */
    @Test
    public void testCalculoDefensa() {
        System.out.println("calculoDefensa");
        Licantropo instance = null;
        int expResult = 0;
        int result = instance.calculoDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
