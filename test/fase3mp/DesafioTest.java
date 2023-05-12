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
public class DesafioTest {

    public DesafioTest() {
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

    public Desafio CrearDesafio() {
        Desafio instance = new Desafio();
        ArrayList<Fortaleza> result = new ArrayList<>();
        Fortaleza fortaleza = new Fortaleza("fortaleza", 0);
        result.add(fortaleza);
        instance.setFElegDesafiante(result);
        instance.setFElegDesafiado(result);
        ArrayList<Debilidad> debilidades = new ArrayList<>();
        Debilidad debilidad = new Debilidad("debilidad", 0);
        debilidades.add(debilidad);
        instance.setDElegDesafiante(debilidades);
        instance.setDElegDesafiado(debilidades);
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();

        Jugador jugadorA = new Jugador("a", "A", "123", TipoUsuario.Jugador, 0, managerUsuarios);
        Jugador jugadorB = new Jugador("B", "B", "883", TipoUsuario.Jugador, 0, managerUsuarios);
        Cazador cazador = CrearCazadorBase();
        cazador.setPoder(5);
        Cazador cazador2 = CrearCazadorBase();
        jugadorA.setPersonajeActivo(cazador);
        jugadorB.setPersonajeActivo(cazador2);
        instance.setJugadorDesafiante(jugadorA);
        instance.setJugadorDesafiado(jugadorB);
        
        instance.setOroApostado(100);

        instance.setEstado(Desafio.State.Validado);


        return instance;
    }

    public Cazador CrearCazadorBase() {

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
        Cazador instance = new Cazador("nombre", habilidad, armas, armas, armaduras, armadura, esbirros, 3, 3,
                debilidades, fortalezas);
        instance.setVoluntad(10);

        return instance;

    }

    /**
     * Test of getFElegDesafiante method, of class Desafio.
     */
    @Test
    public void testGetFElegDesafiante() {
        System.out.println("getFElegDesafiante");
        Desafio instance = CrearDesafio();
        ArrayList<Fortaleza> result = new ArrayList<>();
        Fortaleza fortaleza = new Fortaleza("fortaleza", 0);
        result.add(fortaleza);
        instance.setFElegDesafiante(result);
        assertEquals(instance.getFElegDesafiante(), result);
    }

    /**
     * Test of getFElegDesafiado method, of class Desafio.
     */
    @Test
    public void testGetFElegDesafiado() {
        System.out.println("getFElegDesafiado");
        Desafio instance = CrearDesafio();
        ArrayList<Fortaleza> result = new ArrayList<>();
        Fortaleza fortaleza = new Fortaleza("fortaleza", 0);
        result.add(fortaleza);
        instance.setFElegDesafiado(result);
        assertEquals(instance.getFElegDesafiado(), result);
    }

    /**
     * Test of getDElegDesafiante method, of class Desafio.
     */
    @Test
    public void testGetDElegDesafiante() {
        System.out.println("getDElegDesafiante");
        Desafio instance = CrearDesafio();
        ArrayList<Debilidad> result = new ArrayList<>();
        Debilidad debilidad = new Debilidad("debilidad", 0);
        result.add(debilidad);
        instance.setDElegDesafiante(result);
        assertEquals(instance.getDElegDesafiante(), result);
    }

    /**
     * Test of getDElegDesafiado method, of class Desafio.
     */
    @Test
    public void testGetDElegDesafiado() {
        System.out.println("getDElegDesafiado");
        Desafio instance = CrearDesafio();
        ArrayList<Debilidad> result = new ArrayList<>();
        Debilidad debilidad = new Debilidad("debilidad", 0);
        result.add(debilidad);
        instance.setDElegDesafiado(result);
        assertEquals(instance.getDElegDesafiado(), result);
    }

    /**
     * Test of setFElegDesafiante method, of class Desafio.
     */
    @Test
    public void testSetFElegDesafiante() {
        System.out.println("setFElegDesafiante");
        Desafio instance = CrearDesafio();
        ArrayList<Fortaleza> valorAntiguo = instance.getFElegDesafiante();
        ArrayList<Fortaleza> valorNuevo = new ArrayList<>();
        instance.setFElegDesafiante(valorNuevo);
        assertNotEquals(valorAntiguo, valorNuevo);
    }

    /**
     * Test of setFElegDesafiado method, of class Desafio.
     */
    @Test
    public void testSetFElegDesafiado() {
        System.out.println("setFElegDesafiado");
        Desafio instance = CrearDesafio();
        ArrayList<Fortaleza> valorAntiguo = instance.getFElegDesafiado();
        ArrayList<Fortaleza> valorNuevo = new ArrayList<>();
        instance.setFElegDesafiado(valorNuevo);
        assertNotEquals(valorAntiguo, valorNuevo);
    }

    /**
     * Test of setDElegDesafiante method, of class Desafio.
     */
    @Test
    public void testSetDElegDesafiante() {
        System.out.println("setDElegDesafiante");
        Desafio instance = CrearDesafio();
        ArrayList<Debilidad> valorAntiguo = instance.getDElegDesafiante();
        ArrayList<Debilidad> valorNuevo = new ArrayList<>();
        instance.setDElegDesafiante(valorNuevo);
        assertNotEquals(valorAntiguo, valorNuevo);
    }

    /**
     * Test of setDElegDesafiado method, of class Desafio.
     */
    @Test
    public void testSetDElegDesafiado() {
        System.out.println("setDElegDesafiado");
        Desafio instance = CrearDesafio();
        ArrayList<Debilidad> valorAntiguo = instance.getDElegDesafiado();
        ArrayList<Debilidad> valorNuevo = new ArrayList<>();
        instance.setDElegDesafiado(valorNuevo);
        assertNotEquals(valorAntiguo, valorNuevo);
    }

    /**
     * Test of getJugadorDesafiante method, of class Desafio.
     */
    @Test
    public void testGetJugadorDesafiante() {
        System.out.println("getJugadorDesafiante");
        Desafio instance = CrearDesafio();
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador expResult = new Jugador("a", "A", "123", TipoUsuario.Jugador, 0, managerUsuarios);
        instance.setJugadorDesafiante(expResult);
        assertEquals(expResult, instance.getJugadorDesafiante());

    }

    /**
     * Test of setJugadorDesafiante method, of class Desafio.
     */
    @Test
    public void testSetJugadorDesafiante() {
        System.out.println("setJugadorDesafiante");
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador nuevojugadorDesafiante = new Jugador("a", "aa", "123", TipoUsuario.Jugador, 0, managerUsuarios);
        Desafio instance = CrearDesafio();
        Jugador jugadorAntiguo = instance.getJugadorDesafiante();
        instance.setJugadorDesafiante(nuevojugadorDesafiante);
        assertNotEquals(nuevojugadorDesafiante, jugadorAntiguo);
    }

    /**
     * Test of getJugadorDesafiado method, of class Desafio.
     */
    @Test
    public void testGetJugadorDesafiado() {
        System.out.println("getJugadorDesafiado");
        Desafio instance = CrearDesafio();
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador expResult = new Jugador("B", "B", "883", TipoUsuario.Jugador, 0, managerUsuarios);;
        instance.setJugadorDesafiado(expResult);
        Jugador result = instance.getJugadorDesafiado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setJugadorDesafiado method, of class Desafio.
     */
    @Test
    public void testSetJugadorDesafiado() {
        System.out.println("setJugadorDesafiado");
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador nuevojugadorDesafiado = new Jugador("B", "A", "883", TipoUsuario.Jugador, 0, managerUsuarios);
        Desafio instance = CrearDesafio();
        Jugador jugadorAntiguo = instance.getJugadorDesafiado();
        instance.setJugadorDesafiado(nuevojugadorDesafiado);
        assertNotEquals(nuevojugadorDesafiado, jugadorAntiguo);
    }

    /**
     * Test of getOroApostado method, of class Desafio.
     */
    @Test
    public void testGetOroApostado() {
        System.out.println("getOroApostado");
        Desafio instance = CrearDesafio();
        int expResult = 100;
        int result = instance.getOroApostado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOroApostado method, of class Desafio.
     */
    @Test
    public void testSetOroApostado() {
        System.out.println("setOroApostado");
        int nuevoOroApostado = 220;
        Desafio instance = new Desafio();
        int antiguoOroApostado = instance.getOroApostado();
        instance.setOroApostado(nuevoOroApostado);
        assertNotEquals(antiguoOroApostado,nuevoOroApostado);
    }

    /**
     * Test of getEstado method, of class Desafio.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Desafio instance = CrearDesafio();
        Desafio.State expResult = Desafio.State.Validado;
        Desafio.State result = instance.getEstado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEstado method, of class Desafio.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        Desafio.State nuevoEstado = Desafio.State.NoValidado;
        Desafio instance = CrearDesafio();
        Desafio.State estado = instance.getEstado();
        instance.setEstado(estado);
        assertNotEquals(nuevoEstado,estado);
    }

}
