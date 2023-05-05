/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
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
public class PublisherTest {
    
    public PublisherTest() {
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
     * Test of suscribirUsuario method, of class Publisher.
     */
    @Test
    public void testSuscribirUsuario() {
        System.out.println("suscribirUsuario");
        Usuario usuario = null;
        Publisher instance = new Publisher();
        instance.suscribirUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desSuscribirUsuario method, of class Publisher.
     */
    @Test
    public void testDesSuscribirUsuario() {
        System.out.println("desSuscribirUsuario");
        Usuario usuario = null;
        Publisher instance = new Publisher();
        instance.desSuscribirUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notificarUsuario method, of class Publisher.
     */
    @Test
    public void testNotificarUsuario() {
        System.out.println("notificarUsuario");
        Object objetoX = null;
        Publisher instance = new Publisher();
        instance.notificarUsuario(objetoX);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuscriptores method, of class Publisher.
     */
    @Test
    public void testGetSuscriptores() {
        System.out.println("getSuscriptores");
        Publisher instance = new Publisher();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getSuscriptores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSuscriptores method, of class Publisher.
     */
    @Test
    public void testSetSuscriptores() {
        System.out.println("setSuscriptores");
        ArrayList<Usuario> suscriptores = null;
        Publisher instance = new Publisher();
        instance.setSuscriptores(suscriptores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperador method, of class Publisher.
     */
    @Test
    public void testGetOperador() {
        System.out.println("getOperador");
        Publisher instance = new Publisher();
        OperadorSistema expResult = null;
        OperadorSistema result = instance.getOperador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperador method, of class Publisher.
     */
    @Test
    public void testSetOperador() {
        System.out.println("setOperador");
        OperadorSistema operador = null;
        Publisher instance = new Publisher();
        instance.setOperador(operador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
