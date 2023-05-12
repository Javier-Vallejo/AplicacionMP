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

import java.util.Random;

/**
 *
 * @author juana
 */
public class PersonajeTest {
    
    public PersonajeTest() {
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
     * Test of getNombre method, of class Personaje.
     */


     public Cazador CrearPersonajeBase () {

        Habilidad habilidad = new Habilidad("habilidad", 10, 10, 0);
        Arma arma = new Arma("arma", "10", "10", "de2manos");
        Arma[] armas = new Arma[1];
        armas[0] = arma;
        Armadura armadura = new Armadura("armadura", "10", "5");
        Armadura[] armaduras = new Armadura[1];
        armaduras[0] = armadura;
        Esbirro esbirro = new Esbirro("esbirro", 10);
        Esbirro[] esbirros = new Esbirro[1];
        esbirros[0] = esbirro;
        Debilidad debilidad = new Debilidad("debilidad", 0);
        Debilidad[] debilidades = new Debilidad[1];
        debilidades[0] = debilidad;
        Fortaleza fortaleza = new Fortaleza("fortaleza", 0);
        Fortaleza[] fortalezas = new Fortaleza[1];
        fortalezas[0] = fortaleza;
        Cazador instance = new Cazador("nombre", habilidad, armas, armas, armaduras, armadura, esbirros, 0, 10, debilidades, fortalezas); 
        instance.setVoluntad(10);

        return instance;

    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Personaje instance = CrearPersonajeBase();
        String expResult = "nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Personaje.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "nombre2";
        Personaje instance = CrearPersonajeBase();
        instance.setNombre(nombre);
        assertNotEquals(instance.getNombre(),nombre);
    }

    /**
     * Test of getHabilidadPersonaje method, of class Personaje.
     */
    @Test
    public void testGetHabilidadPersonaje() {
        System.out.println("getHabilidadPersonaje");
        Personaje instance = null;
        Habilidad expResult = null;
        Habilidad result = instance.getHabilidadPersonaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHabilidadPersonaje method, of class Personaje.
     */
    @Test
    public void testSetHabilidadPersonaje() {
        System.out.println("setHabilidadPersonaje");
        Habilidad habilidadPersonaje = null;
        Personaje instance = null;
        instance.setHabilidadPersonaje(habilidadPersonaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmas method, of class Personaje.
     */
    @Test
    public void testGetArmas() {
        System.out.println("getArmas");
        Personaje instance = null;
        Arma[] expResult = null;
        Arma[] result = instance.getArmas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArmas method, of class Personaje.
     */
    @Test
    public void testSetArmas() {
        System.out.println("setArmas");
        Arma[] armas = null;
        Personaje instance = null;
        instance.setArmas(armas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmasActivas method, of class Personaje.
     */
    @Test
    public void testGetArmasActivas() {
        System.out.println("getArmasActivas");
        Personaje instance = null;
        Arma[] expResult = null;
        Arma[] result = instance.getArmasActivas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArmasActivas method, of class Personaje.
     */
    @Test
    public void testSetArmasActivas() {
        System.out.println("setArmasActivas");
        Arma[] armasActivas = null;
        Personaje instance = null;
        instance.setArmasActivas(armasActivas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmaduras method, of class Personaje.
     */
    @Test
    public void testGetArmaduras() {
        System.out.println("getArmaduras");
        Personaje instance = null;
        Armadura[] expResult = null;
        Armadura[] result = instance.getArmaduras();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArmaduras method, of class Personaje.
     */
    @Test
    public void testSetArmaduras() {
        System.out.println("setArmaduras");
        Armadura[] armaduras = null;
        Personaje instance = null;
        instance.setArmaduras(armaduras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmaduraActiva method, of class Personaje.
     */
    @Test
    public void testGetArmaduraActiva() {
        System.out.println("getArmaduraActiva");
        Personaje instance = null;
        Armadura expResult = null;
        Armadura result = instance.getArmaduraActiva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArmaduraActiva method, of class Personaje.
     */
    @Test
    public void testSetArmaduraActiva() {
        System.out.println("setArmaduraActiva");
        Armadura armaduraActiva = null;
        Personaje instance = null;
        instance.setArmaduraActiva(armaduraActiva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEsbirros method, of class Personaje.
     */
    @Test
    public void testGetEsbirros() {
        System.out.println("getEsbirros");
        Personaje instance = null;
        Esbirro[] expResult = null;
        Esbirro[] result = instance.getEsbirros();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEsbirros method, of class Personaje.
     */
    @Test
    public void testSetEsbirros() {
        System.out.println("setEsbirros");
        Esbirro[] esbirros = null;
        Personaje instance = null;
        instance.setEsbirros(esbirros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalud method, of class Personaje.
     */
    @Test
    public void testGetSalud() {
        System.out.println("getSalud");
        Personaje instance = null;
        int expResult = 0;
        int result = instance.getSalud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalud method, of class Personaje.
     */
    @Test
    public void testSetSalud() {
        System.out.println("setSalud");
        int Salud = 0;
        Personaje instance = null;
        instance.setSalud(Salud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoder method, of class Personaje.
     */
    @Test
    public void testGetPoder() {
        System.out.println("getPoder");
        Personaje instance = null;
        int expResult = 0;
        int result = instance.getPoder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoder method, of class Personaje.
     */
    @Test
    public void testSetPoder() {
        System.out.println("setPoder");
        int Poder = 0;
        Personaje instance = null;
        instance.setPoder(Poder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDebilidades method, of class Personaje.
     */
    @Test
    public void testGetDebilidades() {
        System.out.println("getDebilidades");
        Personaje instance = null;
        Debilidad[] expResult = null;
        Debilidad[] result = instance.getDebilidades();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDebilidades method, of class Personaje.
     */
    @Test
    public void testSetDebilidades() {
        System.out.println("setDebilidades");
        Debilidad[] debilidades = null;
        Personaje instance = null;
        instance.setDebilidades(debilidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFortalezas method, of class Personaje.
     */
    @Test
    public void testGetFortalezas() {
        System.out.println("getFortalezas");
        Personaje instance = null;
        Fortaleza[] expResult = null;
        Fortaleza[] result = instance.getFortalezas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFortalezas method, of class Personaje.
     */
    @Test
    public void testSetFortalezas() {
        System.out.println("setFortalezas");
        Fortaleza[] fortalezas = null;
        Personaje instance = null;
        instance.setFortalezas(fortalezas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverPoder method, of class Personaje.
     */
    @Test
    public void testDevolverPoder() {
        System.out.println("devolverPoder");
        Personaje instance = null;
        int expResult = 0;
        int result = instance.devolverPoder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverHabilidad method, of class Personaje.
     */
    @Test
    public void testDevolverHabilidad() {
        System.out.println("devolverHabilidad");
        Personaje instance = null;
        Habilidad expResult = null;
        Habilidad result = instance.devolverHabilidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverDañoArma method, of class Personaje.
     */
    @Test
    public void testDevolverDañoArma() {
        System.out.println("devolverDa\u00f1oArma");
        Personaje instance = null;
        int expResult = 0;
        int result = instance.devolverDañoArma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverDefensaArma method, of class Personaje.
     */
    @Test
    public void testDevolverDefensaArma() {
        System.out.println("devolverDefensaArma");
        Personaje instance = null;
        int expResult = 0;
        int result = instance.devolverDefensaArma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoDanio method, of class Personaje.
     */
    @Test
    public void testCalculoDanio() {
        System.out.println("calculoDanio");
        Personaje instance = null;
        int expResult = 0;
        int result = instance.calculoDanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoDefensa method, of class Personaje.
     */
    @Test
    public void testCalculoDefensa() {
        System.out.println("calculoDefensa");
        Personaje instance = null;
        int expResult = 0;
        int result = instance.calculoDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculoVida method, of class Personaje.
     */
    @Test
    public void testCalculoVida() {
        System.out.println("calculoVida");
        Personaje instance = null;
        int expResult = 0;
        int result = instance.calculoVida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarArmas method, of class Personaje.
     */
    @Test
    public void testMostrarArmas() {
        System.out.println("MostrarArmas");
        Personaje personajeEle = null;
        Personaje instance = null;
        instance.MostrarArmas(personajeEle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarArmasActivas method, of class Personaje.
     */
    @Test
    public void testMostrarArmasActivas() {
        System.out.println("MostrarArmasActivas");
        Personaje personajeEle = null;
        Personaje instance = null;
        instance.MostrarArmasActivas(personajeEle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarArmaduras method, of class Personaje.
     */
    @Test
    public void testMostrarArmaduras() {
        System.out.println("MostrarArmaduras");
        Personaje personajeEle = null;
        Personaje instance = null;
        instance.MostrarArmaduras(personajeEle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarDebilidades method, of class Personaje.
     */
    @Test
    public void testMostrarDebilidades() {
        System.out.println("MostrarDebilidades");
        Personaje personajeEle = null;
        Personaje instance = null;
        instance.MostrarDebilidades(personajeEle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarFortalezas method, of class Personaje.
     */
    @Test
    public void testMostrarFortalezas() {
        System.out.println("MostrarFortalezas");
        Personaje personajeEle = null;
        Personaje instance = null;
        instance.MostrarFortalezas(personajeEle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarPersonajeOperador method, of class Personaje.
     */
    @Test
    public void testEditarPersonajeOperador() {
        System.out.println("editarPersonajeOperador");
        Personaje personajeEle = null;
        EntidadesActivas entidades = null;
        Personaje instance = null;
        instance.editarPersonajeOperador(personajeEle, entidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarPersonajeJugador method, of class Personaje.
     */
    @Test
    public void testEditarPersonajeJugador() {
        System.out.println("editarPersonajeJugador");
        Personaje personajeEle = null;
        EntidadesActivas entidades = null;
        Personaje instance = null;
        instance.editarPersonajeJugador(personajeEle, entidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarPropiedadesEspecificas method, of class Personaje.
     */
    @Test
    public void testRellenarPropiedadesEspecificas() {
        System.out.println("rellenarPropiedadesEspecificas");
        Personaje instance = null;
        instance.rellenarPropiedadesEspecificas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverDañoHabilidad method, of class Personaje.
     */
    @Test
    public void testDevolverDañoHabilidad() {
        System.out.println("devolverDa\u00f1oHabilidad");
        Habilidad habilidad = null;
        Personaje instance = null;
        int expResult = 0;
        int result = instance.devolverDañoHabilidad(habilidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clonar method, of class Personaje.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Personaje instance = null;
        Personaje expResult = null;
        Personaje result = instance.clonar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarDebilidad method, of class Personaje.
     */
    @Test
    public void testSeleccionarDebilidad() {
        System.out.println("seleccionarDebilidad");
        String factor = "";
        Personaje instance = null;
        Debilidad expResult = null;
        Debilidad result = instance.seleccionarDebilidad(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarFortaleza method, of class Personaje.
     */
    @Test
    public void testSeleccionarFortaleza() {
        System.out.println("seleccionarFortaleza");
        String factor = "";
        Personaje instance = null;
        Fortaleza expResult = null;
        Fortaleza result = instance.seleccionarFortaleza(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonajeImpl extends Personaje {

        public PersonajeImpl() {
            super("", null, null, null, null, null, null, 0, 0, null, null);
        }

        public int calculoDanio() {
            return 0;
        }

        public int calculoDefensa() {
            return 0;
        }
    }
    
}
