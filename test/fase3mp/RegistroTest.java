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
public class RegistroTest {
    
    public RegistroTest() {
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
     * Test of getManager method, of class Registro.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Registro instance = new Registro(managerUsuarios);
        ManagerUsuarios result = instance.getManager();
        assertEquals(managerUsuarios, result);
       
    }

    /**
     * Test of setManager method, of class Registro.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        ManagerUsuarios manager = new ManagerUsuarios();
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        managerUsuarios.CrearJugador("null", "null", "null", TipoUsuario.Jugador, null, 10);
        Registro instance = new Registro(manager);
        instance.setManager(managerUsuarios);
        assertNotEquals(instance.getManager().getUsuariosRegistrados().size(),manager.getUsuariosRegistrados().size());
    }

    /**
     * Test of registrarse method, of class Registro.
     */
    @Test
    public void testRegistrarse() {
        System.out.println("registrarse");
        ManagerUsuarios manager = new ManagerUsuarios();
        Registro instance = new Registro(null);
        Usuario result = instance.registrarse(TipoUsuario.Jugador);
        assertEquals(null, result);
       
    }
    
}
