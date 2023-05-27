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
public class InterfazPersonajeTest {
    
    public InterfazPersonajeTest() {
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
     * Test of clonar method, of class InterfazPersonaje.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        InterfazPersonaje instance = new InterfazPersonajeImpl();
        Personaje expResult = null;
        Personaje result = instance.clonar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfazPersonajeImpl implements InterfazPersonaje {

        public Personaje clonar() {
            return null;
        }
    }
    
}
