/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
public class ManagerUsuariosTest {

    public ManagerUsuariosTest() {
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

    public Usuario crearUsuario() {
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = new Jugador("Juan", "ElBoss", "1234", TipoUsuario.Jugador, manager);
        instance.setNumeroRegistro("1234567");
        return instance;
    }

    /**
     * Test of getCredencialesUsuarios method, of class ManagerUsuarios.
     * 
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @Test
    public void testGetCredencialesUsuarios() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("getCredencialesUsuarios");
        ManagerUsuarios instance = new ManagerUsuarios();
        Usuario usuario = crearUsuario();
        Map<String, String> credenciales = new HashMap<>();
        credenciales.put(usuario.getNick(), usuario.getPassword());
        ArrayList<Map<String, String>> expResult = new ArrayList<>();
        expResult.add(credenciales);

        Method guardarCredenciales = instance.getClass().getDeclaredMethod("guardarCredenciales", Usuario.class);
        guardarCredenciales.setAccessible(true);
        guardarCredenciales.invoke(instance, usuario);

        ArrayList<Map<String, String>> result = instance.getCredencialesUsuarios();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsuariosRegistrados method, of class ManagerUsuarios.
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @Test
    public void testGetUsuariosRegistrados() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("getUsuariosRegistrados");
        ManagerUsuarios instance = new ManagerUsuarios();
        Usuario usuario = crearUsuario();
        ArrayList<Usuario> expResult = new ArrayList<>();
        expResult.add(usuario);

        Method guardarUsuario = instance.getClass().getDeclaredMethod("guardarUsuario", Usuario.class);
        guardarUsuario.setAccessible(true);
        guardarUsuario.invoke(instance, usuario);

        ArrayList<Usuario> result = instance.getUsuariosRegistrados();
        assertEquals(expResult, result);
    }

    /**
     * Test of CrearJugador method, of class ManagerUsuarios.
     */
    @Test
    public void testCrearJugador() {
        System.out.println("CrearJugador");
        String nombre = "jugador";
        String nick = "usuario";
        String password = "12345";
        TipoUsuario rol = TipoUsuario.Jugador;
        State estadoObservador = null;
        int oro = 30;
        ManagerUsuarios instance = new ManagerUsuarios();
        Jugador result = instance.CrearJugador(nombre, nick, password, rol, estadoObservador, oro);
        assertEquals(nombre, result.getNombre());
        assertEquals(nick, result.getNick());
        assertEquals(password, result.getPassword());
        assertEquals(rol, result.getRol());
        assertEquals(oro, result.getOro());
    }

    /**
     * Test of CrearOperador method, of class ManagerUsuarios.
     */
    @Test
    public void testCrearOperador() {
        System.out.println("CrearOperador");
        String nombre = "operador";
        String nick = "usuario";
        String password = "12345";
        TipoUsuario rol = TipoUsuario.OperadorSistema;
        State estadoObservador = null;
        ManagerUsuarios instance = new ManagerUsuarios();
        OperadorSistema result = instance.CrearOperador(nombre, nick, password, rol, estadoObservador);
        assertEquals(nombre, result.getNombre());
        assertEquals(nick, result.getNick());
        assertEquals(password, result.getPassword());
        assertEquals(rol, result.getRol());
    }

    /**
     * Test of existeUsuario method, of class ManagerUsuarios.
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @Test
    public void testExisteUsuario() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("existeUsuario");
        ManagerUsuarios instance = new ManagerUsuarios();
        Usuario usuario = crearUsuario();

        Method guardarCredenciales = instance.getClass().getDeclaredMethod("guardarCredenciales", Usuario.class);
        guardarCredenciales.setAccessible(true);
        guardarCredenciales.invoke(instance, usuario);

        Boolean result = instance.existeUsuario("ElBoss", "1234");
        Boolean result2 = instance.existeUsuario("Niggaboy", "123");
        assertEquals(true, result);
        assertEquals(false, result2);
    }

    /**
     * Test of obtenerUsuario method, of class ManagerUsuarios.
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @Test
    public void testObtenerUsuario() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("obtenerUsuario");
        String nick = "ElBoss";
        String password = "1234";
        ManagerUsuarios instance = new ManagerUsuarios();
        Usuario usuario = crearUsuario();

        Method guardarCredenciales = instance.getClass().getDeclaredMethod("guardarCredenciales", Usuario.class);
        guardarCredenciales.setAccessible(true);
        guardarCredenciales.invoke(instance, usuario);

        Method guardarUsuario = instance.getClass().getDeclaredMethod("guardarUsuario", Usuario.class);
        guardarUsuario.setAccessible(true);
        guardarUsuario.invoke(instance, usuario);

        Usuario result = instance.obtenerUsuario(nick, password);
        assertEquals(usuario, result);
    }

    /**
     * Test of eliminarUsuario method, of class ManagerUsuarios.
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @Test
    public void testEliminarUsuario() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("eliminarUsuario");
        String nick = "ElBoss";
        String password = "1234";
        ManagerUsuarios instance = new ManagerUsuarios();
        Usuario usuario = crearUsuario();

        Method guardarCredenciales = instance.getClass().getDeclaredMethod("guardarCredenciales", Usuario.class);
        guardarCredenciales.setAccessible(true);
        guardarCredenciales.invoke(instance, usuario);

        Method guardarUsuario = instance.getClass().getDeclaredMethod("guardarUsuario", Usuario.class);
        guardarUsuario.setAccessible(true);
        guardarUsuario.invoke(instance, usuario);
        
        instance.eliminarUsuario(nick, password);
        Usuario result = instance.obtenerUsuario(nick, password);
        assertEquals(result, null);
    }

    /**
     * Test of LeerUsuarios method, of class ManagerUsuarios.
     */
    @Test
    public void testLeerUsuarios() throws Exception {
        System.out.println("LeerUsuarios");
        EntidadesActivas entidades = null;
        ManagerUsuarios instance = new ManagerUsuarios();
        instance.LeerUsuarios(entidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarUsuariosFichero method, of class ManagerUsuarios.
     */
    @Test
    public void testGuardarUsuariosFichero() throws Exception {
        System.out.println("guardarUsuariosFichero");
        Usuario usuario = null;
        ManagerUsuarios instance = new ManagerUsuarios();
        instance.guardarUsuariosFichero(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarStringBuilderUsuario method, of class ManagerUsuarios.
     */
    @Test
    public void testRellenarStringBuilderUsuario() {
        System.out.println("rellenarStringBuilderUsuario");
        StringBuilder sb = null;
        Usuario usuario = null;
        ManagerUsuarios instance = new ManagerUsuarios();
        instance.rellenarStringBuilderUsuario(sb, usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarUsuarioEnFichero method, of class ManagerUsuarios.
     */
    @Test
    public void testEditarUsuarioEnFichero() {
        System.out.println("editarUsuarioEnFichero");
        String nick = "";
        String password = "";
        ManagerUsuarios instance = new ManagerUsuarios();
        instance.editarUsuarioEnFichero(nick, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeNumRegistro method, of class ManagerUsuarios.
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @Test
    public void testExisteNumRegistro() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("existeNumRegistro");
        String numRegistro = "1234567";
        ManagerUsuarios instance = new ManagerUsuarios();
        Usuario usuario = crearUsuario();

        Method guardarCredenciales = instance.getClass().getDeclaredMethod("guardarCredenciales", Usuario.class);
        guardarCredenciales.setAccessible(true);
        guardarCredenciales.invoke(instance, usuario);

        Method guardarUsuario = instance.getClass().getDeclaredMethod("guardarUsuario", Usuario.class);
        guardarUsuario.setAccessible(true);
        guardarUsuario.invoke(instance, usuario);
        
        boolean expResult = true;
        boolean result = instance.existeNumRegistro(numRegistro);
        assertEquals(expResult, result);
        numRegistro = "7654321";
        expResult = false;
        result = instance.existeNumRegistro(numRegistro);
        assertEquals(expResult, result);
    }

}
