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
import org.junit.internal.runners.JUnit38ClassRunner;

import static org.junit.Assert.*;

/**
 *
 * @author juana
 */
public class OperadorSistemaTest {

    public OperadorSistemaTest() {
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
     * Test of getNotificador method, of class OperadorSistema.
     */

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

    public OperadorSistema CrearOperador() {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        managerUsuarios.CrearJugador("nombre", "A", "a", TipoUsuario.Jugador, null, 100);
        OperadorSistema instance = new OperadorSistema("operador", "ope", "123", TipoUsuario.OperadorSistema,
                managerUsuarios);
        Publisher expResult = new Publisher();
        instance.setNotificador(expResult);
        instance.setManagerUsuarios(managerUsuarios);
        return instance;
    }

    @Test
    public void testGetNotificador() {
        System.out.println("getNotificador");
        OperadorSistema instance = CrearOperador();
        Publisher expResult = new Publisher();
        instance.setNotificador(expResult);
        assertEquals(expResult, instance.getNotificador());

    }

    /**
     * Test of setNotificador method, of class OperadorSistema.
     */
    @Test
    public void testSetNotificador() {
        System.out.println("setNotificador");
        OperadorSistema instance = CrearOperador();
        Publisher notificadorViejo = instance.getNotificador();
        Publisher notificador = new Publisher();
        instance.setNotificador(notificador);
        assertNotEquals(instance.getNotificador(), notificadorViejo);
    }

    /**
     * Test of getManager method, of class OperadorSistema.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        OperadorSistema instance = CrearOperador();
        ManagerUsuarios antiguoManager = instance.getManagerUsuarios();
        ManagerUsuarios expResult = new ManagerUsuarios();
        assertNotEquals(expResult.getUsuariosRegistrados().size(), antiguoManager.getUsuariosRegistrados().size());

    }

    /**
     * Test of setManager method, of class OperadorSistema.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        OperadorSistema instance = CrearOperador();
        ManagerUsuarios antiguoManager = instance.getManagerUsuarios();
        ManagerUsuarios manager = new ManagerUsuarios();
        instance.setManager(manager);
        assertNotEquals(antiguoManager.getUsuariosRegistrados(), instance.getManager().getUsuariosRegistrados());
    }

    /**
     * Test of imprimirListaUsuariosDesbaneadosBaneados method, of class
     * OperadorSistema.
     */
    @Test
    public void testImprimirListaUsuariosDesbaneadosBaneados() {
        System.out.println("imprimirListaUsuariosDesbaneadosBaneados");
        ArrayList<Usuario> usuarioEle = new ArrayList<>();
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador usuario = new Jugador("a", "A", "q11", TipoUsuario.Jugador, managerUsuarios);
        Jugador usuario2 = new Jugador("c", "c", "qas11", TipoUsuario.Jugador, managerUsuarios);
        usuarioEle.add(usuario);
        usuarioEle.add(usuario2);
        int opcion = 0;
        OperadorSistema instance = CrearOperador();
        instance.imprimirListaUsuariosDesbaneadosBaneados(usuarioEle, opcion);
    }

    /**
     * Test of listarDebilidades method, of class OperadorSistema.
     */
    @Test
    public void testListarDebilidades() {
        System.out.println("listarDebilidades");
        Cazador cazador = CrearCazadorBase();
        Debilidad[] d = cazador.getDebilidades();
        OperadorSistema instance = CrearOperador();
        instance.listarDebilidades(d);
    }

    /**
     * Test of listarFortalezas method, of class OperadorSistema.
     */
    @Test
    public void testListarFortalezas() {
        System.out.println("listarFortalezas");
        Cazador cazador = CrearCazadorBase();
        Fortaleza[] f = cazador.getFortalezas();
        OperadorSistema instance = CrearOperador();
        instance.listarFortalezas(f);
    }
}
