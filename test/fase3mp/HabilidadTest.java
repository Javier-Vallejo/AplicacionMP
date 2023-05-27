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
public class HabilidadTest {
    
    public HabilidadTest() {
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

    public Habilidad crearHabilidad(){
        Habilidad instance = new Habilidad("habilidad", 3, 3, 3);
        return instance;
    }
    /**
     * Test of getNombre method, of class Habilidad.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Habilidad instance = crearHabilidad();
        String expResult = "habilidad";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Habilidad.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "habilidad2";
        Habilidad instance = crearHabilidad();
        String nombreAntiguo = instance.getNombre();
        instance.setNombre(nombre);
        assertNotEquals(nombreAntiguo,instance.getNombre());
    }

    /**
     * Test of getValorAtaque method, of class Habilidad.
     */
    @Test
    public void testGetValorAtaque() {
        System.out.println("getValorAtaque");
        Habilidad instance = crearHabilidad();
        int expResult = 3;
        int result = instance.getValorAtaque();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValorAtaque method, of class Habilidad.
     */
    @Test
    public void testSetValorAtaque() {
        System.out.println("setValorAtaque");
        int valorAtaque = 1;
        Habilidad instance = crearHabilidad();
        int ataqueAntiguo = instance.getValorAtaque();
        instance.setValorAtaque(valorAtaque);
        assertNotEquals(ataqueAntiguo, instance.getValorAtaque());
    }

    /**
     * Test of getValorDefensa method, of class Habilidad.
     */
    @Test
    public void testGetValorDefensa() {
        System.out.println("getValorDefensa");
        Habilidad instance = crearHabilidad();
        int expResult = 3;
        int result = instance.getValorDefensa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValorDefensa method, of class Habilidad.
     */
    @Test
    public void testSetValorDefensa() {
        System.out.println("setValorDefensa");
        int valorDefensa = 4;
        Habilidad instance = crearHabilidad();
        int defensaAntigua = instance.getValorDefensa();
        instance.setValorDefensa(valorDefensa);
        assertNotEquals(instance.getValorDefensa(), defensaAntigua);
    }

    /**
     * Test of getLimitante method, of class Habilidad.
     */
    @Test
    public void testGetLimitante() {
        System.out.println("getLimitante");
        Habilidad instance = crearHabilidad();
        int expResult = 3;
        int result = instance.getLimitante();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLimitante method, of class Habilidad.
     */
    @Test
    public void testSetLimitante() {
        System.out.println("setLimitante");
        int limitante = 2;
        Habilidad instance = crearHabilidad();
        int limitanteAntiguo = instance.getLimitante();
        instance.setLimitante(limitante);
        assertNotEquals(limitanteAntiguo, instance.getLimitante());
    }
    
}
