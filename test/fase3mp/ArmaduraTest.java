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
public class ArmaduraTest {
    
    public ArmaduraTest() {
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
     * Test of devolverModificadores method, of class Armadura.
     */
    @Test
    public void testDevolverModificadores() {
        System.out.println("devolverModificadores");
        Armadura instance = new Armadura("armadura", "10", "5");
        int expResult = 5;
        int result = instance.devolverModificadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of editarArmadura method, of class Armadura.
     */
    @Test
    public void testEditarArmadura() {
        System.out.println("editarArmadura");
        Armadura instance = new Armadura("armadura", "10", "5");;
        instance.editarArmadura();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
