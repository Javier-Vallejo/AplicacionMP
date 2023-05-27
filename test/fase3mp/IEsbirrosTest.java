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
public class IEsbirrosTest {
    
    public IEsbirrosTest() {
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
     * Test of calcularVidaRestante method, of class IEsbirros.
     */
    @Test
    public void testCalcularVidaRestante() {
        System.out.println("calcularVidaRestante");
        IEsbirros instance = new IEsbirrosImpl();
        int expResult = 0;
        int result = instance.calcularVidaRestante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IEsbirrosImpl implements IEsbirros {

        public int calcularVidaRestante() {
            return 0;
        }
    }
    
}
