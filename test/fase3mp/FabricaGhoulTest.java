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
public class FabricaGhoulTest {
    
    public FabricaGhoulTest() {
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
     * Test of crearEsbirro method, of class FabricaGhoul.
     */
    @Test
    public void testCrearEsbirro() {
        System.out.println("crearEsbirro");
        String nombre = "";
        int salud = 0;
        FabricaGhoul instance = new FabricaGhoul();
        Esbirro expResult = null;
        Esbirro result = instance.crearEsbirro(nombre, salud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}