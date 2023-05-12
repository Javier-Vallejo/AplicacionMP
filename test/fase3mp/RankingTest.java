/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import static fase3mp.TipoUsuario.Jugador;
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
public class RankingTest {
    
    public RankingTest() {
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

    public enum TipoUsuario {Jugador, OperadorSistema}
    

    /**
     * Test of getManager method, of class Ranking.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        Ranking instance = new Ranking();
        ManagerUsuarios expResult = new ManagerUsuarios();
        instance.setManager(expResult);
        ManagerUsuarios result = instance.getManager();
        assertEquals(expResult, result);
        Usuario user1 = new Usuario("Juan", "ElBoss", "1234", Jugador, expResult);
        //Method guardarUsuario = expResult.getClass().getDeclaredMethod("guardarUsuario", new Class[]{Usuario.class});
        expResult.getUsuariosRegistrados().add(user1);
        instance.setManager(expResult);
        result = instance.getManager();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManager method, of class Ranking.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        ManagerUsuarios expResult = new ManagerUsuarios();
        Usuario user1 = new Usuario("Juan", "ElBoss", "1234", Jugador, expResult);
        //Method guardarUsuario = expResult.getClass().getDeclaredMethod("guardarUsuario", new Class[]{Usuario.class});
        expResult.getUsuariosRegistrados().add(user1);
        Ranking instance = new Ranking();
        instance.setManager(expResult);
        assertEquals(expResult, instance.getManager());
        
    }

    
    
}
