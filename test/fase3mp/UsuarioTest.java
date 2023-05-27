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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author juana
 */
public class UsuarioTest {
    
    public UsuarioTest() {
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

    public Jugador crearUsuario(){
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = new Jugador("Juan", "Jua", "1234", TipoUsuario.Jugador, manager);
        instance.setEstadoObservador(State.baneado);
        return instance;
    }
    /**
     * Test of getFabricaEsbirros method, of class Usuario.
     */
    @Test
    public void testGetFabricaEsbirros() {
        System.out.println("getFabricaEsbirros");
        Usuario instance = crearUsuario();
        FabricaEsbirros expResult = new FabricaGhoul();
        instance.setFabricaEsbirros(expResult);
        FabricaEsbirros result = instance.getFabricaEsbirros();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDesafioPendiente method, of class Usuario.
     */
    @Test
    public void testGetDesafioPendiente() {
        System.out.println("getDesafioPendiente");
        Usuario instance =crearUsuario();
        Desafio expResult = new Desafio();
        instance.setDesafioPendiente(expResult);
        Desafio result = instance.getDesafioPendiente();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDesafioPendiente method, of class Usuario.
     */
    @Test
    public void testSetDesafioPendiente() {
        System.out.println("setDesafioPendiente");
        Desafio desafioPendiente = new Desafio();
        Usuario instance = crearUsuario();
        instance.setDesafioPendiente(desafioPendiente);
        assertEquals(desafioPendiente, instance.getDesafioPendiente());
    }

    /**
     * Test of getCombateRealizado method, of class Usuario.
     */
    @Test
    public void testGetCombateRealizado() {
        System.out.println("getCombateRealizado");
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearUsuario();
        Jugador jugador2 = new Jugador("saul", "s", "1234", TipoUsuario.Jugador, 0, manager);
        Cazador personaje1 = CrearCazadorBase();
        instance.setPersonajeActivo(personaje1);
        jugador2.setPersonajeActivo(personaje1);
        Combate expResult = new Combate(instance, jugador2, 0);
        instance.setCombateRealizado(expResult);
        Combate result = instance.getCombateRealizado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCombateRealizado method, of class Usuario.
     */
    @Test
    public void testSetCombateRealizado() {
        System.out.println("setCombateRealizado");
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearUsuario();
        Jugador jugador2 = new Jugador("saul", "s", "1234", TipoUsuario.Jugador, 0, manager);
        Cazador personaje1 = CrearCazadorBase();
        instance.setPersonajeActivo(personaje1);
        jugador2.setPersonajeActivo(personaje1);
        Combate combateRealizado = new Combate(instance, jugador2, 0);
        instance.setCombateRealizado(combateRealizado);
        assertEquals(combateRealizado, instance.getCombateRealizado());
    }
    /**
     * Test of getFabricaPersonajes method, of class Usuario.
     */
    @Test
    public void testGetFabricaPersonajes() {
        System.out.println("getFabricaPersonajes");
        Usuario instance = crearUsuario();
        FabricaPersonajes expResult = new FabricaCazador();
        instance.setFabricaPersonajes(expResult);
        FabricaPersonajes result = instance.getFabricaPersonajes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = crearUsuario();
        String expResult = "Juan";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Nauj";
        Usuario instance = crearUsuario();
        String nombreAntiguo = instance.getNombre();
        instance.setNombre(nombre);
        assertNotEquals(nombreAntiguo, instance.getNombre());
    }

    /**
     * Test of getNick method, of class Usuario.
     */
    @Test
    public void testGetNick() {
        System.out.println("getNick");
        Usuario instance = crearUsuario();
        String expResult = "Jua";
        String result = instance.getNick();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNick method, of class Usuario.
     */
    @Test
    public void testSetNick() {
        System.out.println("setNick");
        String nick = "Auj";
        Usuario instance = crearUsuario();
        String nickAntiguo = instance.getNick();
        instance.setNick(nick);
        assertNotEquals(nickAntiguo, instance.getNick());
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuario instance = crearUsuario();
        String expResult = "1234";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "4321";
        Usuario instance = crearUsuario();
        String passwordAntigua = instance.getPassword();
        instance.setPassword(password);
        assertNotEquals(passwordAntigua, instance.getPassword());
    }

    /**
     * Test of getRol method, of class Usuario.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
        Usuario instance = crearUsuario();
        TipoUsuario expResult = TipoUsuario.Jugador;
        TipoUsuario result = instance.getRol();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRol method, of class Usuario.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
        Usuario instance = new Usuario(null, null, null, null, null);
        TipoUsuario rol = TipoUsuario.OperadorSistema;
        instance.setRol(rol);
        assertEquals(instance.getRol(), rol);
    }

    /**
     * Test of getEstadoObservador method, of class Usuario.
     */
    @Test
    public void testGetEstadoObservador() {
        System.out.println("getEstadoObservador");
        Usuario instance = crearUsuario();
        State expResult = State.baneado;
        State result = instance.getEstadoObservador();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEstadoObservador method, of class Usuario.
     */
    @Test
    public void testSetEstadoObservador() {
        System.out.println("setEstadoObservador");
        State estadoObservador = State.noBaneado;
        Usuario instance = crearUsuario();
        instance.setEstadoObservador(estadoObservador);
        assertNotEquals(instance.getEstadoObservador(), State.baneado);
    }

    /**
     * Test of getEntidades method, of class Usuario.
     */
    @Test
    public void testGetEntidades() {
        System.out.println("getEntidades");
        Usuario instance = crearUsuario();
        EntidadesActivas expResult = new EntidadesActivas();
        instance.setEntidades(expResult);
        EntidadesActivas result = instance.getEntidades();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEntidades method, of class Usuario.
     */
    @Test
    public void testSetEntidades() {
        System.out.println("setEntidades");
        EntidadesActivas expResult = new EntidadesActivas();
        Usuario instance = crearUsuario();
        instance.setEntidades(expResult);
        assertEquals(expResult, instance.getEntidades());
    }

    /**
     * Test of getDesafiosAct method, of class Usuario.
     */
    @Test
    public void testGetDesafiosAct() {
        System.out.println("getDesafiosAct");
        Usuario instance = crearUsuario();
        DesafiosActivos expResult = new DesafiosActivos();
        instance.setDesafiosAct(expResult);
        DesafiosActivos result = instance.getDesafiosAct();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDesafiosAct method, of class Usuario.
     */
    @Test
    public void testSetDesafiosAct() {
        System.out.println("setDesafiosAct");
        DesafiosActivos desafiosAct = new DesafiosActivos();
        Usuario instance = crearUsuario();
        instance.setDesafiosAct(desafiosAct);
        assertEquals(desafiosAct, instance.getDesafiosAct());
    }

    /**
     * Test of getManagerUsuarios method, of class Usuario.
     */
    @Test
    public void testGetManagerUsuarios() {
        System.out.println("getManagerUsuarios");
        ManagerUsuarios expResult = new ManagerUsuarios();
        Usuario instance = crearUsuario();
        instance.setManagerUsuarios(expResult);
        ManagerUsuarios result = instance.getManagerUsuarios();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManagerUsuarios method, of class Usuario.
     */
    @Test
    public void testSetManagerUsuarios() {
        System.out.println("setManagerUsuarios");
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Usuario instance = crearUsuario();
        instance.setManagerUsuarios(managerUsuarios);
        assertEquals(instance.getManagerUsuarios(), managerUsuarios);
    }

    /**
     * Test of getRanking method, of class Usuario.
     */
    @Test
    public void testGetRanking() {
        System.out.println("getRanking");
        Usuario instance = crearUsuario();
        Ranking expResult = new Ranking();
        instance.setRanking(expResult);
        Ranking result = instance.getRanking();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRanking method, of class Usuario.
     */
    @Test
    public void testSetRanking() {
        System.out.println("setRanking");
        Ranking ranking = new Ranking();
        Usuario instance = crearUsuario();
        instance.setRanking(ranking);
        assertEquals(instance.getRanking(), ranking);
    }

    /**
     * Test of update method, of class Usuario.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Desafio desafio = new Desafio();
        Jugador instance = crearUsuario();
        instance.update(desafio);
        assertEquals(desafio, instance.getDesafioPendiente());

        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador jugador2 = new Jugador("saul", "s", "1234", TipoUsuario.Jugador, 0, manager);
        Cazador personaje1 = CrearCazadorBase();
        instance.setPersonajeActivo(personaje1);
        jugador2.setPersonajeActivo(personaje1);
        Combate combate = new Combate(instance, jugador2, 0);
        instance.update(combate);
        assertEquals(combate, instance.getCombateRealizado());

    }

    /**
     * Test of DarseDeBaja method, of class Usuario.
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @Test
    public void testDarseDeBaja() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("DarseDeBaja");
        ManagerUsuarios instance = new ManagerUsuarios();
        Usuario usuario = crearUsuario();
        usuario.setManagerUsuarios(instance);
        Method guardarCredenciales = instance.getClass().getDeclaredMethod("guardarCredenciales", Usuario.class);
        guardarCredenciales.setAccessible(true);
        guardarCredenciales.invoke(instance, usuario);

        Method guardarUsuario = instance.getClass().getDeclaredMethod("guardarUsuario", Usuario.class);
        guardarUsuario.setAccessible(true);
        guardarUsuario.invoke(instance, usuario);
        
        usuario.DarseDeBaja(usuario);
        Usuario result = instance.obtenerUsuario(usuario.getNick(), usuario.getPassword());
        assertEquals(result, null);
    }
    
}
