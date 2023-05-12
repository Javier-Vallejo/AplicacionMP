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
public class DonesTest {
    
    public DonesTest() {
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

    public Dones crearDones(){
        Dones instance = new Dones("don", 3, 3, 3);
        return instance;
    }
    /**
     * Test of activar method, of class Dones.
     */
    @Test
    public void testActivar() {
        System.out.println("activar");
        int valor = 10;
        String opcion = "Ataque";
        Dones instance = crearDones();
        int expResult = 20;
        int result = instance.activar(valor, opcion);
        assertEquals(expResult, result);
        opcion = "Defensa";
        expResult = 15;
        result = instance.activar(valor, opcion);
        assertEquals(expResult, result);
    }
    
}
