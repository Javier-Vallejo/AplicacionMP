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
public class ArmaTest {
    
    public ArmaTest() {
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
     * Test of getTipodeArma method, of class Arma.
     */
    @Test
    public void testGetTipodeArma() {
        System.out.println("getTipodeArma");
        Arma instance = null;
        Arma.tipoArma expResult = null;
        Arma.tipoArma result = instance.getTipodeArma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipodeArma method, of class Arma.
     */
    @Test
    public void testSetTipodeArma() {
        System.out.println("setTipodeArma");
        Arma.tipoArma tipodeArma = null;
        Arma instance = null;
        instance.setTipodeArma(tipodeArma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarArma method, of class Arma.
     */
    @Test
    public void testEditarArma() {
        System.out.println("editarArma");
        Arma instance = null;
        instance.editarArma();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverModificadores method, of class Arma.
     */
    @Test
    public void testDevolverModificadores() {
        System.out.println("devolverModificadores");
        Arma instance = null;
        int expResult = 0;
        int result = instance.devolverModificadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
