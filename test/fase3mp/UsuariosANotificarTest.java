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
public class UsuariosANotificarTest {
    
    public UsuariosANotificarTest() {
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
     * Test of update method, of class UsuariosANotificar.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Object objeto = null;
        UsuariosANotificar instance = new UsuariosANotificarImpl();
        instance.update(objeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UsuariosANotificarImpl implements UsuariosANotificar {

        public void update(Object objeto) {
        }
    }
    
}
