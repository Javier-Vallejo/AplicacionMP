/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
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
public class EntidadesActivasTest {
    
    public EntidadesActivasTest() {
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
     * Test of getFortalezas method, of class EntidadesActivas.
     */
    @Test
    public void testGetFortalezas() {
        System.out.println("getFortalezas");
        EntidadesActivas instance = new EntidadesActivas();
        ArrayList<Fortaleza> expResult = null;
        ArrayList<Fortaleza> result = instance.getFortalezas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDebilidades method, of class EntidadesActivas.
     */
    @Test
    public void testGetDebilidades() {
        System.out.println("getDebilidades");
        EntidadesActivas instance = new EntidadesActivas();
        ArrayList<Debilidad> expResult = null;
        ArrayList<Debilidad> result = instance.getDebilidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonajes method, of class EntidadesActivas.
     */
    @Test
    public void testGetPersonajes() {
        System.out.println("getPersonajes");
        EntidadesActivas instance = new EntidadesActivas();
        ArrayList<Personaje> expResult = null;
        ArrayList<Personaje> result = instance.getPersonajes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonajes method, of class EntidadesActivas.
     */
    @Test
    public void testSetPersonajes() {
        System.out.println("setPersonajes");
        ArrayList<Personaje> personajes = null;
        EntidadesActivas instance = new EntidadesActivas();
        instance.setPersonajes(personajes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmas method, of class EntidadesActivas.
     */
    @Test
    public void testGetArmas() {
        System.out.println("getArmas");
        EntidadesActivas instance = new EntidadesActivas();
        ArrayList<Arma> expResult = null;
        ArrayList<Arma> result = instance.getArmas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArmas method, of class EntidadesActivas.
     */
    @Test
    public void testSetArmas() {
        System.out.println("setArmas");
        ArrayList<Arma> armas = null;
        EntidadesActivas instance = new EntidadesActivas();
        instance.setArmas(armas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmaduras method, of class EntidadesActivas.
     */
    @Test
    public void testGetArmaduras() {
        System.out.println("getArmaduras");
        EntidadesActivas instance = new EntidadesActivas();
        ArrayList<Armadura> expResult = null;
        ArrayList<Armadura> result = instance.getArmaduras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArmaduras method, of class EntidadesActivas.
     */
    @Test
    public void testSetArmaduras() {
        System.out.println("setArmaduras");
        ArrayList<Armadura> armaduras = null;
        EntidadesActivas instance = new EntidadesActivas();
        instance.setArmaduras(armaduras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHabilidades method, of class EntidadesActivas.
     */
    @Test
    public void testGetHabilidades() {
        System.out.println("getHabilidades");
        EntidadesActivas instance = new EntidadesActivas();
        ArrayList<Habilidad> expResult = null;
        ArrayList<Habilidad> result = instance.getHabilidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverEsbirro method, of class EntidadesActivas.
     */
    @Test
    public void testDevolverEsbirro() {
        System.out.println("devolverEsbirro");
        String nombre = "";
        int salud = 0;
        String tipo = "";
        EntidadesActivas instance = new EntidadesActivas();
        Esbirro expResult = null;
        Esbirro result = instance.devolverEsbirro(nombre, salud, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aniadir method, of class EntidadesActivas.
     */
    @Test
    public void testAniadir() {
        System.out.println("aniadir");
        Object objeto = null;
        EntidadesActivas instance = new EntidadesActivas();
        instance.aniadir(objeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeEsbirro method, of class EntidadesActivas.
     */
    @Test
    public void testExisteEsbirro() {
        System.out.println("existeEsbirro");
        Esbirro esbirro = null;
        EntidadesActivas instance = new EntidadesActivas();
        boolean expResult = false;
        boolean result = instance.existeEsbirro(esbirro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elegirPersonaje method, of class EntidadesActivas.
     */
    @Test
    public void testElegirPersonaje() {
        System.out.println("elegirPersonaje");
        int eleccion = 0;
        EntidadesActivas instance = new EntidadesActivas();
        Personaje expResult = null;
        Personaje result = instance.elegirPersonaje(eleccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elegirArma method, of class EntidadesActivas.
     */
    @Test
    public void testElegirArma() {
        System.out.println("elegirArma");
        int eleccion = 0;
        EntidadesActivas instance = new EntidadesActivas();
        Arma expResult = null;
        Arma result = instance.elegirArma(eleccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elegirArmadura method, of class EntidadesActivas.
     */
    @Test
    public void testElegirArmadura() {
        System.out.println("elegirArmadura");
        int eleccion = 0;
        EntidadesActivas instance = new EntidadesActivas();
        Armadura expResult = null;
        Armadura result = instance.elegirArmadura(eleccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elegirFortaleza method, of class EntidadesActivas.
     */
    @Test
    public void testElegirFortaleza() {
        System.out.println("elegirFortaleza");
        int eleccion = 0;
        EntidadesActivas instance = new EntidadesActivas();
        Fortaleza expResult = null;
        Fortaleza result = instance.elegirFortaleza(eleccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elegirDebilidad method, of class EntidadesActivas.
     */
    @Test
    public void testElegirDebilidad() {
        System.out.println("elegirDebilidad");
        int eleccion = 0;
        EntidadesActivas instance = new EntidadesActivas();
        Debilidad expResult = null;
        Debilidad result = instance.elegirDebilidad(eleccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEsbirro method, of class EntidadesActivas.
     */
    @Test
    public void testObtenerEsbirro() {
        System.out.println("obtenerEsbirro");
        int eleccion = 0;
        EntidadesActivas instance = new EntidadesActivas();
        Esbirro expResult = null;
        Esbirro result = instance.obtenerEsbirro(eleccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elegirHabilidad method, of class EntidadesActivas.
     */
    @Test
    public void testElegirHabilidad() {
        System.out.println("elegirHabilidad");
        int eleccion = 0;
        EntidadesActivas instance = new EntidadesActivas();
        Habilidad expResult = null;
        Habilidad result = instance.elegirHabilidad(eleccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostraryElegir method, of class EntidadesActivas.
     */
    @Test
    public void testMostraryElegir() {
        System.out.println("MostraryElegir");
        String objetoMostrar = "";
        EntidadesActivas instance = new EntidadesActivas();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.MostraryElegir(objetoMostrar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostraryElegirHabilidad method, of class EntidadesActivas.
     */
    @Test
    public void testMostraryElegirHabilidad() {
        System.out.println("MostraryElegirHabilidad");
        EntidadesActivas instance = new EntidadesActivas();
        int expResult = 0;
        int result = instance.MostraryElegirHabilidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPersonaje method, of class EntidadesActivas.
     */
    @Test
    public void testObtenerPersonaje() {
        System.out.println("obtenerPersonaje");
        String nombre = "";
        String tipo = "";
        int salud = 0;
        EntidadesActivas instance = new EntidadesActivas();
        Personaje expResult = null;
        Personaje result = instance.obtenerPersonaje(nombre, tipo, salud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LeerEntidades method, of class EntidadesActivas.
     */
    @Test
    public void testLeerEntidades() throws Exception {
        System.out.println("LeerEntidades");
        EntidadesActivas instance = new EntidadesActivas();
        instance.LeerEntidades();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarEsbirroFichero method, of class EntidadesActivas.
     */
    @Test
    public void testGuardarEsbirroFichero() throws Exception {
        System.out.println("GuardarEsbirroFichero");
        Esbirro esbirro = null;
        EntidadesActivas instance = new EntidadesActivas();
        instance.GuardarEsbirroFichero(esbirro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerEsbirros method, of class EntidadesActivas.
     */
    @Test
    public void testLeerEsbirros() throws Exception {
        System.out.println("leerEsbirros");
        EntidadesActivas instance = new EntidadesActivas();
        instance.leerEsbirros();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
