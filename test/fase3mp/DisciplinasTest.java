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
public class DisciplinasTest {
    
    public DisciplinasTest() {
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

    public Disciplinas crearDisciplinas(){
        Disciplinas instance = new Disciplinas("disciplinas", 3, 3, 3);
        return instance;
    }
    /**
     * Test of activar method, of class Disciplinas.
     */
    @Test
    public void testActivar() {
        System.out.println("activar");
        String opcion = "Ataque";
        Disciplinas instance = crearDisciplinas();
        int expResult = 15;
        int result = instance.activar(opcion);
        assertEquals(expResult, result);
        opcion = "Defensa";
        expResult = 10;
        result = instance.activar(opcion);
        assertEquals(expResult, result);

    }
    
}
