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
public class ComparadorDeJugadoresTest {
    
    public ComparadorDeJugadoresTest() {
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
     * Test of compare method, of class ComparadorDeJugadores.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador user1 = new Jugador("a", "A", "123",TipoUsuario.Jugador , 10, managerUsuarios);
        Jugador user2 = new Jugador("B", "b", "123",TipoUsuario.Jugador , 20, managerUsuarios);
        ComparadorDeJugadores instance = new ComparadorDeJugadores();
        int expResult = 1;
        int result = instance.compare(user1, user2);
        /*
         *  como user 2 tiene mas oro que user 1 el resultado esperado es 1
         */
        assertEquals(expResult, result);
       
    }
    
}
