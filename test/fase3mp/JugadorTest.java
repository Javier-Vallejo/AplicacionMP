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

    public Cazador CrearCazadorBase () {

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
    public Jugador crearJugador(Publisher notificador, Personaje personaje, ManagerUsuarios managerUsuarios, Ranking ranking){
        Jugador instance = new Jugador("a", "A", "123",TipoUsuario.Jugador , 10, managerUsuarios);
        instance.setEstaBaneado(false);
        instance.setNotificador(notificador);
        instance.setPersonajeActivo(personaje);
        instance.setNumeroRegistro("1234567");
        instance.setRankingGlobal(ranking);
        return instance;
    }
    /**
     * Test of getOro method, of class Jugador.
     */
    @Test
    public void testGetOro() {
        System.out.println("getOro");
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, manager, null);
        int expResult = 10;
        int result = instance.getOro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOro method, of class Jugador.
     */
    @Test
    public void testSetOro() {
        System.out.println("setOro");
        ManagerUsuarios manager = new ManagerUsuarios();
        int oro = 500;
        Jugador instance = crearJugador(null, null, manager, null);
        int oroAntiguo = instance.getOro();
        instance.setOro(oro);
        assertNotEquals(oroAntiguo, instance.getOro());
    }

    /**
     * Test of getNotificador method, of class Jugador.
     */
    @Test
    public void testGetNotificador() {
        System.out.println("getNotificador");
        ManagerUsuarios manager = new ManagerUsuarios();
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, null, manager, null);
        Publisher result = instance.getNotificador();
        assertEquals(notificador, result);
    }


    /**
     * Test of setNotificador method, of class Jugador.
     */
    @Test
    public void testSetNotificador() {
        System.out.println("setNotificador");
        ManagerUsuarios manager = new ManagerUsuarios();
        Publisher notificadorAntiguo = new Publisher();
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificadorAntiguo, null, manager, null);
        instance.setNotificador(notificador);
        assertNotEquals(instance.getNotificador(), notificadorAntiguo);
    }

    /**
     * Test of getEstaBaneado method, of class Jugador.
     */
    @Test
    public void testGetEstaBaneado() {
        System.out.println("getEstaBaneado");
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, manager, null);
        boolean expResult = false;
        boolean result = instance.getEstaBaneado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEstaBaneado method, of class Jugador.
     */
    @Test
    public void testSetEstaBaneado() {
        System.out.println("setEstaBaneado");
        ManagerUsuarios manager = new ManagerUsuarios();
        boolean estaBaneado = true;
        Jugador instance = crearJugador(null, null, manager, null);
        boolean estadoAntiguo = instance.getEstaBaneado();
        instance.setEstaBaneado(estaBaneado);
        assertNotEquals(estadoAntiguo, instance.getEstaBaneado());
    }

    /**
     * Test of getPersonajeActivo method, of class Jugador.
     */
    @Test
    public void testGetPersonajeActivo() {
        System.out.println("getPersonajeActivo");
        ManagerUsuarios manager = new ManagerUsuarios();
        Personaje expResult = CrearCazadorBase();
        Jugador instance = crearJugador(null, expResult, manager, null);
        Personaje result = instance.getPersonajeActivo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPersonajeActivo method, of class Jugador.
     */
    @Test
    public void testSetPersonajeActivo() {
        System.out.println("setPersonajeActivo");
        ManagerUsuarios manager = new ManagerUsuarios();
        Personaje personajeActivoAntiguo = CrearCazadorBase();
        Jugador instance = crearJugador(null, personajeActivoAntiguo, manager, null);
        Personaje personajeActivo = CrearCazadorBase();
        instance.setPersonajeActivo(personajeActivo);
        assertNotEquals(personajeActivoAntiguo, instance.getPersonajeActivo());
    }

    /**
     * Test of getNumeroRegistro method, of class Jugador.
     */
    @Test
    public void testGetNumeroRegistro() {
        System.out.println("getNumeroRegistro");
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, manager, null);
        String expResult = "1234567";
        String result = instance.getNumeroRegistro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumeroRegistro method, of class Jugador.
     */
    @Test
    public void testSetNumeroRegistro() {
        System.out.println("setNumeroRegistro");
        ManagerUsuarios manager = new ManagerUsuarios();
        String NumeroRegistro = "7654321";
        Jugador instance = crearJugador(null, null, manager, null);
        String NumAntiguo = instance.getNumeroRegistro();
        instance.setNumeroRegistro(NumeroRegistro);
        assertNotEquals(NumAntiguo, instance.getNumeroRegistro());
    }

    /**
     * Test of getManager method, of class Jugador.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        ManagerUsuarios expResult = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, expResult, null);
        ManagerUsuarios result = instance.getManager();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManager method, of class Jugador.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        ManagerUsuarios managerAntiguo = new ManagerUsuarios();
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, managerAntiguo, null);
        instance.setManager(manager);
        assertNotEquals(managerAntiguo, instance.getManager());
    }

    /**
     * Test of getRankingGlobal method, of class Jugador.
     */
    @Test
    public void testGetRankingGlobal() {
        System.out.println("getRankingGlobal");
        ManagerUsuarios manager = new ManagerUsuarios();
        Ranking expResult = new Ranking();
        Jugador instance = crearJugador(null, null, manager, expResult);
        Ranking result = instance.getRankingGlobal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRankingGlobal method, of class Jugador.
     */
    @Test
    public void testSetRankingGlobal() {
        System.out.println("setRankingGlobal");
        ManagerUsuarios manager = new ManagerUsuarios();
        Ranking rankingAnterior = new Ranking();
        Ranking rankingGlobal = new Ranking();;
        Jugador instance = crearJugador(null, null, manager, rankingAnterior);;
        instance.setRankingGlobal(rankingGlobal);
        assertNotEquals(rankingAnterior, instance.getRankingGlobal());
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
