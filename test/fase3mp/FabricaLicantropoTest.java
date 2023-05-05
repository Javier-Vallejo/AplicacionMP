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
public class FabricaLicantropoTest {
    
    public FabricaLicantropoTest() {
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
     * Test of crearPersonaje method, of class FabricaLicantropo.
     */
    @Test
    public void testCrearPersonaje() {
        System.out.println("crearPersonaje");
        String nombre = "";
        Habilidad habilidadPersonaje = null;
        Arma[] armas = null;
        Arma[] armasActivas = null;
        Armadura[] armaduras = null;
        Armadura armaduraActiva = null;
        Esbirro[] esbirros = null;
        int Salud = 0;
        int Poder = 0;
        Debilidad[] debilidades = null;
        Fortaleza[] fortalezas = null;
        FabricaLicantropo instance = new FabricaLicantropo();
        Personaje expResult = null;
        Personaje result = instance.crearPersonaje(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades, fortalezas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
