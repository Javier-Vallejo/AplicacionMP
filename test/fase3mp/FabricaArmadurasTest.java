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
public class FabricaArmadurasTest {
    
    public FabricaArmadurasTest() {
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
     * Test of crearEquipo method, of class FabricaArmaduras.
     */
    @Test
    public void testCrearEquipo() {
        System.out.println("crearEquipo");
        String nombre = "";
        String modDanio = "";
        String modDefensa = "";
        FabricaArmaduras instance = new FabricaArmaduras();
        Equipo expResult = null;
        Equipo result = instance.crearEquipo(nombre, modDanio, modDefensa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
