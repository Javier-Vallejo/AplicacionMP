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

import fase3mp.Humano.nivelLealtad;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 *
 * @author juana
 */
public class HumanoTest {
    
    public HumanoTest() {
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

    public Humano crearHumano(){
        Humano instance = new Humano("humano", 3);
        instance.setLealtad(nivelLealtad.ALTA);
        return instance;
    }
    /**
     * Test of rellenarPropiedadesEspec method, of class Humano.
     */
    @Test
    public void testRellenarPropiedadesEspec() {
        System.out.println("rellenarPropiedadesEspec");
        Humano instance = null;
        instance.rellenarPropiedadesEspec();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularVidaRestante method, of class Humano.
     */
    @Test
    public void testCalcularVidaRestante() {
        System.out.println("calcularVidaRestante");
        Humano instance = null;
        int expResult = 0;
        int result = instance.calcularVidaRestante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLealtad method, of class Humano.
     */
    @Test
    public void testGetLealtad() {
        System.out.println("getLealtad");
        Humano instance = crearHumano();
        Humano.nivelLealtad expResult = nivelLealtad.ALTA;
        Humano.nivelLealtad result = instance.getLealtad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLealtad method, of class Humano.
     */
    @Test
    public void testSetLealtad() {
        System.out.println("setLealtad");
        Humano.nivelLealtad lealtad = nivelLealtad.BAJA;
        Humano instance = crearHumano();
        Humano.nivelLealtad lealtadAntigua = instance.getLealtad();
        instance.setLealtad(lealtad);
        assertNotEquals(lealtadAntigua, instance.getLealtad());
    }
    
}
