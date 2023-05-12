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
public class EsbirroTest {
    
    public EsbirroTest() {
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
     * Test of getNombre method, of class Esbirro.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Esbirro instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Esbirro.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Esbirro instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalud method, of class Esbirro.
     */
    @Test
    public void testGetSalud() {
        System.out.println("getSalud");
        Esbirro instance = null;
        int expResult = 0;
        int result = instance.getSalud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarPropiedadesEspec method, of class Esbirro.
     */
    @Test
    public void testRellenarPropiedadesEspec() throws Exception {
        System.out.println("rellenarPropiedadesEspec");
        Esbirro instance = null;
        instance.rellenarPropiedadesEspec();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverSalud method, of class Esbirro.
     */
    /*
     *  devolver salud de esbirro es lo mismo que getSalud
     */
    @Test
    public void testDevolverSalud() {
        System.out.println("devolverSalud");
        Esbirro instance = null;
        int expResult = 0;
        int result = instance.devolverSalud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
