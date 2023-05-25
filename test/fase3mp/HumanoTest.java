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

import fase3mp.Humano.nivelLealtad;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 *
 * @author juana
 */
public class HumanoTest {
    
    public HumanoTest() {
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


    public void rellenarPropiedadesEspecSinEscaner(Humano humano, String lealtad) {

        String nivelLeal = "";
        while (!nivelLeal.equals("alta") && !nivelLeal.equals("normal") && !nivelLeal.equals("baja")) {
            System.out.println("Que nivel de lealtad quieres que tenga. Alta, normal o baja");
            nivelLeal = lealtad;
            nivelLeal = nivelLeal.toLowerCase().trim();
            switch (nivelLeal) {
                case "alta" -> {
                    humano.setLealtad(nivelLealtad.ALTA); 
                }
                case "normal" -> {
                    humano.setLealtad(nivelLealtad.NORMAL); 
                }
                case "baja" -> {
                    humano.setLealtad(nivelLealtad.BAJA); 
                }
                default -> {
                    System.out.println("Valor no correcto");
                }
            }
        } 
    }

    public Humano crearHumano(){
        Humano instance = new Humano("humano", 3);
        instance.setLealtad(nivelLealtad.ALTA);
        return instance;
    }
    /**
     * Test of rellenarPropiedadesEspec method, of class Humano.
     */
    @Test
    public void testRellenarPropiedadesEspec() {
        System.out.println("rellenarPropiedadesEspec");
        Humano instance = crearHumano();
        rellenarPropiedadesEspecSinEscaner(instance,"normal");
        assertEquals(instance.getLealtad(),nivelLealtad.NORMAL);
        
    }



    @Test
    public void testRellenarPropiedadesEspecBaja() {
        System.out.println("rellenarPropiedadesEspec");
        Humano instance = crearHumano();
        rellenarPropiedadesEspecSinEscaner(instance,"baja");
        assertEquals(instance.getLealtad(),nivelLealtad.BAJA);
        
    }


    @Test
    public void testRellenarPropiedadesEspecAlta() {
        System.out.println("rellenarPropiedadesEspec");
        Humano instance = crearHumano();
        rellenarPropiedadesEspecSinEscaner(instance,"alta");
        assertEquals(instance.getLealtad(),nivelLealtad.ALTA);
        
    }

   
    /**
     * Test of getLealtad method, of class Humano.
     */
    @Test
    public void testGetLealtad() {
        System.out.println("getLealtad");
        Humano instance = crearHumano();
        Humano.nivelLealtad expResult = nivelLealtad.ALTA;
        Humano.nivelLealtad result = instance.getLealtad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLealtad method, of class Humano.
     */
    @Test
    public void testSetLealtad() {
        System.out.println("setLealtad");
        Humano.nivelLealtad lealtad = nivelLealtad.BAJA;
        Humano instance = crearHumano();
        Humano.nivelLealtad lealtadAntigua = instance.getLealtad();
        instance.setLealtad(lealtad);
        assertNotEquals(lealtadAntigua, instance.getLealtad());
    }
    
}
