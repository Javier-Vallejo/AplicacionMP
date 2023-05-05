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
    @Test
    public void testGetNotificador() {
        System.out.println("getNotificador");
        OperadorSistema instance = null;
        Publisher expResult = null;
        Publisher result = instance.getNotificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotificador method, of class OperadorSistema.
     */
    @Test
    public void testSetNotificador() {
        System.out.println("setNotificador");
        Publisher notificador = null;
        OperadorSistema instance = null;
        instance.setNotificador(notificador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManager method, of class OperadorSistema.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        OperadorSistema instance = null;
        ManagerUsuarios expResult = null;
        ManagerUsuarios result = instance.getManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManager method, of class OperadorSistema.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        ManagerUsuarios manager = null;
        OperadorSistema instance = null;
        instance.setManager(manager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CrearArma method, of class OperadorSistema.
     */
    @Test
    public void testCrearArma() throws Exception {
        System.out.println("CrearArma");
        String nombre = "";
        String modDanio = "";
        String modDefensa = "";
        String tipoArma = "";
        OperadorSistema instance = null;
        Arma expResult = null;
        Arma result = instance.CrearArma(nombre, modDanio, modDefensa, tipoArma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CrearArmadura method, of class OperadorSistema.
     */
    @Test
    public void testCrearArmadura() throws Exception {
        System.out.println("CrearArmadura");
        String nombre = "";
        String modDanio = "";
        String modDefensa = "";
        OperadorSistema instance = null;
        Armadura expResult = null;
        Armadura result = instance.CrearArmadura(nombre, modDanio, modDefensa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizarFuncionMenuOperador method, of class OperadorSistema.
     */
    @Test
    public void testRealizarFuncionMenuOperador() throws Exception {
        System.out.println("realizarFuncionMenuOperador");
        int opcion = 0;
        OperadorSistema instance = null;
        instance.realizarFuncionMenuOperador(opcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarPersonajeEditado method, of class OperadorSistema.
     */
    @Test
    public void testGuardarPersonajeEditado() {
        System.out.println("guardarPersonajeEditado");
        Personaje personaje = null;
        OperadorSistema instance = null;
        instance.guardarPersonajeEditado(personaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirListaUsuariosDesbaneadosBaneados method, of class OperadorSistema.
     */
    @Test
    public void testImprimirListaUsuariosDesbaneadosBaneados() {
        System.out.println("imprimirListaUsuariosDesbaneadosBaneados");
        ArrayList<Usuario> usuarioEle = null;
        int opcion = 0;
        OperadorSistema instance = null;
        instance.imprimirListaUsuariosDesbaneadosBaneados(usuarioEle, opcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarDebilidades method, of class OperadorSistema.
     */
    @Test
    public void testListarDebilidades() {
        System.out.println("listarDebilidades");
        Debilidad[] d = null;
        OperadorSistema instance = null;
        instance.listarDebilidades(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFortalezas method, of class OperadorSistema.
     */
    @Test
    public void testListarFortalezas() {
        System.out.println("listarFortalezas");
        Fortaleza[] f = null;
        OperadorSistema instance = null;
        instance.listarFortalezas(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
