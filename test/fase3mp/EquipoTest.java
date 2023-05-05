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
public class EquipoTest {
    
    public EquipoTest() {
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
     * Test of getNombre method, of class Equipo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Equipo instance = new Equipo();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Equipo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Equipo instance = new Equipo();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModDanio method, of class Equipo.
     */
    @Test
    public void testGetModDanio() {
        System.out.println("getModDanio");
        Equipo instance = new Equipo();
        int expResult = 0;
        int result = instance.getModDanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModDanio method, of class Equipo.
     */
    @Test
    public void testSetModDanio() {
        System.out.println("setModDanio");
        int modDanio = 0;
        Equipo instance = new Equipo();
        instance.setModDanio(modDanio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModDefensa method, of class Equipo.
     */
    @Test
    public void testGetModDefensa() {
        System.out.println("getModDefensa");
        Equipo instance = new Equipo();
        int expResult = 0;
        int result = instance.getModDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModDefensa method, of class Equipo.
     */
    @Test
    public void testSetModDefensa() {
        System.out.println("setModDefensa");
        int modDefensa = 0;
        Equipo instance = new Equipo();
        instance.setModDefensa(modDefensa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverAtaque method, of class Equipo.
     */
    @Test
    public void testDevolverAtaque() {
        System.out.println("devolverAtaque");
        Equipo instance = new Equipo();
        int expResult = 0;
        int result = instance.devolverAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverDefensa method, of class Equipo.
     */
    @Test
    public void testDevolverDefensa() {
        System.out.println("devolverDefensa");
        Equipo instance = new Equipo();
        int expResult = 0;
        int result = instance.devolverDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
