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
public class RondaTest {
    
    public RondaTest() {
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
     * Test of Calculo_Potencial method, of class Ronda.
     */
    @Test
    public void testCalculo_Potencial() {
        System.out.println("Calculo_Potencial");
        Personaje per1 = null;
        Personaje per2 = null;
        ArrayList<Fortaleza> fortalezasElegidasDesafiante = null;
        ArrayList<Debilidad> debilidadesElegidasDesafiante = null;
        ArrayList<Fortaleza> fortalezasElegidasDesafiado = null;
        ArrayList<Debilidad> debilidadesElegidasDesafiado = null;
        Ronda instance = new Ronda();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.Calculo_Potencial(per1, per2, fortalezasElegidasDesafiante, debilidadesElegidasDesafiante, fortalezasElegidasDesafiado, debilidadesElegidasDesafiado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalcularVidaRestante method, of class Ronda.
     */
    @Test
    public void testCalcularVidaRestante() {
        System.out.println("CalcularVidaRestante");
        ArrayList<Integer> potenciales = null;
        int vida1 = 0;
        int vida2 = 0;
        Ronda instance = new Ronda();
        int[] expResult = null;
        int[] result = instance.CalcularVidaRestante(potenciales, vida1, vida2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPotencialPer1 method, of class Ronda.
     */
    @Test
    public void testGetPotencialPer1() {
        System.out.println("getPotencialPer1");
        Ronda instance = new Ronda();
        int expResult = 0;
        int result = instance.getPotencialPer1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPotencialPer1 method, of class Ronda.
     */
    @Test
    public void testSetPotencialPer1() {
        System.out.println("setPotencialPer1");
        int potencialPer1 = 0;
        Ronda instance = new Ronda();
        instance.setPotencialPer1(potencialPer1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPotencialPer2 method, of class Ronda.
     */
    @Test
    public void testGetPotencialPer2() {
        System.out.println("getPotencialPer2");
        Ronda instance = new Ronda();
        int expResult = 0;
        int result = instance.getPotencialPer2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPotencialPer2 method, of class Ronda.
     */
    @Test
    public void testSetPotencialPer2() {
        System.out.println("setPotencialPer2");
        int potencialPer2 = 0;
        Ronda instance = new Ronda();
        instance.setPotencialPer2(potencialPer2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVidaDesafiante method, of class Ronda.
     */
    @Test
    public void testGetVidaDesafiante() {
        System.out.println("getVidaDesafiante");
        Ronda instance = new Ronda();
        int expResult = 0;
        int result = instance.getVidaDesafiante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVidaDesafiante method, of class Ronda.
     */
    @Test
    public void testSetVidaDesafiante() {
        System.out.println("setVidaDesafiante");
        int vidaDesafiante = 0;
        Ronda instance = new Ronda();
        instance.setVidaDesafiante(vidaDesafiante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVidaDesafiado method, of class Ronda.
     */
    @Test
    public void testGetVidaDesafiado() {
        System.out.println("getVidaDesafiado");
        Ronda instance = new Ronda();
        int expResult = 0;
        int result = instance.getVidaDesafiado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVidaDesafiado method, of class Ronda.
     */
    @Test
    public void testSetVidaDesafiado() {
        System.out.println("setVidaDesafiado");
        int vidaDesafiado = 0;
        Ronda instance = new Ronda();
        instance.setVidaDesafiado(vidaDesafiado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
