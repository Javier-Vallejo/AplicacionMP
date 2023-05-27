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
public class ArmaTest {
    
    public ArmaTest() {
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
     * Test of getTipodeArma method, of class Arma.
     */
    @Test
    public void testGetTipodeArma() {
        System.out.println("getTipodeArma");
        Arma instance = new Arma("arma", "10", "10", "de2manos");
        Arma.tipoArma expResult = Arma.tipoArma.de2manos;
        Arma.tipoArma result = instance.getTipodeArma();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTipodeArma method, of class Arma.
     */
    @Test
    public void testSetTipodeArma() {
        System.out.println("setTipodeArma");
        Arma instance = new Arma("arma", "10", "10", "de1mano");
        Arma expResult = new Arma("arma", "10", "10", "de1mano");
        instance.setTipodeArma(Arma.tipoArma.de2manos);
        assertNotEquals(expResult, instance);
    }

    /**
     * Test of editarArma method, of class Arma.
     */
    @Test
    public void testEditarArma() {
        System.out.println("editarArma");
        Arma instance = new Arma("a", "1", "1", "de2manos");
        int potenciador = 20;
        instance.editarArma(2,"",potenciador);
        Arma armaNoModificada = new Arma("a", "1", "1", "de2manos");
        assertNotEquals(instance, armaNoModificada);
    }

    /**
     * Test of devolverModificadores method, of class Arma.
     */
    @Test
    public void testDevolverModificadores() {
        System.out.println("testDevolverModificadores");
        Arma instance = new Arma("arma", "10", "10", "de2manos");
        int ataque = instance.devolverModificadores();
        int ataqueEsperado = instance.getModDanio();
        assertEquals(ataque, ataqueEsperado);
    }
    
}
