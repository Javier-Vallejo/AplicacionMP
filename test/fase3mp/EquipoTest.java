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
public class EquipoTest {
    
    public EquipoTest() {
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

    public Equipo CrearEquipoBase(){
        Equipo equipoX = new Equipo();
        equipoX.setNombre("EquipacionAlfa");
        equipoX.setModDanio(5);
        equipoX.setModDefensa(3);
        return equipoX;
    }
    /**
     * Test of getNombre method, of class Equipo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Equipo instance = CrearEquipoBase();
        String expResult = "EquipacionAlfa";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        assertNotEquals("EquipamientoOmega", result);
    }

    /**
     * Test of setNombre method, of class Equipo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "EquipamientoOmega";
        Equipo instance = CrearEquipoBase();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    /**
     * Test of getModDanio method, of class Equipo.
     */
    @Test
    public void testGetModDanio() {
        System.out.println("getModDanio");
        Equipo instance = CrearEquipoBase();
        int expResult = 5;
        int result = instance.getModDanio();
        assertEquals(expResult, result);
        assertNotEquals(2, result);
    }

    /**
     * Test of setModDanio method, of class Equipo.
     */
    @Test
    public void testSetModDanio() {
        System.out.println("setModDanio");
        int modDanio = 1;
        Equipo instance = CrearEquipoBase();
        instance.setModDanio(modDanio);
        assertEquals(modDanio, instance.getModDanio());
        assertNotEquals(5, instance.getModDanio());
    }

    /**
     * Test of getModDefensa method, of class Equipo.
     */
    @Test
    public void testGetModDefensa() {
        System.out.println("getModDefensa");
        Equipo instance = CrearEquipoBase();
        int expResult = 0;
        int result = instance.getModDefensa();
        assertNotEquals(expResult, result);
        assertEquals(3, result);
    }

    /**
     * Test of setModDefensa method, of class Equipo.
     */
    @Test
    public void testSetModDefensa() {
        System.out.println("setModDefensa");
        int modDefensa = 6;
        Equipo instance = new Equipo();
        instance.setModDefensa(modDefensa);
        assertEquals(modDefensa, instance.getModDefensa());
    }   
}
