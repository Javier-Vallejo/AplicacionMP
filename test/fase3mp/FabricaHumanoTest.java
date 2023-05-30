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
public class FabricaHumanoTest {
    
    public FabricaHumanoTest() {
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
     * Test of crearEsbirro method, of class FabricaHumano.
     */
    @Test
    public void testCrearEsbirro() {
        System.out.println("crearEsbirro");
        String nombre = "humano";
        int salud = 4;
        FabricaHumano instance = new FabricaHumano();
        Esbirro expResult = new Humano(nombre, salud);
        Esbirro result = instance.crearEsbirro(nombre, salud);
        assertEquals(expResult.getClass(), result.getClass());
       
    }
    
}
