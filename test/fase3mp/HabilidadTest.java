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
public class HabilidadTest {
    
    public HabilidadTest() {
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
     * Test of getNombre method, of class Habilidad.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Habilidad instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Habilidad.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Habilidad instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorAtaque method, of class Habilidad.
     */
    @Test
    public void testGetValorAtaque() {
        System.out.println("getValorAtaque");
        Habilidad instance = null;
        int expResult = 0;
        int result = instance.getValorAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorAtaque method, of class Habilidad.
     */
    @Test
    public void testSetValorAtaque() {
        System.out.println("setValorAtaque");
        int valorAtaque = 0;
        Habilidad instance = null;
        instance.setValorAtaque(valorAtaque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorDefensa method, of class Habilidad.
     */
    @Test
    public void testGetValorDefensa() {
        System.out.println("getValorDefensa");
        Habilidad instance = null;
        int expResult = 0;
        int result = instance.getValorDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorDefensa method, of class Habilidad.
     */
    @Test
    public void testSetValorDefensa() {
        System.out.println("setValorDefensa");
        int valorDefensa = 0;
        Habilidad instance = null;
        instance.setValorDefensa(valorDefensa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLimitante method, of class Habilidad.
     */
    @Test
    public void testGetLimitante() {
        System.out.println("getLimitante");
        Habilidad instance = null;
        int expResult = 0;
        int result = instance.getLimitante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimitante method, of class Habilidad.
     */
    @Test
    public void testSetLimitante() {
        System.out.println("setLimitante");
        int limitante = 0;
        Habilidad instance = null;
        instance.setLimitante(limitante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
