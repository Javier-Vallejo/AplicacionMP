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
public class VampiroTest {
    
    public VampiroTest() {
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
     * Test of setEdad method, of class Vampiro.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Vampiro instance = null;
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Vampiro.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Vampiro instance = null;
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSangre method, of class Vampiro.
     */
    @Test
    public void testGetSangre() {
        System.out.println("getSangre");
        Vampiro instance = null;
        int expResult = 0;
        int result = instance.getSangre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSangre method, of class Vampiro.
     */
    @Test
    public void testSetSangre() {
        System.out.println("setSangre");
        int sangre = 0;
        Vampiro instance = null;
        instance.setSangre(sangre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarPropiedadesEspecificas method, of class Vampiro.
     */
    @Test
    public void testRellenarPropiedadesEspecificas() {
        System.out.println("rellenarPropiedadesEspecificas");
        Vampiro instance = null;
        instance.rellenarPropiedadesEspecificas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clonar method, of class Vampiro.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Vampiro instance = null;
        Personaje expResult = null;
        Personaje result = instance.clonar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dañoDeSangre method, of class Vampiro.
     */
    @Test
    public void testDañoDeSangre() {
        System.out.println("da\u00f1oDeSangre");
        int sangre = 0;
        Vampiro instance = null;
        int expResult = 0;
        int result = instance.dañoDeSangre(sangre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoDanio method, of class Vampiro.
     */
    @Test
    public void testCalculoDanio() {
        System.out.println("calculoDanio");
        Vampiro instance = null;
        int expResult = 0;
        int result = instance.calculoDanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoDefensa method, of class Vampiro.
     */
    @Test
    public void testCalculoDefensa() {
        System.out.println("calculoDefensa");
        Vampiro instance = null;
        int expResult = 0;
        int result = instance.calculoDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
