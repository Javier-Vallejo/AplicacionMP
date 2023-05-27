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
public class DesafiosActivosTest {
    
    public DesafiosActivosTest() {
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
     * Test of guardarDesafio method, of class DesafiosActivos.
     */
    @Test
    public void testGuardarDesafio() {
        System.out.println("guardarDesafio");
        Desafio desafio = new Desafio();
        desafio.setOroApostado(100);
        DesafiosActivos instance = new DesafiosActivos();
        instance.guardarDesafio(desafio);
        int oroesperado = 100;
        int dinero = instance.obtenerDesafio().getOroApostado();
        assertEquals(oroesperado,dinero);
    }

    /**
     * Test of obtenerDesafio method, of class DesafiosActivos.
     */
    @Test
    public void testObtenerDesafio() {
        System.out.println("obtenerDesafio");
        DesafiosActivos instance = new DesafiosActivos();
        Desafio desafio = new Desafio();
        desafio.setOroApostado(100);
        instance.guardarDesafio(desafio);
        int expResult = 100;
        assertEquals(expResult, instance.obtenerDesafio().getOroApostado());
    }
    
}
