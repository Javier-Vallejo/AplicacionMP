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
public class ModificadorTest {
    
    public ModificadorTest() {
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

    public Modificador crearModificador(){
        Modificador instance = new Modificador("modificador", 3);
        return instance;
    }
    /**
     * Test of getNombre method, of class Modificador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Modificador instance = crearModificador();
        String expResult = "modificador";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Modificador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "modificador_2";
        Modificador instance = crearModificador();
        String nombreAntiguo = instance.getNombre();
        instance.setNombre(nombre);
        assertNotEquals(nombreAntiguo, instance.getNombre());
    }

    /**
     * Test of getValor method, of class Modificador.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Modificador instance = crearModificador();
        int expResult = 3;
        int result = instance.getValor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValor method, of class Modificador.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 2;
        Modificador instance = crearModificador();
        int valorAntiguo = instance.getValor();
        instance.setValor(valor);
        assertNotEquals(instance.getValor(), valorAntiguo);
    }
    
}
