/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package fase3mp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juana
 */
public class SistemaPrincipalGameTest {
    
    public SistemaPrincipalGameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of obtenerInstancia method, of class SistemaPrincipalGame.
     */
    @Test
    public void testObtenerInstancia() {
        System.out.println("obtenerInstancia");
        SistemaPrincipalGame expResult = null;
        SistemaPrincipalGame result = SistemaPrincipalGame.obtenerInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSistema method, of class SistemaPrincipalGame.
     */
    @Test
    public void testGetSistema() {
        System.out.println("getSistema");
        SistemaPrincipalGame instance = null;
        SistemaPrincipalGame expResult = null;
        SistemaPrincipalGame result = instance.getSistema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testConfirmarUsuario(){
        System.out.println("confirmarUsuario");
        
    }

    /**
     * Test of run method, of class SistemaPrincipalGame.
     */
    @Test
    public void testRun() throws Exception {
        System.out.println("run");
        SistemaPrincipalGame instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
