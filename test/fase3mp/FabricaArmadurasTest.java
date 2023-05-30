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
public class FabricaArmadurasTest {
    
    public FabricaArmadurasTest() {
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
     * Test of crearEquipo method, of class FabricaArmaduras.
     */
    @Test
    public void testCrearEquipo() {
        System.out.println("crearEquipo");
        String nombre = "nombre";
        String modDanio = "2";
        String modDefensa = "2";
        FabricaArmaduras instance = new FabricaArmaduras();
        Armadura expResult = new Armadura(nombre,modDanio,modDefensa);
        Equipo result = instance.crearEquipo(nombre, modDanio, modDefensa);
        assertEquals(expResult.getNombre(), result.getNombre());
        assertEquals(expResult.getModDanio(), result.getModDanio());
        assertEquals(expResult.getModDefensa(), result.getModDefensa());

        
    }
    
}
