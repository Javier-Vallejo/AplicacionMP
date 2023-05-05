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

    /**
     * Test of getFabricaEsbirros method, of class Usuario.
     */
    @Test
    public void testGetFabricaEsbirros() {
        System.out.println("getFabricaEsbirros");
        Usuario instance = null;
        FabricaEsbirros expResult = null;
        FabricaEsbirros result = instance.getFabricaEsbirros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesafioPendiente method, of class Usuario.
     */
    @Test
    public void testGetDesafioPendiente() {
        System.out.println("getDesafioPendiente");
        Usuario instance = null;
        Desafio expResult = null;
        Desafio result = instance.getDesafioPendiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesafioPendiente method, of class Usuario.
     */
    @Test
    public void testSetDesafioPendiente() {
        System.out.println("setDesafioPendiente");
        Desafio desafioPendiente = null;
        Usuario instance = null;
        instance.setDesafioPendiente(desafioPendiente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCombateRealizado method, of class Usuario.
     */
    @Test
    public void testGetCombateRealizado() {
        System.out.println("getCombateRealizado");
        Usuario instance = null;
        Combate expResult = null;
        Combate result = instance.getCombateRealizado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCombateRealizado method, of class Usuario.
     */
    @Test
    public void testSetCombateRealizado() {
        System.out.println("setCombateRealizado");
        Combate combateRealizado = null;
        Usuario instance = null;
        instance.setCombateRealizado(combateRealizado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFabricaPersonajes method, of class Usuario.
     */
    @Test
    public void testGetFabricaPersonajes() {
        System.out.println("getFabricaPersonajes");
        Usuario instance = null;
        FabricaPersonajes expResult = null;
        FabricaPersonajes result = instance.getFabricaPersonajes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNick method, of class Usuario.
     */
    @Test
    public void testGetNick() {
        System.out.println("getNick");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getNick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNick method, of class Usuario.
     */
    @Test
    public void testSetNick() {
        System.out.println("setNick");
        String nick = "";
        Usuario instance = null;
        instance.setNick(nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Usuario instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRol method, of class Usuario.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
        Usuario instance = null;
        TipoUsuario expResult = null;
        TipoUsuario result = instance.getRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRol method, of class Usuario.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
        TipoUsuario rol = null;
        Usuario instance = null;
        instance.setRol(rol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoObservador method, of class Usuario.
     */
    @Test
    public void testGetEstadoObservador() {
        System.out.println("getEstadoObservador");
        Usuario instance = null;
        State expResult = null;
        State result = instance.getEstadoObservador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoObservador method, of class Usuario.
     */
    @Test
    public void testSetEstadoObservador() {
        System.out.println("setEstadoObservador");
        State estadoObservador = null;
        Usuario instance = null;
        instance.setEstadoObservador(estadoObservador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidades method, of class Usuario.
     */
    @Test
    public void testGetEntidades() {
        System.out.println("getEntidades");
        Usuario instance = null;
        EntidadesActivas expResult = null;
        EntidadesActivas result = instance.getEntidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidades method, of class Usuario.
     */
    @Test
    public void testSetEntidades() {
        System.out.println("setEntidades");
        EntidadesActivas entidades = null;
        Usuario instance = null;
        instance.setEntidades(entidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesafiosAct method, of class Usuario.
     */
    @Test
    public void testGetDesafiosAct() {
        System.out.println("getDesafiosAct");
        Usuario instance = null;
        DesafiosActivos expResult = null;
        DesafiosActivos result = instance.getDesafiosAct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesafiosAct method, of class Usuario.
     */
    @Test
    public void testSetDesafiosAct() {
        System.out.println("setDesafiosAct");
        DesafiosActivos desafiosAct = null;
        Usuario instance = null;
        instance.setDesafiosAct(desafiosAct);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManagerUsuarios method, of class Usuario.
     */
    @Test
    public void testGetManagerUsuarios() {
        System.out.println("getManagerUsuarios");
        Usuario instance = null;
        ManagerUsuarios expResult = null;
        ManagerUsuarios result = instance.getManagerUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManagerUsuarios method, of class Usuario.
     */
    @Test
    public void testSetManagerUsuarios() {
        System.out.println("setManagerUsuarios");
        ManagerUsuarios managerUsuarios = null;
        Usuario instance = null;
        instance.setManagerUsuarios(managerUsuarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRanking method, of class Usuario.
     */
    @Test
    public void testGetRanking() {
        System.out.println("getRanking");
        Usuario instance = null;
        Ranking expResult = null;
        Ranking result = instance.getRanking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRanking method, of class Usuario.
     */
    @Test
    public void testSetRanking() {
        System.out.println("setRanking");
        Ranking ranking = null;
        Usuario instance = null;
        instance.setRanking(ranking);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Usuario.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Object objeto = null;
        Usuario instance = null;
        instance.update(objeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DarseDeBaja method, of class Usuario.
     */
    @Test
    public void testDarseDeBaja() {
        System.out.println("DarseDeBaja");
        Usuario usuario = null;
        Usuario instance = null;
        instance.DarseDeBaja(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
