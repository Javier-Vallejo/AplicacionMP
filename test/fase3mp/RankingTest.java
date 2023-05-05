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

    /**
     * Test of consultarRanking method, of class Ranking.
     */
    @Test
    public void testConsultarRanking() {
        System.out.println("consultarRanking");
        Ranking instance = new Ranking();
        instance.consultarRanking();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManager method, of class Ranking.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        Ranking instance = new Ranking();
        ManagerUsuarios expResult = null;
        ManagerUsuarios result = instance.getManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManager method, of class Ranking.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        ManagerUsuarios manager = null;
        Ranking instance = new Ranking();
        instance.setManager(manager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdenados method, of class Ranking.
     */
    @Test
    public void testGetOrdenados() {
        System.out.println("getOrdenados");
        Ranking instance = new Ranking();
        ArrayList<Map<Integer, String>> expResult = null;
        ArrayList<Map<Integer, String>> result = instance.getOrdenados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrdenados method, of class Ranking.
     */
    @Test
    public void testSetOrdenados() {
        System.out.println("setOrdenados");
        ArrayList<Map<Integer, String>> ordenados = null;
        Ranking instance = new Ranking();
        instance.setOrdenados(ordenados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
