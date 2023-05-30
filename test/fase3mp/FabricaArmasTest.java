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

import fase3mp.Arma.tipoArma;

import static org.junit.Assert.*;

/**
 *
 * @author juana
 */
public class FabricaArmasTest {
    
    public FabricaArmasTest() {
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
     * Test of crearEquipo method, of class FabricaArmas.
     */
    @Test
    public void testCrearEquipo() {
        System.out.println("crearEquipo");
        String nombre = "nombre";
        String modDanio = "2";
        String modDefensa = "2";
        String tipo = "de2manos";
        FabricaArmas instance = new FabricaArmas();
        Arma expResult = new Arma(nombre,modDanio,modDefensa,tipo);
        Equipo result = instance.crearEquipo(nombre, modDanio, modDefensa);
        assertEquals(expResult.getNombre(), result.getNombre());
        assertEquals(expResult.getModDanio(), result.getModDanio());
        assertEquals(expResult.getModDefensa(), result.getModDefensa());
        assertEquals(expResult.getTipodeArma(), tipoArma.de2manos);


        
    }
    
}
