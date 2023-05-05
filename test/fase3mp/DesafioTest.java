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
public class DesafioTest {
    
    public DesafioTest() {
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
     * Test of getFElegDesafiante method, of class Desafio.
     */
    @Test
    public void testGetFElegDesafiante() {
        System.out.println("getFElegDesafiante");
        Desafio instance = new Desafio();
        ArrayList<Fortaleza> expResult = null;
        ArrayList<Fortaleza> result = instance.getFElegDesafiante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFElegDesafiado method, of class Desafio.
     */
    @Test
    public void testGetFElegDesafiado() {
        System.out.println("getFElegDesafiado");
        Desafio instance = new Desafio();
        ArrayList<Fortaleza> expResult = null;
        ArrayList<Fortaleza> result = instance.getFElegDesafiado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDElegDesafiante method, of class Desafio.
     */
    @Test
    public void testGetDElegDesafiante() {
        System.out.println("getDElegDesafiante");
        Desafio instance = new Desafio();
        ArrayList<Debilidad> expResult = null;
        ArrayList<Debilidad> result = instance.getDElegDesafiante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDElegDesafiado method, of class Desafio.
     */
    @Test
    public void testGetDElegDesafiado() {
        System.out.println("getDElegDesafiado");
        Desafio instance = new Desafio();
        ArrayList<Debilidad> expResult = null;
        ArrayList<Debilidad> result = instance.getDElegDesafiado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFElegDesafiante method, of class Desafio.
     */
    @Test
    public void testSetFElegDesafiante() {
        System.out.println("setFElegDesafiante");
        ArrayList<Fortaleza> fElegDesafiante = null;
        Desafio instance = new Desafio();
        instance.setFElegDesafiante(fElegDesafiante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFElegDesafiado method, of class Desafio.
     */
    @Test
    public void testSetFElegDesafiado() {
        System.out.println("setFElegDesafiado");
        ArrayList<Fortaleza> fElegDesafiado = null;
        Desafio instance = new Desafio();
        instance.setFElegDesafiado(fElegDesafiado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDElegDesafiante method, of class Desafio.
     */
    @Test
    public void testSetDElegDesafiante() {
        System.out.println("setDElegDesafiante");
        ArrayList<Debilidad> dElegDesafiante = null;
        Desafio instance = new Desafio();
        instance.setDElegDesafiante(dElegDesafiante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDElegDesafiado method, of class Desafio.
     */
    @Test
    public void testSetDElegDesafiado() {
        System.out.println("setDElegDesafiado");
        ArrayList<Debilidad> dElegDesafiado = null;
        Desafio instance = new Desafio();
        instance.setDElegDesafiado(dElegDesafiado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJugadorDesafiante method, of class Desafio.
     */
    @Test
    public void testGetJugadorDesafiante() {
        System.out.println("getJugadorDesafiante");
        Desafio instance = new Desafio();
        Jugador expResult = null;
        Jugador result = instance.getJugadorDesafiante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJugadorDesafiante method, of class Desafio.
     */
    @Test
    public void testSetJugadorDesafiante() {
        System.out.println("setJugadorDesafiante");
        Jugador jugadorDesafiante = null;
        Desafio instance = new Desafio();
        instance.setJugadorDesafiante(jugadorDesafiante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJugadorDesafiado method, of class Desafio.
     */
    @Test
    public void testGetJugadorDesafiado() {
        System.out.println("getJugadorDesafiado");
        Desafio instance = new Desafio();
        Jugador expResult = null;
        Jugador result = instance.getJugadorDesafiado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJugadorDesafiado method, of class Desafio.
     */
    @Test
    public void testSetJugadorDesafiado() {
        System.out.println("setJugadorDesafiado");
        Jugador jugadorDesafiado = null;
        Desafio instance = new Desafio();
        instance.setJugadorDesafiado(jugadorDesafiado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOroApostado method, of class Desafio.
     */
    @Test
    public void testGetOroApostado() {
        System.out.println("getOroApostado");
        Desafio instance = new Desafio();
        int expResult = 0;
        int result = instance.getOroApostado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOroApostado method, of class Desafio.
     */
    @Test
    public void testSetOroApostado() {
        System.out.println("setOroApostado");
        int oroApostado = 0;
        Desafio instance = new Desafio();
        instance.setOroApostado(oroApostado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Desafio.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Desafio instance = new Desafio();
        Desafio.State expResult = null;
        Desafio.State result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Desafio.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        Desafio.State estado = null;
        Desafio instance = new Desafio();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
