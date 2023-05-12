/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
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

    /**
     * Test of getCredencialesUsuarios method, of class ManagerUsuarios.
     */
    @Test
    public void testGetCredencialesUsuarios() {
        System.out.println("getCredencialesUsuarios");
        ManagerUsuarios instance = new ManagerUsuarios();
        ArrayList<Map<String, String>> expResult = null;
        ArrayList<Map<String, String>> result = instance.getCredencialesUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuariosRegistrados method, of class ManagerUsuarios.
     */
    @Test
    public void testGetUsuariosRegistrados() {
        System.out.println("getUsuariosRegistrados");
        ManagerUsuarios instance = new ManagerUsuarios();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getUsuariosRegistrados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CrearJugador method, of class ManagerUsuarios.
     */
    @Test
    public void testCrearJugador() {
        System.out.println("CrearJugador");
        String nombre = "";
        String nick = "";
        String password = "";
        TipoUsuario rol = null;
        State estadoObservador = null;
        int oro = 0;
        ManagerUsuarios instance = new ManagerUsuarios();
        Jugador expResult = null;
        Jugador result = instance.CrearJugador(nombre, nick, password, rol, estadoObservador, oro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CrearOperador method, of class ManagerUsuarios.
     */
    @Test
    public void testCrearOperador() {
        System.out.println("CrearOperador");
        String nombre = "";
        String nick = "";
        String password = "";
        TipoUsuario rol = null;
        State estadoObservador = null;
        ManagerUsuarios instance = new ManagerUsuarios();
        OperadorSistema expResult = null;
        OperadorSistema result = instance.CrearOperador(nombre, nick, password, rol, estadoObservador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeUsuario method, of class ManagerUsuarios.
     */
    @Test
    public void testExisteUsuario() {
        System.out.println("existeUsuario");
        ManagerUsuarios instance = new ManagerUsuarios();
        Boolean result = instance.existeUsuario("megaboy", "123");
        Boolean result2 = instance.existeUsuario("negaboy", "123");
        Boolean result3 = instance.existeUsuario("megaboy", "4567689");
        Boolean result4 = instance.existeUsuario(" ", "\n");
        assertEquals(true, result);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
    }

    /**
     * Test of obtenerUsuario method, of class ManagerUsuarios.
     */
    @Test
    public void testObtenerUsuario() {
        System.out.println("obtenerUsuario");
        String nick = "";
        String password = "";
        ManagerUsuarios instance = new ManagerUsuarios();
        Usuario expResult = null;
        Usuario result = instance.obtenerUsuario(nick, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarUsuario method, of class ManagerUsuarios.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        String nick = "";
        String password = "";
        ManagerUsuarios instance = new ManagerUsuarios();
        instance.eliminarUsuario(nick, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     */
    @Test
    public void testExisteNumRegistro() {
        System.out.println("existeNumRegistro");
        String numRegistro = "";
        ManagerUsuarios instance = new ManagerUsuarios();
        boolean expResult = false;
        boolean result = instance.existeNumRegistro(numRegistro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
