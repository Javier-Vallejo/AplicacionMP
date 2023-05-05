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
public class RegistroTest {
    
    public RegistroTest() {
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
     * Test of getManager method, of class Registro.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        Registro instance = null;
        ManagerUsuarios expResult = null;
        ManagerUsuarios result = instance.getManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManager method, of class Registro.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        ManagerUsuarios manager = null;
        Registro instance = null;
        instance.setManager(manager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarse method, of class Registro.
     */
    @Test
    public void testRegistrarse() {
        System.out.println("registrarse");
        TipoUsuario rol = null;
        Registro instance = null;
        Usuario expResult = null;
        Usuario result = instance.registrarse(rol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
