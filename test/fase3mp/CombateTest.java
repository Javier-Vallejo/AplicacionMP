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
public class CombateTest {
    
    public CombateTest() {
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
     * Test of setRondas method, of class Combate.
     */

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


    public Combate crearCombate() {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador jugadorA = new Jugador("a", "b", "123",TipoUsuario.Jugador , 0, managerUsuarios);
        Jugador jugadorB = new Jugador("B", "b", "123",TipoUsuario.Jugador , 0, managerUsuarios);
        Cazador cazador = CrearCazadorBase();
        Cazador cazador2 = CrearCazadorBase();
        jugadorA.setPersonajeActivo(cazador);
        jugadorB.setPersonajeActivo(cazador2);
        Combate instance = new Combate(jugadorA, jugadorB, 0);
        return instance;
    }

    @Test
    public void testSetRondas() {
        System.out.println("setRondas");
        Ronda[] rondas = new Ronda[1];
        Ronda[] rondasVacias = new Ronda[1];
        Ronda ronda = new Ronda();
        ronda.setPotencialPer1(10);
        ronda.setPotencialPer2(10);
        rondas[0] = ronda;
        Combate instance = crearCombate();
        instance.setRondas(rondas);
        assertNotEquals(instance.getRondas(),rondasVacias);
        
    }

    /**
     * Test of getRondas method, of class Combate.
     */
    @Test
    public void testGetRondas() {
        System.out.println("getRondas");
        Combate instance = crearCombate();
        Ronda[] rondas = new Ronda[1];
        Ronda[] rondasVacias = new Ronda[1];
        Ronda ronda = new Ronda();
        ronda.setPotencialPer1(10);
        ronda.setPotencialPer2(10);
        rondas[0] = ronda;
        instance.setRondas(rondas);
        Ronda[] result = instance.getRondas();
        Ronda[] expResult = rondas;
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of getDesafiante method, of class Combate.
     */
    @Test
    public void testGetDesafiante() {
        System.out.println("getDesafiante");
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Combate instance = crearCombate();
        Jugador expResult = new Jugador("a", "b", "123",TipoUsuario.Jugador , 0, managerUsuarios);;
        Jugador result = instance.getDesafiante();
        assertEquals(expResult.getNick(), result.getNick());
       
    }

    /**
     * Test of getDesafiado method, of class Combate.
     */
    @Test
    public void testGetDesafiado() {
        System.out.println("getDesafiado");
        Combate instance = null;
        Jugador expResult = null;
        Jugador result = instance.getDesafiado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Combate.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Combate instance = null;
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVencedor method, of class Combate.
     */
    @Test
    public void testGetVencedor() {
        System.out.println("getVencedor");
        Combate instance = null;
        String expResult = "";
        String result = instance.getVencedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJugadoresConEsbirros method, of class Combate.
     */
    @Test
    public void testGetJugadoresConEsbirros() {
        System.out.println("getJugadoresConEsbirros");
        Combate instance = null;
        ArrayList<Personaje> expResult = null;
        ArrayList<Personaje> result = instance.getJugadoresConEsbirros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOroGanado method, of class Combate.
     */
    @Test
    public void testGetOroGanado() {
        System.out.println("getOroGanado");
        Combate instance = null;
        int expResult = 0;
        int result = instance.getOroGanado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonaje1 method, of class Combate.
     */
    @Test
    public void testGetPersonaje1() {
        System.out.println("getPersonaje1");
        Combate instance = null;
        Personaje expResult = null;
        Personaje result = instance.getPersonaje1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonaje2 method, of class Combate.
     */
    @Test
    public void testGetPersonaje2() {
        System.out.println("getPersonaje2");
        Combate instance = null;
        Personaje expResult = null;
        Personaje result = instance.getPersonaje2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVida1 method, of class Combate.
     */
    @Test
    public void testGetVida1() {
        System.out.println("getVida1");
        Combate instance = null;
        int expResult = 0;
        int result = instance.getVida1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVida2 method, of class Combate.
     */
    @Test
    public void testGetVida2() {
        System.out.println("getVida2");
        Combate instance = null;
        int expResult = 0;
        int result = instance.getVida2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesafiante method, of class Combate.
     */
    @Test
    public void testSetDesafiante() {
        System.out.println("setDesafiante");
        Jugador desafiante = null;
        Combate instance = null;
        instance.setDesafiante(desafiante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesafiado method, of class Combate.
     */
    @Test
    public void testSetDesafiado() {
        System.out.println("setDesafiado");
        Jugador desafiado = null;
        Combate instance = null;
        instance.setDesafiado(desafiado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Combate.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Combate instance = null;
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVencedor method, of class Combate.
     */
    @Test
    public void testSetVencedor() {
        System.out.println("setVencedor");
        String Vencedor = "";
        Combate instance = null;
        instance.setVencedor(Vencedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJugadoresConEsbirros method, of class Combate.
     */
    @Test
    public void testSetJugadoresConEsbirros() {
        System.out.println("setJugadoresConEsbirros");
        ArrayList<Personaje> jugadoresConEsbirros = null;
        Combate instance = null;
        instance.setJugadoresConEsbirros(jugadoresConEsbirros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOroGanado method, of class Combate.
     */
    @Test
    public void testSetOroGanado() {
        System.out.println("setOroGanado");
        int oroGanado = 0;
        Combate instance = null;
        instance.setOroGanado(oroGanado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonaje1 method, of class Combate.
     */
    @Test
    public void testSetPersonaje1() {
        System.out.println("setPersonaje1");
        Personaje personaje1 = null;
        Combate instance = null;
        instance.setPersonaje1(personaje1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonaje2 method, of class Combate.
     */
    @Test
    public void testSetPersonaje2() {
        System.out.println("setPersonaje2");
        Personaje personaje2 = null;
        Combate instance = null;
        instance.setPersonaje2(personaje2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVida1 method, of class Combate.
     */
    @Test
    public void testSetVida1() {
        System.out.println("setVida1");
        int vida1 = 0;
        Combate instance = null;
        instance.setVida1(vida1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVida2 method, of class Combate.
     */
    @Test
    public void testSetVida2() {
        System.out.println("setVida2");
        int vida2 = 0;
        Combate instance = null;
        instance.setVida2(vida2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EmpezarRonda method, of class Combate.
     */
    @Test
    public void testEmpezarRonda() {
        System.out.println("EmpezarRonda");
        Personaje per1 = null;
        Personaje per2 = null;
        int vida1 = 0;
        int vida2 = 0;
        ArrayList<Fortaleza> fortalezasElegidaDesafiante = null;
        ArrayList<Debilidad> debilidadesElegidaDesafiante = null;
        ArrayList<Fortaleza> fortalezasElegidaDesafiado = null;
        ArrayList<Debilidad> debilidadesElegidaDesafiado = null;
        Combate instance = null;
        Ronda expResult = null;
        Ronda result = instance.EmpezarRonda(per1, per2, vida1, vida2, fortalezasElegidaDesafiante, debilidadesElegidaDesafiante, fortalezasElegidaDesafiado, debilidadesElegidaDesafiado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
