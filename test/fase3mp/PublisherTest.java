/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import static fase3mp.TipoUsuario.Jugador;
import static fase3mp.TipoUsuario.OperadorSistema;
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
public class PublisherTest {
    
    public PublisherTest() {
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
        Cazador instance = new Cazador("nombre", habilidad, armas, armas, armaduras, armadura, esbirros, 3, 3, debilidades, fortalezas); 
        instance.setVoluntad(10);

        return instance;

    }
    public Combate crearCombate() {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador jugadorA = new Jugador("a", "A", "123",TipoUsuario.Jugador , 0, managerUsuarios);
        Jugador jugadorB = new Jugador("B", "b", "123",TipoUsuario.Jugador , 0, managerUsuarios);
        Cazador cazador = CrearCazadorBase();
        cazador.setPoder(5);
        Cazador cazador2 = CrearCazadorBase();
        jugadorA.setPersonajeActivo(cazador);
        jugadorB.setPersonajeActivo(cazador2);
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(cazador);
        personajes.add(cazador2);
        Combate instance = new Combate(jugadorA, jugadorB, 100);
        instance.setFecha("10/05/2023");
        
        /*
         *  se asimila que en este test de combate al crear 2 cazadores iguales y leugo darle mas poder al desfiante
         * el ganador es el jugador desafiante
         */

        instance.setJugadoresConEsbirros(personajes);
        instance.setVencedor("A");
        instance.setVida1(3);
        instance.setVida2(1);
        return instance;
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
    /**
     * Test of suscribirUsuario method, of class Publisher.
     */
    @Test
    public void testSuscribirUsuario() {
        System.out.println("suscribirUsuario");
        ManagerUsuarios manager = new ManagerUsuarios();
        Usuario usuario = new Usuario("Juan", "ElBoss", "1234", Jugador, manager);
        Usuario usuario2 = new Usuario("David", "Gambon", "854796", OperadorSistema, manager);
        Usuario usuario3 = new Usuario("Javi", "Javs", "78946321", Jugador, manager);
        Publisher instance = new Publisher();
        instance.suscribirUsuario(usuario);
        instance.suscribirUsuario(usuario3);
        boolean result = instance.getSuscriptores().contains(usuario);
        assertEquals(true, result);
        result = instance.getSuscriptores().contains(usuario3);
        assertEquals(true, result);
        result = instance.getSuscriptores().contains(usuario2);
        assertNotEquals(true, result);
    }

    /**
     * Test of desSuscribirUsuario method, of class Publisher.
     */
    @Test
    public void testDesSuscribirUsuario() {
        System.out.println("desSuscribirUsuario");
        ManagerUsuarios manager = new ManagerUsuarios();
        Usuario usuario = new Usuario("Juan", "ElBoss", "1234", Jugador, manager);
        Usuario usuario3 = new Usuario("Javi", "Javs", "78946321", Jugador, manager);
        Publisher instance = new Publisher();
        instance.suscribirUsuario(usuario);
        instance.suscribirUsuario(usuario3);
        Boolean result = instance.getSuscriptores().contains(usuario);
        assertEquals(true, result);
        instance.desSuscribirUsuario(usuario);
        result = instance.getSuscriptores().contains(usuario);
        assertEquals(false, result);
        result = instance.getSuscriptores().contains(usuario3);
        assertEquals(true, result);
    }

    /**
     * Test of notificarUsuario method, of class Publisher.
     */
    @Test
    public void testNotificarUsuario() {
        System.out.println("notificarUsuario");
        Combate batalla = crearCombate();
        Desafio desafio = CrearDesafio();
        Object objetoX = null;
        ManagerUsuarios manager = new ManagerUsuarios();
        Publisher instance = new Publisher();
        Usuario usuario = new Usuario("Juan", "ElBoss", "1234", Jugador, manager);
        Usuario usuario3 = new Usuario("Javi", "Javs", "78946321", Jugador, manager);
        instance.suscribirUsuario(usuario);
        instance.notificarUsuario(desafio);
        for (int i = 0; i < instance.getSuscriptores().size(); i++) {
            assertEquals(desafio, instance.getSuscriptores().get(i).getDesafioPendiente());
        }
        instance.suscribirUsuario(usuario3);
        instance.notificarUsuario(batalla);
        for (int i = 0; i < instance.getSuscriptores().size(); i++) {
            assertEquals(batalla, instance.getSuscriptores().get(i).getCombateRealizado());
        }
    }

    /**
     * Test of getSuscriptores method, of class Publisher.
     */
    @Test
    public void testGetSuscriptores() {
        System.out.println("getSuscriptores");
        Publisher instance = new Publisher();
        ManagerUsuarios manager = new ManagerUsuarios();
        Usuario usuario = new Usuario("Juan", "ElBoss", "1234", Jugador, manager);
        Usuario usuario3 = new Usuario("Javi", "Javs", "78946321", Jugador, manager);
        ArrayList<Usuario> expResult = new ArrayList<>();
        expResult.add(usuario);
        expResult.add(usuario3);
        instance.suscribirUsuario(usuario);
        instance.suscribirUsuario(usuario3);
        
        ArrayList<Usuario> result = instance.getSuscriptores();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuscriptores method, of class Publisher.
     */
    @Test
    public void testSetSuscriptores() {
        System.out.println("setSuscriptores");
        Publisher instance = new Publisher();
        ManagerUsuarios manager = new ManagerUsuarios();
        Usuario usuario = new Usuario("Juan", "ElBoss", "1234", Jugador, manager);
        Usuario usuario3 = new Usuario("Javi", "Javs", "78946321", Jugador, manager);
        ArrayList<Usuario> suscriptores = new ArrayList<>();
        suscriptores.add(usuario);
        suscriptores.add(usuario3);
        instance.setSuscriptores(suscriptores);
        assertEquals(suscriptores, instance.getSuscriptores());
    }

    /**
     * Test of getOperador method, of class Publisher.
     */
    @Test
    public void testGetOperador() {
        System.out.println("getOperador");
        ManagerUsuarios manager = new ManagerUsuarios();
        OperadorSistema operador = new OperadorSistema("Aurora", "Morax", "jajasalu2", OperadorSistema, manager);
        Publisher instance = new Publisher();
        OperadorSistema expResult = operador;
        instance.setOperador(operador);
        OperadorSistema result = instance.getOperador();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperador method, of class Publisher.
     */
    @Test
    public void testSetOperador() {
        System.out.println("setOperador");
        ManagerUsuarios manager = new ManagerUsuarios();
        OperadorSistema operador = new OperadorSistema("Aurora", "Morax", "jajasalu2", OperadorSistema, manager);
        Publisher instance = new Publisher();
        instance.setOperador(operador);
        assertEquals(operador, instance.getOperador());
    }
    
}
