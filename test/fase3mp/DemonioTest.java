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
public class DemonioTest {
    
    public DemonioTest() {
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
     * Test of setEsbirros method, of class Demonio.
     */
    @Test
    public void testSetEsbirros() {
        System.out.println("setEsbirros");
        ArrayList<Esbirro> esbirros = null;
        Demonio instance = null;
        instance.setEsbirros(esbirros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBooleanPacto method, of class Demonio.
     */
    @Test
    public void testSetBooleanPacto() {
        System.out.println("setBooleanPacto");
        boolean tienePacto = false;
        Demonio instance = null;
        instance.setBooleanPacto(tienePacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPacto method, of class Demonio.
     */
    @Test
    public void testSetPacto() {
        System.out.println("setPacto");
        Pacto pacto = null;
        Demonio instance = null;
        instance.setPacto(pacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFabricaEsbirros method, of class Demonio.
     */
    @Test
    public void testSetFabricaEsbirros() {
        System.out.println("setFabricaEsbirros");
        FabricaEsbirros fabricaEsbirros = null;
        Demonio instance = null;
        instance.setFabricaEsbirros(fabricaEsbirros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEsbirros method, of class Demonio.
     */
    @Test
    public void testGetEsbirros() {
        System.out.println("getEsbirros");
        Demonio instance = null;
        ArrayList<Esbirro> expResult = null;
        ArrayList<Esbirro> result = instance.getEsbirros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTienePacto method, of class Demonio.
     */
    @Test
    public void testGetTienePacto() {
        System.out.println("getTienePacto");
        Demonio instance = null;
        boolean expResult = false;
        boolean result = instance.getTienePacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPacto method, of class Demonio.
     */
    @Test
    public void testGetPacto() {
        System.out.println("getPacto");
        Demonio instance = null;
        Pacto expResult = null;
        Pacto result = instance.getPacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidades method, of class Demonio.
     */
    @Test
    public void testSetEntidades() {
        System.out.println("setEntidades");
        EntidadesActivas entidades = null;
        Demonio instance = null;
        instance.setEntidades(entidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarPropiedadesEspec method, of class Demonio.
     */
    @Test
    public void testRellenarPropiedadesEspec() throws Exception {
        System.out.println("rellenarPropiedadesEspec");
        Demonio instance = null;
        instance.rellenarPropiedadesEspec();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularVidaRestante method, of class Demonio.
     */
    @Test
    public void testCalcularVidaRestante() {
        System.out.println("calcularVidaRestante");
        Demonio instance = null;
        int expResult = 0;
        int result = instance.calcularVidaRestante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverSalud method, of class Demonio.
     */
    @Test
    public void testDevolverSalud() {
        System.out.println("devolverSalud");
        Demonio instance = null;
        int expResult = 0;
        int result = instance.devolverSalud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tieneEsbirros method, of class Demonio.
     */
    @Test
    public void testTieneEsbirros() {
        System.out.println("tieneEsbirros");
        Demonio instance = null;
        boolean expResult = false;
        boolean result = instance.tieneEsbirros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
