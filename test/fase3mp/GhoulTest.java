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
public class GhoulTest {
    
    public GhoulTest() {
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

    public Ghoul crearGhoul () {

        Ghoul instance = new Ghoul("ghoul", 3);
        instance.setDependencia(3);
        return instance;

    }


    public void rellenarPropiedadesEspecSinEscanner (Ghoul ghoul) {
        System.out.println("Introduzca el valor de dependencia: ");
        int antiguaDependencia = ghoul.getDependencia();
        System.out.println("Valor antiguo de depencia: "+ antiguaDependencia);
        
        int valorDependencia = 4;
        ghoul.setDependencia(valorDependencia); 
        System.out.println("Valor nuevo de depencia: "+ ghoul.getDependencia());
        assertNotEquals(antiguaDependencia,ghoul.getDependencia());
    }

    /**
     * Test of rellenarPropiedadesEspec method, of class Ghoul.
     */
    @Test
    public void testRellenarPropiedadesEspec() {
        System.out.println("rellenarPropiedadesEspec");
        Ghoul instance = crearGhoul();
        rellenarPropiedadesEspecSinEscanner(instance);
        
    }

    
   

    /**
     * Test of setDependencia method, of class Ghoul.
     */
    @Test
    public void testSetDependencia() {
        System.out.println("setDependencia");
        int dependencia = 5;
        Ghoul instance = crearGhoul();
        int dependenciaAntigua = instance.getDependencia();
        instance.setDependencia(dependencia);
        assertNotEquals(dependenciaAntigua,instance.getDependencia());
    }

    /**
     * Test of getDependencia method, of class Ghoul.
     */
    @Test
    public void testGetDependencia() {
        System.out.println("getDependencia");
        Ghoul instance = crearGhoul();
        int expResult = 3;
        int result = instance.getDependencia();
        assertEquals(expResult, result);
    }
    
}
