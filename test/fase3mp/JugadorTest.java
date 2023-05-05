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
public class JugadorTest {
    
    public JugadorTest() {
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
     * Test of getOro method, of class Jugador.
     */
    @Test
    public void testGetOro() {
        System.out.println("getOro");
        Jugador instance = null;
        int expResult = 0;
        int result = instance.getOro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOro method, of class Jugador.
     */
    @Test
    public void testSetOro() {
        System.out.println("setOro");
        int oro = 500;
        Jugador instance = null;
        //Jugador instance = new Jugador();
        instance.setOro(oro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotificador method, of class Jugador.
     */
    @Test
    public void testGetNotificador() {
        System.out.println("getNotificador");
        Jugador instance = null;
        Publisher expResult = null;
        Publisher result = instance.getNotificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotificador method, of class Jugador.
     */
    @Test
    public void testSetNotificador() {
        System.out.println("setNotificador");
        Publisher notificador = null;
        Jugador instance = null;
        instance.setNotificador(notificador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstaBaneado method, of class Jugador.
     */
    @Test
    public void testGetEstaBaneado() {
        System.out.println("getEstaBaneado");
        Jugador instance = null;
        boolean expResult = false;
        boolean result = instance.getEstaBaneado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstaBaneado method, of class Jugador.
     */
    @Test
    public void testSetEstaBaneado() {
        System.out.println("setEstaBaneado");
        boolean estaBaneado = false;
        Jugador instance = null;
        instance.setEstaBaneado(estaBaneado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonajeActivo method, of class Jugador.
     */
    @Test
    public void testGetPersonajeActivo() {
        System.out.println("getPersonajeActivo");
        Jugador instance = null;
        Personaje expResult = null;
        Personaje result = instance.getPersonajeActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonajeActivo method, of class Jugador.
     */
    @Test
    public void testSetPersonajeActivo() {
        System.out.println("setPersonajeActivo");
        Personaje personajeActivo = null;
        Jugador instance = null;
        instance.setPersonajeActivo(personajeActivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroRegistro method, of class Jugador.
     */
    @Test
    public void testGetNumeroRegistro() {
        System.out.println("getNumeroRegistro");
        Jugador instance = null;
        String expResult = "";
        String result = instance.getNumeroRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroRegistro method, of class Jugador.
     */
    @Test
    public void testSetNumeroRegistro() {
        System.out.println("setNumeroRegistro");
        String NumeroRegistro = "";
        Jugador instance = null;
        instance.setNumeroRegistro(NumeroRegistro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManager method, of class Jugador.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        Jugador instance = null;
        ManagerUsuarios expResult = null;
        ManagerUsuarios result = instance.getManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManager method, of class Jugador.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        ManagerUsuarios manager = null;
        Jugador instance = null;
        instance.setManager(manager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRankingGlobal method, of class Jugador.
     */
    @Test
    public void testGetRankingGlobal() {
        System.out.println("getRankingGlobal");
        Jugador instance = null;
        Ranking expResult = null;
        Ranking result = instance.getRankingGlobal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRankingGlobal method, of class Jugador.
     */
    @Test
    public void testSetRankingGlobal() {
        System.out.println("setRankingGlobal");
        Ranking rankingGlobal = null;
        Jugador instance = null;
        instance.setRankingGlobal(rankingGlobal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AceptaroRechazarDesafio method, of class Jugador.
     */
    @Test
    public void testAceptaroRechazarDesafio() {
        System.out.println("AceptaroRechazarDesafio");
        Desafio desafio = null;
        Jugador instance = null;
        instance.AceptaroRechazarDesafio(desafio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resultadosCombate method, of class Jugador.
     */
    @Test
    public void testResultadosCombate() {
        System.out.println("resultadosCombate");
        Combate combate = null;
        Jugador instance = null;
        instance.resultadosCombate(combate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persistenciaDesafio method, of class Jugador.
     */
    @Test
    public void testPersistenciaDesafio() throws Exception {
        System.out.println("persistenciaDesafio");
        Desafio desafio = null;
        Jugador instance = null;
        instance.persistenciaDesafio(desafio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizarFuncionMenuJugador method, of class Jugador.
     */
    @Test
    public void testRealizarFuncionMenuJugador() throws Exception {
        System.out.println("realizarFuncionMenuJugador");
        int opcion = 0;
        Jugador instance = null;
        instance.realizarFuncionMenuJugador(opcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
