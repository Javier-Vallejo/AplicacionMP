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
public class EsbirroTest {
    
    public EsbirroTest() {
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

    public Esbirro crearEsbirro(){
        Esbirro instance = new Esbirro("esbirro", 3);
        return instance;
    }
    /**
     * Test of getNombre method, of class Esbirro.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Esbirro instance = crearEsbirro();
        String expResult = "esbirro";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Esbirro.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "esbirro_2";
        Esbirro instance = crearEsbirro();
        String nombreAntiguo = instance.getNombre();
        instance.setNombre(nombre);
        assertNotEquals(nombreAntiguo, instance.getNombre());
    }

    /**
     * Test of getSalud method, of class Esbirro.
     */
    @Test
    public void testGetSalud() {
        System.out.println("getSalud");
        Esbirro instance = crearEsbirro();
        int expResult = 3;
        int result = instance.getSalud();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSalud() {
        System.out.println("setSalud");
        int salud = 2;
        Esbirro instance = crearEsbirro();
        int saludAntiguo = instance.getSalud();
        instance.setSalud(salud);
        assertNotEquals(saludAntiguo, instance.getSalud());
    }
    /**
     * Test of rellenarPropiedadesEspec method, of class Esbirro.
     */
    @Test
    public void testRellenarPropiedadesEspec() throws Exception {
        System.out.println("rellenarPropiedadesEspec");
        Esbirro instance = null;
        instance.rellenarPropiedadesEspec();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
